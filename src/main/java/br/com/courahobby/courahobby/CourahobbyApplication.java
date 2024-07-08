package br.com.courahobby.courahobby;

import br.com.courahobby.courahobby.model.Energia;
import br.com.courahobby.courahobby.model.Filamentos;
import br.com.courahobby.courahobby.model.Impressora3d;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CourahobbyApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CourahobbyApplication.class, args);
		Energia energia = new Energia();
		Impressora3d impressora3d = new Impressora3d();
		Filamentos filamentos = new Filamentos();

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o preco do KWs?");
		//energia.setPrecoKw(sc.nextFloat());
		//energia.setPrecoKw(0.99f);
		System.out.println(energia.getPrecoKw());


		System.out.println("cadastra impressora nome");
		//String nomeImpressora = sc.nextLine();
		//String nomeImpressora = "Ender 3";
		System.out.println("cadastra impressora potencia");
		//Float potencaImpressora = sc.nextFloat();
		Float potencaImpressora = 360f;
		System.out.println("cadastra impressora consumo");
		//Float consumoImpressora = sc.nextFloat();
		Float consumoImpressora = 0.36f;
		System.out.println("cadastra impressora preco");
		//Float precoImpressora = sc.nextFloat();
		Float precoImpressora =1661.26f;

		System.out.println("Qual é o tipo de filamento?");
		//filamentos.setTipo(sc.nextLine());
		String tipoFilamento = "PLA";
		System.out.println("Qual é o tipo de filamento?");
		//filamentos.setFabricante(sc.nextLine());
		String fabricanteFilamento = "3D Lab";
		System.out.println("Qual é a descricao");
		//filamentos.setDescricao(sc.nextLine());
		String descricaoFilamento = "PLA_Marmore";
		System.out.println("Qual é o valor do kilo do filamento?");
		//filamentos.setValorKg(sc.nextFloat());
		Float valorKgFilamento = 92f;

		//impressora3d.setImpressora3d(nomeImpressora, potencaImpressora, consumoImpressora, precoImpressora)
		filamentos.setFilamento(tipoFilamento, descricaoFilamento, fabricanteFilamento, valorKgFilamento);
		System.out.println(filamentos.getValorG(valorKgFilamento));



		sc.close();
	}
}