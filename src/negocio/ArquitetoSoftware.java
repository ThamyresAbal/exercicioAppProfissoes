package negocio;

import auxiliar.Constante;

public class ArquitetoSoftware extends Profissional {

	public float ultimoSalario;
	
	public ArquitetoSoftware(String nome, float salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	public void show() {
		super.show();
		System.out.printf("****ARQUITETO DE SOFTWARE**** \n");
		System.out.printf("Último salário base: %.2f \n",this.ultimoSalario);
	}
	
	@Override
	public float calcularSalario() {
		return this.ultimoSalario + (this.salario * Constante.INDICE_ARQUITETO_SALARIO);
	}

	
}
