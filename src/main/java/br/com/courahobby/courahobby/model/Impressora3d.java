package br.com.courahobby.courahobby.model;

import lombok.Getter;

@Getter
public class Impressora3d {

    private int codigo = 0;
    private String nome;
    private float potencia;
    private float consumo;
    private float preco;

    public void setImpressora3d(String nome, float potencia, float consumo, float preco){
        this.nome = nome;
        this.potencia = potencia;
        this.consumo = consumo;
        this.preco = preco;
        this.codigo++;
    }
}