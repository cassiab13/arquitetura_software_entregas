package br.com.adapter;

import br.com.entities.Pessoa;
import br.com.interfaces.RepositorioDePessoas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PessoaCsvAdapter implements RepositorioDePessoas {
    private final String caminhoCsv;

    public PessoaCsvAdapter(String caminhoCsv){
        this.caminhoCsv = caminhoCsv;
    }

    @Override
    public List<Pessoa> listarPessoas() {

        List<Pessoa> pessoas = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoCsv))){
            String line;
            boolean firstLine = true;

            while((line = bufferedReader.readLine()) != null){
                if(firstLine){
                    firstLine = false;
                    continue;
                }
                String[] fields = line.split(",");

                if(fields.length >= 3){
                    String name = fields[0].trim();
                    int age = Integer.parseInt(fields[1].trim());
                    String email = fields[2].trim();

                    pessoas.add(new Pessoa(name, age, email));
                }
            }
        } catch(Exception e){
            System.out.println("Ocorreu um erro ao ler o CSV: " + e.getMessage());
        }

        return pessoas;
    }
}
