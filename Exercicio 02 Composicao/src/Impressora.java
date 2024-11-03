import java.util.ArrayList;
import java.util.List;

public class Impressora {
    private int id;
    private String tipo;
    private boolean imprimindo;
    private List<Impressao> impressoes;

    public Impressora(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
        this.imprimindo = false;
        this.impressoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isImprimindo() {
        return imprimindo;
    }

    public List<Impressao> getImpressoes() {
        return impressoes;
    }

    public void recebeImpressao(String nomeArquivo) {
        impressoes.add(new Impressao(nomeArquivo));
        if (impressoes.size() == 1) {
            impressoes.get(0).registraInicio();
            imprimindo = true;
        }
    }

    public boolean finalizaImpressao() {
        if (!imprimindo) {
            return  false;
        } else {
            impressoes.remove(0);
            if (!impressoes.isEmpty()) {
                impressoes.get(0).registraInicio();
            } else {
                imprimindo = false;
            }
            return true;
        }
    }
}
