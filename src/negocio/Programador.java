package negocio;

import java.util.List;

import auxiliar.Constante;

public class Programador extends Profissional{
	
//	public String nome;
//	public int idade;
//	public float salario; 
	public boolean certificacaoJava;
	public boolean conhecimentoBancoDados;
	public List<String> qtdeLinguagens;
//	public RedeSocial redeSocial;
	public Empresa empresa;
	public Graduacao graduacao;
	
	public Programador(String nome, float salario) {
		super(nome, salario);
	}
	
	public void show() {
		super.show();
		System.out.printf("***PROGRAMADOR***\n");
		System.out.printf("Possui certificação Java? %s \n"
				+ "Possui conhecimento em banco de dados? %s \n",
				this.verificaCertificacao(),
				this.verificaBancoDados()
				);

		this.qtdeLinguagens();
		this.graduacao.show();
	//	this.redeSocial.show();
	}
	
	private void qtdeLinguagens() {
		System.out.printf("Linguagens \n");
		
		for (String linguagem : qtdeLinguagens) {
			System.out.printf(" - %s \n", linguagem);	
		}
	}
	
	private String verificaCertificacao() {
		return this.certificacaoJava ? "Sim" : "Não";
	}
	
	private String verificaBancoDados() {
		return this.conhecimentoBancoDados ? "Sim" : "Não";
	}
	
	private float verificaBonusIdade() {
		return Constante.BONUS_IDADE_ANALISTA * this.idade; 
	}
	
	private float verificaBonusJava() {
		// aproveitando o atributo booleano ao invés de utilizar um if
		return (this.certificacaoJava ? Constante.CERTIFICACAO_JAVA: 0); 
	}
	
	private float verificaBonusBd() {
		// aproveitando o atributo booleano ao invés de utilizar um if
		return (this.conhecimentoBancoDados ? Constante.CERTIFICACAO_BD: 0); 
	}
	
	private float verificaBonusTempoExperiencia() {
		return Constante.BONUS_TEMPO_EXPERIENCIA_PROGRAMADOR * this.tempoExperiencia;
	}
	
	private float verificaBonusIndice() {
		return  Constante.INDICE_SALARIO_BASE_PROGRAMADOR * this.salario;
	}

	private float verificaBonusPorQtdeLinguagem() {
		//size é um metodo que funciona como o length do vetor
		return Constante.BONUS_CADA_LINGUAGEM_PROGRAMACAO * qtdeLinguagens.size();
	}

	@Override
	public float calcularSalario() {
		return  verificaBonusIdade() + 
				verificaBonusJava() +
				verificaBonusBd() +
				verificaBonusPorQtdeLinguagem() +
				verificaBonusTempoExperiencia() +
				verificaBonusIndice();
	}
}
