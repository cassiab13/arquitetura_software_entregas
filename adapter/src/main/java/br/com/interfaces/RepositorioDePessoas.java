package br.com.interfaces;

import br.com.entities.Pessoa;
import java.io.Reader;
import java.util.List;

public interface RepositorioDePessoas {
    List<Pessoa> listarPessoas();
}
