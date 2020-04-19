package negocio;

import auxiliar.Constante;

public class Gerente extends Profissional {
	public boolean certificacaoPMI;
	public Especializacao especializacao;
	
	public Gerente (String nome, float salario) {
		super(nome,salario);
	}
	
	public void show() {
		super.show();
		
		System.out.printf("***GERENTE***\n"
				+ "Certificação em PMI: %s \n \n",
				this.verificaCerticicacaoPMI()
				);
		this.especializacao.show();
	}
	
	private String verificaCerticicacaoPMI() {
		return this.certificacaoPMI ? "Sim" : "Não";
	}
	
	private float verificaBonusIdade() {
		return Constante.BONUS_IDADE_GERENTE * this.idade; 
	}
	
	private float verificaBonusPMI() {
		// aproveitando o atributo booleano ao invés de utilizar um if
		return (this.certificacaoPMI ? Constante.CERTIFICACAO_PMI : 0); 
	}
	
	private float verificaBonusTempoExperiencia() {
		return Constante.BONUS_TEMPO_EXPERIENCIA_GERENTE * this.tempoExperiencia;
	}
	
	private float verificaBonusIndice() {
		return  Constante.INDICE_SALARIO_BASE_GERENTE_PROJETOS * this.salario;
	}
	
	@Override
	public float calcularSalario() {
		return	verificaBonusIdade() + 
				verificaBonusPMI() +
				verificaBonusTempoExperiencia() +
				verificaBonusIndice();
	}
	
}
