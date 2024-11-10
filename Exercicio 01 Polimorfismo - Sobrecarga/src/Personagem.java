public class Personagem {
    private int id;
    private String nome;
    private int pontos;

    public Personagem(int id, String nome, int pontos) {
        this.id = id;
        this.nome = nome;
        this.pontos = pontos;
    }

    public void recebeGolpe(int aceleracao) {
        this.pontos -= aceleracao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void recebeGolpe(char tipoArma, int aceleracao) {
        int dano = 2 * aceleracao;
        if (tipoArma != 'm') {
            dano = (int) Math.ceil(dano * 1.4);
        }
        if (tipoArma == 'E') {
            dano = (int) Math.ceil(dano * 1.4);
        }
        this.pontos -= dano;
    }
}
