//Classe Pai que é abstrata e não pode ser instanciada, mas seus filhos herdaram seus atributos, contrutor e metodos. 
public abstract class Pessoa {
    //atributo para ser usado como gerador de id´s sequenciais
    private static int geradorId;

    private int id;
    private String nome;

    //contrutor que poderá ser utilizados pelos filhos atraves do super()
    public Pessoa(String nome) {
        this.id = geradorId;
        geradorId++;
        this.nome = nome;
    }

    //metodos getters e setters para poder retornar e modifcar os atributos
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
}