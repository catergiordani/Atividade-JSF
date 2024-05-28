package br.com.cadUser;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<String> nomesDigitados;

    public Pessoa() {
        nomesDigitados = new ArrayList<>();
    }

    // Getter e Setter para o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo nomesDigitados
    public List<String> getNomesDigitados() {
        return nomesDigitados;
    }

    // Método para adicionar um nome à lista de nomesDigitados
    public void adicionarNomeDigitado() {
        nomesDigitados.add(nome);
    }
}