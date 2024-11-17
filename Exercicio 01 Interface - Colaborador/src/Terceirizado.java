public class Terceirizado extends Colaborador{
    private int diasSemana;
    private int horasDia;

    public Terceirizado(String nome, char tipo, int diasSemana, int horasDia) {
        super(nome, tipo);
        this.diasSemana = diasSemana;
        this.horasDia = horasDia;
        super.valorContribuicao = calculaContribuicao();
    }

    @Override
    public double calculaContribuicao() {
        if (getTipo() == 'T') return 0;

        int cargaHorariaSemanal = diasSemana * horasDia;
        if (cargaHorariaSemanal <= 16) return 80.0;
        if (cargaHorariaSemanal <= 24) return 150.0;
        return 250.0;
    }

    @Override
    public String toString() {
        return  "Matrícula............: " + getMatricula() + "\n" +
                "Nome.................: " + getNome() + "\n" +
                "Tipo.................: " + String.format("%s", (getTipo() == 'P') ? "Permanente" : "Temporário") + "\n" +
                "Dias por semana......: " + this.diasSemana + "\n" +
                "Horas por dias.......: " + this.horasDia + "\n" +
                "Valor de contribuição: R$" + String.format("%.2f", super.valorContribuicao) + "\n";
    }
}
