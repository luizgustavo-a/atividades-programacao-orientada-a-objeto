import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private static int geradorId;

    private int id;
    private LocalDateTime data;
    private int duracao;
    private String local;
    private List<Assunto> assuntos;
    private Tema tema;
    private Mediador mediador;
    private List<Convidado> convidados;

    public Evento(LocalDateTime data, int duracao, Tema tema) {
        this.id = geradorId;
        geradorId++;
        this.data = data;
        this.duracao = duracao;
        this.tema = tema;
        this.assuntos = new ArrayList<>();
        this.convidados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getLocal() {
        return local;
    }

    public List<Assunto> getAssuntos() {
        return assuntos;
    }

    public Tema getTema() {
        return tema;
    }

    public Mediador getMediador() {
        return mediador;
    }

    public List<Convidado> getConvidados() {
        return convidados;
    }

    public void informarLocal(String local) {
        this.local = local;
    }

    public boolean inserirAssunto(Assunto assunto) {
        if(!assuntos.contains(assunto)) {
            return this.assuntos.add(assunto);
        }
        return false;
    }

    public boolean removerAssunto(Assunto assunto) {
        return this.assuntos.remove(assunto);
    }

    public void registrarMediador(Mediador mediador) {
        this.mediador = mediador;
    }

    public boolean inserirConvidado(Convidado convidado) {
        if(!convidados.contains(convidado)) {
            return this.convidados.add(convidado);
        }
        return false;
    }

    public boolean removerConvidado(Convidado convidado) {
        return this.convidados.remove(convidado);
    }

    @Override
    public String toString() {
        // StringBuilder é um "montador de strings", está sendo instanciado para criar um bloco de String com todos os convidados
        StringBuilder convidados = new StringBuilder();
        // Pega a lista de convidados e para cada um deles acrescenta no SB esse bloco de texto abaixo com as informações de cada um
        this.convidados.forEach(c -> convidados.append(String.format(
                "-- Convidado ID.........: %d%n" +
                        "--- Nome................: %s%n" +
                        "--- Função..............: %s%n" +
                        "--- Rede Social.........: %s%n" +
                        "--- Formação............: %s%n" +
                        "--- Maior titulação.....: %s%n" +
                        "--- Detalhe Profissional: %s%n",
                c.getId(),
                c.getNome(),
                c.getFuncao(),
                c.getRedeSocial(),
                c.getFormacao(),
                c.getMaiorTitulacao(),
                c.getDetalheProfissional())
        ));

        return  "Evento ID...............: " + this.id + "\n" +
                "- Data..................: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(this.data) + "\n" +
                "- Tema..................: " + this.tema.getTitulo() + " - " + this.tema.getSubTitulo() + "\n" +
                "- Duração...............: " + this.duracao + " minutos" + "\n" +
                // Se o atributo local for diferente de nulo vai o que está nele, se for nulo vai "Local não registrado"
                String.format("- Local.................: %s", (this.local != null) ? this.local : "Local não registrado") + "\n" +
                // Se o atributo mediador estiver diferente de nulo vai aparecer o nome e o telefone, se for nulo "Mediador não registrado"
                String.format("- Mediador..............: %s%s",
                        (this.mediador != null) ? "Nome: " + this.mediador.getNome() : "Mediador não registrado",
                        (this.mediador != null) ? " | Telefone: " + this.mediador.getTelefone() : "") + "\n" +
                // Adiciona o bloco de String de convidados que foi criado lá em cima
                "- Convidados............: \n" + convidados;

    }
}

