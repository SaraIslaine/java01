package application;



public class Pessoa {
	
	int idade;
	String nome;
	String sexo;
	double altura;
	
	/**
	 * @param idade
	 * @param nome
	 * @param sexo
	 * @param altura
	 */
	public Pessoa(int idade, String nome, String sexo, double altura) {
		this.idade = idade;
		this.nome = nome;
		this.sexo = sexo;
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String retornaNomeIdade() {
		return "Meu nome é " + getNome()+ " tenho " + getIdade();
	}
	public String calcularAltura() {
	if (this.altura >= 1.0) {
		return "ele é alto";
	} else if(this.altura < 1.0) {
		return "ele é baixo";
	}
	return "sem altura definida";
}
}

