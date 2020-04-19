package negocio;

import auxiliar.Constante;

public class AnalistaSistemas extends Profissional{
//
//	public String nome;
//	public int idade;
//	public float salario;
	public int anoTerminoGraduacao;
//	public int anoInicioEspecializacao;
//	public int anoTerminoEspecializacao;
//	public String nomeEspecializacao;
//	public String nomeUniversidadeEspecializacao;
//	public int tempoExperiencia;
	//public RedeSocial redeSocial;
	public Especializacao especializacao;
	public Graduacao graduacao;
	
	public AnalistaSistemas(String nome, float salario) {
		super(nome,salario);
	}
	
	public void show() {
		super.show();
		
		System.out.printf("***ANALISTA DE SISTEMAS***\n"
				+ "Ano de término da graduação: %d \n \n",
				this.anoTerminoGraduacao
				);
		this.especializacao.show();
		this.graduacao.show();
	}
	
	private int calculaTempoFormado() {
		return Constante.ANO - this.anoTerminoGraduacao;
	}
	
	private float verificaBonusIdade() {
		
		return Constante.BONUS_IDADE_ANALISTA * idade;
	}
	
	private float verificaBonusFormacao() { 
		return Constante.BONUS_TEMPO_FORMADO * this.calculaTempoFormado();
	}
	
	private float verificaBonusExperiencia() {
		return Constante.BONUS_TEMPO_EXPERIENCIA_ANALISTA * this.tempoExperiencia;
	}
	
	private float verificaBonusSalarioBase() {
		return  Constante.INDICE_SALARIO_BASE_ANALISTA * this.salario;
	}

	@Override
	public float calcularSalario() {
		return  verificaBonusIdade()+
				verificaBonusFormacao() +
				verificaBonusExperiencia() +
				verificaBonusSalarioBase();
	}
}