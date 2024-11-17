import java.time.LocalDate;

public class Funcionario extends Colaborador {
    private double salario;
    private int anoAdmissao;
    private int mesAdmissao;

    public Funcionario(String nome, char tipo, double salario, int anoAdmissao, int mesAdmissao) {
        super(nome, tipo);
        this.salario = salario;
        this.anoAdmissao = anoAdmissao;
        this.mesAdmissao = mesAdmissao;
        super.valorContribuicao = calculaContribuicao();
    }

    @Override
    public double calculaContribuicao() {
        double percContribuicao;
        if(getTipo() == 'D') percContribuicao = 0.1;
        else if (getTipo() == 'G') percContribuicao = 0.08;
        else percContribuicao = 0.05;

        int anoAtual = LocalDate.now().getYear();
        if(anoAtual == this.anoAdmissao) {
            percContribuicao *=  1 - (double) (this.mesAdmissao - 1)/12;
        }

        return salario * percContribuicao;
    }

    @Override
    public String toString() {
        return  "Matrícula............: " + getMatricula() + "\n" +
                "Nome.................: " + getNome() + "\n" +
                "Tipo.................: " + String.format("%s", (getTipo() == 'D') ? "Diretor" : (getTipo() == 'G') ? "Gerente" : "Operacional") + "\n" +
                "Salário..............: R$" + String.format("%.2f", this.salario) + "\n" +
                "Mês de admissão......: " + String.format("%d/%d", this.mesAdmissao, this.anoAdmissao) + "\n" +
                "Valor de contribuição: R$" + String.format("%.2f",super.valorContribuicao) + "\n";
    }
}
