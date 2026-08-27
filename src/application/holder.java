package application;

public class holder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		//Scanner sc = Scanner(System.in);
		
		Pessoa pessoa = new Pessoa(25,"gato", "Femea", 0.70);
		
		Funcionario funcionario = new Funcionario(25,"gato", "Femea", 0.70);
		
		//System.out.println(pessoa.nome);
		//System.out.println(pessoa.idade);
		//System.out.println(pessoa.sexo);
		//.out.println(pessoa.altura);

		//System.out.println(pessoa.retornaNomeIdade());	
		System.out.println(funcionario.calcularAltura());
		System.out.println(pessoa.calcularAltura());
	}

}
