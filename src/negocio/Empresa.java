package negocio;

public class Empresa {
	public String razaoSocial;
	public String cnpj;
	public Profissional funcionario;
	public RedeSocial redeSocial;

	public Empresa(String razaoSocial, String cnpj) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	public void show() {
		System.out.printf("***EMPRESA***\n"
				+ "Razão Social: %s \n"
				+ "CNPJ: %s \n",
				this.razaoSocial,
				this.cnpj
				);
		this.redeSocial.show();
	}

}
