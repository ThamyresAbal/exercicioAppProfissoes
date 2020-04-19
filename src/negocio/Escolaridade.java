package negocio;

public abstract class Escolaridade {

	public int anoInicio;
	public int anoTermino;
	public String nomeCurso;
	public String nomeUniversidade;
	public int tempoExperiencia;
	
	public void show() {
		System.out.printf("***ANALISTA DE SISTEMAS***\n"
				+ "Ano de inicio da especialização: %d \n"
				+ "Ano de término especializacao: %d \n"  
				+ "Nome da especializacao; %s \n" 
				+ "Nome da universidade da especializacao: %s \n"  
				+ "Tempo de experiencia: %d \n",
				this.anoInicio,
				this.anoTermino,
				this.nomeCurso,
				this.nomeUniversidade,
				this.tempoExperiencia

				);
	}
}
