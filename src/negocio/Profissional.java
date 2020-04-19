package negocio;

public abstract class Profissional {
	public String nome;
	public int idade;
	public float salario;
	public int tempoExperiencia;
	public RedeSocial redeSocial;
	
	public Profissional(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void show() {
		System.out.printf("***FUNCIONARIO***\n");
		System.out.printf("Nome: %s \n"
				+ "Idade: %d \n"
				+ "Salário Líquido: %.2f \n"
				+ "Salário: %.2f \n"
				+ "Tempo de experiência: %d meses \n\n",
				this.nome,
				this.idade,
				this.calcularSalario(),
				this.salario,
				this.tempoExperiencia
				);
		this.redeSocial.show();
	}

	public abstract float calcularSalario();
}

