import java.util.List;

public class Convidado extends Pessoa {
    private String funcao;
    private String redeSocial;
    private String formacao;
    private String maiorTitulacao;
    private String detalheProfissional;
    private List<Evento> eventos;

    public Convidado(String nome, String funcao, String redeSocial, String formacao, String maiorTitulacao, String detalheProfissional) {
        super(nome);
        this.funcao = funcao;
        this.redeSocial = redeSocial;
        this.formacao = formacao;
        this.maiorTitulacao = maiorTitulacao;
        this.detalheProfissional = detalheProfissional;
    }

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

    public boolean inserirEvento(Evento evento) {
        return this.eventos.add(evento);
    }

    public boolean removerEvento(Evento evento) {
        return this.eventos.remove(evento);
    }
}
