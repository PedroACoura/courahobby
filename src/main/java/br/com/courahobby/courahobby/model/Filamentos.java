package br.com.courahobby.courahobby.model;

import lombok.Getter;

@Getter
public class Filamentos {
    private int code;
    private String tipo;
    private String descricao;
    private String fabricante;
    private float valorKg;
    private float valorG;
    private float dencidade;
    private float diametro;

    public void Filamento(String tipo, String descricao, String fabricante, float valorKg) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.valorKg = valorKg;
        this.valorG = getValorG(valorKg);
        this.code++;
        this.dencidade = getDencidade(tipo);
        this.diametro = 1.75f;
    }
    public float getValorG(float valorKg) {
        return valorG = this.valorKg/1000;
    }

    public float getDencidade(String tipo){
        switch (tipo) {
            case "PLA":
                this.dencidade = 1.24f;
                break;
            case "ABS":
                this.dencidade = 1.04f;
                break;
            case "ABS ENGENHARIA":
                this.dencidade = 1.04f;
                break;
        }
        return this.dencidade;
    }
}
