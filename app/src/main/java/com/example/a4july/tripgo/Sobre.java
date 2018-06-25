package com.example.a4july.tripgo;

public class Sobre {
    private String titulo;
    private String resposta;

    public String getTitulo() {
        return titulo;
    }

    public String getResposta() {
        return resposta;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Sobre(String titulo, String resposta){
        this.titulo = titulo;
        this.resposta = resposta;

    }
}
