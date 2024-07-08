package br.com.courahobby.courahobby.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Impressora3dTest {

    Impressora3d impressora3d = new Impressora3d();

    @Before
    public void setup(){
        impressora3d.setImpressora3d("Ender 3", 360.0f, 0.36f, 1661.26f);
    }

    @Test
    public void cadastroImpressoraNome(){
        Assert.assertEquals("Ender 3", impressora3d.getNome());
    }
    @Test
    public void cadastroImpressoraPotencia(){
        Assert.assertEquals(360.0, impressora3d.getPotencia(), 0.1);
    }
    @Test
    public void cadastroImpressoraConsumo(){
        Assert.assertEquals(0.36, impressora3d.getConsumo(), 0.01);
    }
    @Test
    public void cadastroImpressoraPreco(){
        Assert.assertEquals(1661.26f, impressora3d.getPreco(), 0.01);
    }
}
