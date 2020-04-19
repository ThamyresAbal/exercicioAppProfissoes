package teste;

import java.util.ArrayList;
import java.util.List;

import negocio.Empresa;
import negocio.Graduacao;
import negocio.Programador;
import negocio.RedeSocial;

public class TestaProgramador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedeSocial rede = new RedeSocial("@infnet", "@infnet");
		
		new Empresa("INFNET", "34567890");
		
		List<String> lista = new ArrayList();
		lista.add("java");
		lista.add("c");
		lista.add("python");
		
		//instanciar graduacao
		Graduacao g = new Graduacao();
		
//		String[] lista = {"java","python", "javaScript"};
		
		Programador prog = new Programador("Abal", 2000);
		prog.idade = 25;
		prog.qtdeLinguagens = lista;
		prog.certificacaoJava = true;
		prog.tempoExperiencia = 30;
		prog.conhecimentoBancoDados = true;
		prog.redeSocial = rede;
		prog.show();
	} 
}
