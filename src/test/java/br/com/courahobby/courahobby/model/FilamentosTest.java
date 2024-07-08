package br.com.courahobby.courahobby.model;


import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class FilamentosTest {

    Filamentos filamentos = new Filamentos();

    @Before
    public void setup(){
        filamentos.setFilamento("PLA", "PLA_Marmore", "3D Lab", 92f);
    }

    @Test
    public void tipoFilamento(){
        assertThat(filamentos.getFabricante(),is("3D Lab"));
    }
}
