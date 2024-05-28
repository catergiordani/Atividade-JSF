package br.com.cadUser;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UsuarioBean {
    private String nome;
    private List<String> nomesCadastrados = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomesCadastrados() {
        return nomesCadastrados;
    }

    public void cadastrar() {
        nomesCadastrados.add(nome);
        nome = ""; // Limpar o campo de nome após cadastrar
    }
}