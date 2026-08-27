package application;

public class Funcionario extends Pessoa {

	public Funcionario(int idade, String nome, String sexo, double altura) {
		super(idade, nome, sexo, altura);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String calcularAltura() {
		// TODO Auto-generated method stub
		return "Funcionario";
	}

	


}
