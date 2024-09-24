public class Funcionario {
    private int matricula;
    private String nome;
    private String funcao;
    private double salario;
    private int nivelSalarial;
    private char nivelProfissional;
    private boolean emExercicio;

    public Funcionario(int matricula, String nome, String funcao, char nivelProfissional) {
        this.matricula = matricula;
        this.nome = nome;
        this.funcao = funcao;
        this.nivelProfissional = nivelProfissional;
        this.nivelSalarial = 1;
        this.emExercicio = true;

        if (nivelProfissional == 'O') {
            this.salario = 2000.0;
        } else if (nivelProfissional == 'G') {
            this.salario = 5000.0;
        } else {
            this.salario = 10000.0;
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public double getSalario() {
        return salario;
    }

    public int getNivelSalarial() {
        return nivelSalarial;
    }

    public char getNivelProfissional() {
        return nivelProfissional;
    }

    public boolean isEmExercicio() {
        return emExercicio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }


    public boolean promocaoHorizontal() {
        if (this.nivelSalarial < 3) {
            this.nivelSalarial++;
            if (nivelProfissional == 'O') {
                this.salario += 1000.0;
            } else if (nivelProfissional == 'G') {
                this.salario += 2000.0;
            } else {
                this.salario += 30000.0;
            }
            return true;
        }
        return false;
    }

    public boolean promocaoVertical() {
        if (this.nivelProfissional == 'O') {
            this.nivelProfissional = 'G';
            this.salario = 5000.0;
            this.nivelSalarial = 1;
            return true;
        }
        if (this.nivelProfissional == 'G') {
            this.nivelProfissional = 'E';
            this.salario = 10000.0;
            this.nivelSalarial = 1;
            return true;
        }
        return false;
    }
}
