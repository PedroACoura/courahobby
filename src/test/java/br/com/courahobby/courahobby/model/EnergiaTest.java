package br.com.courahobby.courahobby.model;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class EnergiaTest {
    @Test
    public void precoEnergia(){
        //cenario
        Energia energia = new Energia();

        //acao
        energia.setPrecoKw(0.99f);

        //verificacao
        Assert.assertEquals(0.99, energia.getPrecoKw(), 0.01);
    }
}
