package negocio;

public class TestaAquitetoSoftware {
	public static void main(String[] args) {
		
		RedeSocial rede = new RedeSocial("@infnet","@infnet");
	
		ArquitetoSoftware arq = new ArquitetoSoftware("Abal",2000);
		arq.idade = 40;
		arq.ultimoSalario = 2000;
	    arq.salario = 4000;
	    arq.tempoExperiencia = 50;
		arq.redeSocial = rede;
	 
	    arq.show();
		
	}
}
