package com.example.a4july.tripgo;

public class Home {
    private String nome;
    private String pais;
    private String estado;
    private String endereco;
    private String price;
    private String classe;
    private String descricao;
    private String img;

    public Home(String nome, String pais, String estado, String endereco, String price, String classe, String descricao, String img) {
        this.nome = nome;
        this.pais = pais;
        this.estado = estado;
        this.endereco = endereco;
        this.price = price;
        this.classe = classe;
        this.descricao = descricao;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
