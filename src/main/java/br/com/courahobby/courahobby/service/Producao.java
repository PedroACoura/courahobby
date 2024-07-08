package br.com.courahobby.courahobby.service;

import br.com.courahobby.courahobby.model.Filamentos;
import br.com.courahobby.courahobby.model.Impressora3d;

public class Producao {
	 public float getAddPorHora(Impressora3d impressora3d){
		 return impressora3d.getPreco()/(12f*8f*25f);
	    }
	 
	 public float getDencidade(Filamentos filamentos) {

		 return filamentos.getDencidade();
	 }
	 public  float getAreaDiametroDoFilamento(Filamentos filamentos){
		 return ((float)Math.PI)*((float)Math.pow((filamentos.getDiametro()/2.0f),2.f));
	 }

}
