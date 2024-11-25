public class Participante extends Pessoa {
    private String matricula;
    private String curso;

    public Participante(String nome, String matricula, String curso) {
        super(nome);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return  "Participante ID.........: " + super.getId() + "\n" +
                "- Nome..................: " + super.getNome() + "\n" +
                "- Matrícula.............: " + this.matricula + "\n" +
                "- Curso.................: " + this.curso + "\n";
    }
}
