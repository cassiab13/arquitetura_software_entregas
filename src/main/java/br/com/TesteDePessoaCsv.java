package br.com;

import br.com.adapter.PessoaCsvAdapter;
import br.com.entities.Pessoa;

import java.io.FileReader;
import java.util.List;

public class TesteDePessoaCsv {
    public static void main(String[] args) {

        try{
            String caminhoCsv = "pessoa.csv";
            PessoaCsvAdapter adapter = new PessoaCsvAdapter(caminhoCsv);
            List<Pessoa> pessoas = adapter.listarPessoas();

            pessoas.forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}