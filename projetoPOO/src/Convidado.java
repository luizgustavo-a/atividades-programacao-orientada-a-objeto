import java.util.ArrayList;
import java.util.List;

//Classe Filha Convidado que herdar os atributos, construtor e metodos do Pai Pessoa atraves do extends
public class Convidado extends Pessoa{
	private String funcao;
	private String redeSocial;
	private String formacao;
	private String maiorTitulacao;
	private String detalheProfissional;
	private List<Evento> eventos;
	
	/*construtor da classe Convidado que herdar o construtor e atributos de Pessoa atraves do super() 
    	e os atributos são colocados dentro do super() e dentro do contrutor()*/
	public Convidado(String nome, String funcao, String redeSocial, String formacao, String maiorTitulacao,
			String detalheProfissional) {
		super(nome);
		this.funcao = funcao;
		this.redeSocial = redeSocial;
		this.formacao = formacao;
		this.maiorTitulacao = maiorTitulacao;
		this.detalheProfissional = detalheProfissional;	
		this.eventos = new ArrayList<Evento>();
	}

	public boolean inserirEvento(Evento evento) {
		if(!eventos.contains(evento)) {
			return this.eventos.add(evento);
		}
		return false;
	}

	public boolean removerEvento(Evento evento) {
		return eventos.remove(evento);
	}

	//metodos getters e setters para poder retornar e modifcar os atributos
	public String getFuncao() {
		return funcao;
	}

	public String getRedeSocial() {
		return redeSocial;
	}

	public String getFormacao() {
		return formacao;
	}

	public String getMaiorTitulacao() {
		return maiorTitulacao;
	}

	public String getDetalheProfissional() {
		return detalheProfissional;
	}

	//metodo que retorna todos os atributos para ser impresso atraves de um System no app.
	@Override
	public String toString() {
		return  "Convidado ID............: " + super.getId() + "\n" +
				"- Nome..................: " + super.getNome() + "\n" +
				"- Função................: " + this.funcao + "\n" +
				"- Rede Social...........: " + this.redeSocial + "\n" +
				"- Formação..............: " + this.formacao + "\n" +
				"- Maior titulação.......: " + this.maiorTitulacao + "\n" +
				"- Detalhe Profissional..: " + this.detalheProfissional + "\n";
	}

}
