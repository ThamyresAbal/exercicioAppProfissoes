package teste;

import negocio.Empresa;
//import negocio.Programador;
import negocio.RedeSocial;

public class TestaEmpresa {

	public static void main(String[] args){
		
		new RedeSocial("@infnet", "@infnet");
		
		Empresa empresa = new Empresa("INFNET", "34567890");
		empresa.show();
		
//		Programador prog = new Programador();
//		prog.nome = "Abal";
//		prog.idade = 25;
//		prog.salario = 5000; 
////		prog.nomelinguagens = "java";
////		prog.certificacao = True;
//		prog.show();
	}

}
