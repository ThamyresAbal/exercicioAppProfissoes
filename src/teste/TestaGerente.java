package teste;

import negocio.Especializacao;
import negocio.Gerente;
import negocio.RedeSocial;

public class TestaGerente {

	public static void main(String[] args) {
		RedeSocial rede = new RedeSocial("@infnet","@infnet");
		
		Especializacao especializacao = new Especializacao();
		especializacao.anoInicio = 2021;
		especializacao.anoTermino = 2023;
		especializacao.nomeCurso= "SAP";
		especializacao.nomeUniversidade = "Infnet";
		
		Gerente gerente= new Gerente("Abal", 2000);
		gerente.idade = 25; 
		gerente.tempoExperiencia = 20;
		gerente.especializacao = especializacao;
		gerente.redeSocial = rede;
		gerente.show();
		
	}
}
