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
				+ "Sal�rio L�quido: %.2f \n"
				+ "Sal�rio: %.2f \n"
				+ "Tempo de experi�ncia: %d meses \n\n",
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

