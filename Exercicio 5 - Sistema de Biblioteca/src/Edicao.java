import java.util.Date;

public class Edicao {
    private int idEdicao;
    private int ano;
    private char situacao;
    private Date ultimoEmprestimo;
    private Livro livro;
    private Midia midia;

    public Edicao(int idEdicao, int ano, Livro livro, Midia midia) {
        this.idEdicao = idEdicao;
        this.ano = ano;
        this.situacao = 'D';
        this.livro = livro;
        this.midia = midia;
    }

    public int getIdEdicao() {
        return idEdicao;
    }

    public int getAno() {
        return ano;
    }

    public char getSituacao() {
        return situacao;
    }

    public Date getUltimoEmprestimo() {
        return ultimoEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public Midia getMidia() {
        return midia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean emprestimo(Date data) {
        if (this.situacao == 'D') {
            this.ultimoEmprestimo = data;
            this.situacao = 'E';
            return true;
        }
        return false;
    }

    public boolean devolucao() {
        if (this.situacao == 'E') {
            this.situacao = 'D';
            return true;
        }
        return false;
    }
}
