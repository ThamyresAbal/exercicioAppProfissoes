package teste;

import negocio.AnalistaSistemas;
import negocio.Especializacao;
import negocio.RedeSocial;

public class TestaAnalista {

	public static void main(String[] args) {

		RedeSocial rede = new RedeSocial("@infnet","@infnet");
				
		Especializacao especializacao = new Especializacao();
		especializacao.anoInicio = 2021;
		especializacao.anoTermino = 2023;
		especializacao.nomeCurso = "SAP";
		especializacao.nomeUniversidade = "Infnet";
		
		AnalistaSistemas analista = new AnalistaSistemas("Abal", 2000);
		analista.idade = 25; 
		analista.anoTerminoGraduacao = 2021;
		analista.tempoExperiencia = 20;
		analista.especializacao = especializacao;
		analista.redeSocial = rede;
		analista.show();
	}
}
