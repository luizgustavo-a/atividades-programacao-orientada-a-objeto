//Classe Filha Mediador que herdar os atributos, construtor e metodos do Pai Pessoa atraves do extends
public class Mediador extends Pessoa{
	private String telefone;

	/*construtor da classe Mediador que herdar o construtor e atributos de Pessoa atraves do super() 
	e os atributos são colocados dentro do super() e dentro do contrutor()*/
	public Mediador(String nome, String telefone) {
		super(nome);
		this.telefone = telefone;
	}
  
	//metodos getters para poder retornar
	public String getTelefone() {
		return telefone;
	}

	//metodo que retorna todos os atributos para ser impresso atraves de um System no app.
	@Override
	public String toString() {
		return  "Mediador ID.............: " + super.getId() + "\n" +
				"- Nome..................: " + super.getNome() + "\n" +
				"- Telefone..............: " + this.getTelefone() + "\n";
	}
}