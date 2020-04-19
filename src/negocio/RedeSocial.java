package negocio;

public class RedeSocial {
	public String facebook;
	public String twitter;

	public RedeSocial(String facebook, String twitter) {
		this.facebook = facebook;
		this.twitter = twitter;
	}
	
	public void show() {
		System.out.printf("***REDES SOCIAIS*** \n"
				+ "Facebook: %s \n"
				+ "Twitter: %s \n \n",
				this.facebook,
				this.twitter
				);
	}
}
