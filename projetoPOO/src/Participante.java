//Classe Filha Participante que herdar os atributos, construtor e metodos do Pai Pessoa atraves do extends
public class Participante extends Pessoa{
    private String matricula;
    private String curso;

    /*construtor da classe Participante que herdar o construtor e atributos de Pessoa atraves do super() 
    e os atributos são colocados dentro do super() e dentro do contrutor()*/
    public Participante(String nome, String matricula, String curso) {
        super(nome);
        this.matricula = matricula;
        this.curso = curso;
    }

    //metodos getters para poder retornar os atributos
    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    //metodo que retorna todos os atributos para ser impresso atraves de um System no app.
    @Override
    public String toString() {
        return  "Participante ID.........: " + super.getId() + "\n" +
                "- Nome..................: " + super.getNome() + "\n" +
                "- Matrícula.............: " + this.matricula + "\n" +
                "- Curso.................: " + this.curso + "\n";
    }
}