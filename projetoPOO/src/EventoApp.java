import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EventoApp {

    // Listas que servirão de repositórios
    private static final List<Evento> repositorioEventos = new ArrayList<>();
    private static final List<Assunto> repositorioAssuntos = new ArrayList<>();
    private static final List<Tema> repositorioTemas= new ArrayList<>();
    private static final List<Convidado> repositorioConvidados = new ArrayList<>();
    private static final List<Participante> repositorioParticipantes = new ArrayList<>();
    private static final List<Mediador> repositorioMediadores = new ArrayList<>();
    private static final List<Participacao> repositorioParticipacao = new ArrayList<>();
    private static final List<Topico> repositorioTopicos = new ArrayList<>();
    private static final List<Dica> repositorioDicas = new ArrayList<>();

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public static void main(String[] args) {
        // Criando os eventos com os assuntos
        Evento evento1 = new Evento(LocalDateTime.of(2024, 11, 25, 9, 0), 50, getTema("Educação superior", "Estratégias para os desafios"));
        inserirAssuntoAEvento("Falta de recursos financeiros", evento1);
        inserirAssuntoAEvento("Gap entre academia e mercado", evento1);
        inserirAssuntoAEvento("Aptidão com a área de estudo", evento1);
        repositorioEventos.add(evento1);

        System.out.println(evento1);

        // Remover assunto
        removerAssuntoDoEvento(repositorioAssuntos.get(0), repositorioEventos.get(0));
        removerAssuntoDoEvento(repositorioAssuntos.get(0), repositorioEventos.get(0)); // Deve aparecer mensagem de erro

        Evento evento2 = new Evento(LocalDateTime.of(2024, 11, 26, 14, 0), 60, getTema("Educação superior", "Acesso à população de baixa renda"));
        inserirAssuntoAEvento("Falta de conhecimento básico", evento2);
        inserirAssuntoAEvento("Administração do tempo", evento2);
        evento2.informarLocal("Sala 12");
        repositorioEventos.add(evento2);

        Evento evento3 = new Evento(LocalDateTime.of(2024, 11, 27, 10, 0), 60, getTema("Vida de estudante", "O desafio de estudar e trabalhar"));
        inserirAssuntoAEvento("Administração do tempo", evento3);
        inserirAssuntoAEvento("Apoio familiar", evento3);
        repositorioEventos.add(evento3);

        Evento evento4 = new Evento(LocalDateTime.of(2024, 11, 28, 16, 0), 40, getTema("Educação superior", "Estratégias para os desafios"));
        inserirAssuntoAEvento("Gap entre academia e mercado", evento4);
        inserirAssuntoAEvento("Fomento à pesquisa", evento4);
        inserirAssuntoAEvento("Aplicação da extensão", evento4);
        inserirAssuntoAEvento("Aplicação da extensão", evento4); // Deve aparecer mensagem de erro
        repositorioEventos.add(evento4);

        Evento evento5 = new Evento(LocalDateTime.of(2024, 11, 29, 13, 0), 80, getTema("Educação superior", "Atualização curricular"));
        inserirAssuntoAEvento("Gap entre academia e mercado", evento5);
        inserirAssuntoAEvento("Fomento à pesquisa", evento5);
        inserirAssuntoAEvento("Aplicação da extensão", evento5);
        repositorioEventos.add(evento5);

        Evento evento6 = new Evento(LocalDateTime.of(2024, 11, 30, 8, 0), 30, getTema("Vida de estudante", "Déficit de conhecimento"));
        inserirAssuntoAEvento("Falta de conhecimento básico", evento6);
        inserirAssuntoAEvento("Obtenção do conhecimento", evento6);
        repositorioEventos.add(evento6);

        // Instanciando 10 Participantes
        for (int i = 1; i <= 10; i++) {
            repositorioParticipantes.add(new Participante("Participante " + i, "MATR" + i, "Curso " + i));
        }

        // Instanciando 5 Convidados
        for (int i = 1; i <= 5; i++) {
            repositorioConvidados.add(new Convidado("Convidado " + i, "Função " + i, "RedeSocial " + i,
                    "Formação " + i, "Maior Titulação " + i, "Detalhe Profissional " + i));
        }

        // Adicionando convidados aos eventos
        adicionarConvidadoAEvento(repositorioConvidados.get(0), repositorioEventos.get(0));
        adicionarConvidadoAEvento(repositorioConvidados.get(0), repositorioEventos.get(0)); // Deve alertar que já está registrado
        adicionarConvidadoAEvento(repositorioConvidados.get(1), repositorioEventos.get(0));
        adicionarConvidadoAEvento(repositorioConvidados.get(4), repositorioEventos.get(1));
        adicionarConvidadoAEvento(repositorioConvidados.get(2), repositorioEventos.get(2));
        adicionarConvidadoAEvento(repositorioConvidados.get(0), repositorioEventos.get(3));
        adicionarConvidadoAEvento(repositorioConvidados.get(2), repositorioEventos.get(3));
        adicionarConvidadoAEvento(repositorioConvidados.get(3), repositorioEventos.get(4));
        adicionarConvidadoAEvento(repositorioConvidados.get(0), repositorioEventos.get(5));

        // Remove convidado correto
        removerConvidadoDoEvento(repositorioConvidados.get(0), repositorioEventos.get(0));
        // Deve aparecer mensagem de erro
        removerConvidadoDoEvento(repositorioConvidados.get(0), repositorioEventos.get(0));

        // Adicionando participantes aos eventos
        adicionarParticipanteAEvento(repositorioParticipantes.get(0), repositorioEventos.get(0));
        adicionarParticipanteAEvento(repositorioParticipantes.get(0), repositorioEventos.get(0)); // Deve alertar que já está registrado
        adicionarParticipanteAEvento(repositorioParticipantes.get(1), repositorioEventos.get(0));
        adicionarParticipanteAEvento(repositorioParticipantes.get(2), repositorioEventos.get(0));
        adicionarParticipanteAEvento(repositorioParticipantes.get(3), repositorioEventos.get(0));

        adicionarParticipanteAEvento(repositorioParticipantes.get(4), repositorioEventos.get(1));
        adicionarParticipanteAEvento(repositorioParticipantes.get(5), repositorioEventos.get(1));
        adicionarParticipanteAEvento(repositorioParticipantes.get(6), repositorioEventos.get(1));
        adicionarParticipanteAEvento(repositorioParticipantes.get(7), repositorioEventos.get(1));

        adicionarParticipanteAEvento(repositorioParticipantes.get(8), repositorioEventos.get(2));
        adicionarParticipanteAEvento(repositorioParticipantes.get(9), repositorioEventos.get(2));
        adicionarParticipanteAEvento(repositorioParticipantes.get(0), repositorioEventos.get(2));
        adicionarParticipanteAEvento(repositorioParticipantes.get(1), repositorioEventos.get(2));

        adicionarParticipanteAEvento(repositorioParticipantes.get(2), repositorioEventos.get(3));
        adicionarParticipanteAEvento(repositorioParticipantes.get(3), repositorioEventos.get(3));
        adicionarParticipanteAEvento(repositorioParticipantes.get(4), repositorioEventos.get(3));
        adicionarParticipanteAEvento(repositorioParticipantes.get(5), repositorioEventos.get(3));

        adicionarParticipanteAEvento(repositorioParticipantes.get(6), repositorioEventos.get(4));
        adicionarParticipanteAEvento(repositorioParticipantes.get(7), repositorioEventos.get(4));
        adicionarParticipanteAEvento(repositorioParticipantes.get(8), repositorioEventos.get(4));
        adicionarParticipanteAEvento(repositorioParticipantes.get(9), repositorioEventos.get(4));

        adicionarParticipanteAEvento(repositorioParticipantes.get(0), repositorioEventos.get(5));
        adicionarParticipanteAEvento(repositorioParticipantes.get(1), repositorioEventos.get(5));
        adicionarParticipanteAEvento(repositorioParticipantes.get(2), repositorioEventos.get(5));
        adicionarParticipanteAEvento(repositorioParticipantes.get(3), repositorioEventos.get(5));

        inserirMediadorAEvento("Mediador", "11111111111", repositorioEventos.get(3));

        // Exibindo os eventos e seus assuntos
        for (Evento evento : repositorioEventos) {
            exibirEvento(evento);
        }

        System.out.println("Participantes do evento ID: 0");
        mostrarParticipantesDoEvento(repositorioEventos.get(0));

        repositorioTopicos.add(new Topico("Descrição do tópico", repositorioAssuntos.get(0), evento1));
        registrarDica(repositorioConvidados.get(0), repositorioTopicos.get(0), "Descrição da dica");

        System.out.println(evento1);
        System.out.println(repositorioParticipantes.get(0));
        System.out.println(repositorioAssuntos.get(0));
        System.out.println(repositorioDicas.get(0));
        System.out.println(repositorioMediadores.get(0));
        System.out.println(repositorioParticipacao.get(0));
        System.out.println(evento1.getTema());
        System.out.println(repositorioTopicos.get(0));

    }

    private static Assunto getAssunto(String descricao) {
        // Busca por um Assunto existente no repositório
        for (Assunto assunto : repositorioAssuntos) {
            if (assunto.getDescricao().equals(descricao)) {
                return assunto; // Retorna o assunto existente
            }
        }
        // Se não existir, cria um novo e adiciona ao repositório
        Assunto novoAssunto = new Assunto(descricao);
        repositorioAssuntos.add(novoAssunto);
        return novoAssunto;
    }

    private static void inserirAssuntoAEvento(String descricao, Evento evento) {
        for (Assunto assunto : evento.getAssuntos()) {
            if (assunto.getDescricao().equals(descricao)) {
                System.out.println("Assunto já registado.\n");
                return;
            }
        }
        Assunto assunto = getAssunto(descricao);
        if (evento.inserirAssunto(assunto) && assunto.inserirEvento(evento)) {
            System.out.println("Assunto inserido com sucesso.\n");
        } else {
            System.out.println("Não foi possível inserir o assunto no evento.\n");
        }

    }

    private static void removerAssuntoDoEvento(Assunto assunto, Evento evento) {
        if (evento.removerAssunto(assunto) && assunto.removerEvento(evento)) {
            System.out.println("Assunto removido com sucesso.\n");
        } else {
            System.out.println("O assunto não faz parte deste evento.\n");
        }
    }

    private static void inserirTopicoAAssuntoNoEvento (Assunto assunto, Evento evento, String descricao) {
        for (Topico t : repositorioTopicos) {
            if (t.getDescricao().equals(descricao) && t.getAssunto().equals(assunto) && t.getEvento().equals(evento)) {
                System.out.println("Tópico já registrado.");
                return;
            }
        }

        Topico topico = new Topico(descricao, assunto, evento);
        repositorioTopicos.add(topico);
    }

    private static void registrarDica(Convidado convidado, Topico topico, String descricao) {
        for (Dica d : repositorioDicas) {
            if (d.getDescricao().equals(descricao) && d.getConvidado().equals(convidado) && d.getTopico().equals(topico)) {
                System.out.println("Dica já registrada.");
                return;
            }
        }

        Dica dica = new Dica();
        dica.registrarDica(convidado, topico, descricao);
        repositorioDicas.add(dica);
    }

    public static Tema getTema(String descricao, String subtitulo) {
        // Busca por um Tema existente no repositório
        for (Tema tema : repositorioTemas) {
            if (tema.getTitulo().equals(descricao) && tema.getSubTitulo().equals(subtitulo)) {
                return tema; // Retorna o tema existente
            }
        }
        // Se não encontrar, cria um novo Tema e o adiciona ao repositório
        Tema novoTema = new Tema(descricao, subtitulo);
        repositorioTemas.add(novoTema);
        return novoTema;
    }

    private static void adicionarConvidadoAEvento(Convidado convidado, Evento evento) {
        for (Convidado c : evento.getConvidados()) {
            if (c.equals(convidado)) {
                System.out.println("Convidado já registrado no evento.\n");
                return;
            }
        }

        if (convidado.inserirEvento(evento) && evento.inserirConvidado(convidado)) {
            System.out.println("Convidado inserido com sucesso.\n");
            exibirEvento(evento);
        } else {
            System.out.println("Não foi possível inserir convidado.\n");
        }
    }

    private static void removerConvidadoDoEvento(Convidado convidado, Evento evento) {
        if (evento.removerConvidado(convidado) && convidado.removerEvento(evento)) {
            System.out.println("Convidado removido com sucesso.\n");
            exibirEvento(evento);
        } else {
            System.out.println("O convidado não participa deste evento.\n");
        }
    }

    private static void adicionarParticipanteAEvento(Participante participante, Evento evento) {
        for (Participacao participacao : repositorioParticipacao) {
            if (participacao.getParticipante().getId() == participante.getId() && participacao.getEvento().getId() == evento.getId()) {
                System.out.println("Participante já registrado no evento.\n");
                return;
            }
        }

        Participacao participacao = new Participacao(Date.valueOf(evento.getData().toLocalDate()));
        participacao.inserirParticipante(participante, evento);
        System.out.printf("Participação registrada. %n" +
                        "Data: %s%n" +
                        "Nome do participante: %s%n" +
                        "Nome do evento: %s : %s%n%n",
                dtf.format(evento.getData()),
                participacao.getParticipante().getNome(),
                participacao.getEvento().getTema().getTitulo(),
                participacao.getEvento().getTema().getSubTitulo());
        repositorioParticipacao.add(participacao);
    }

    private static void inserirMediadorAEvento(String nome, String telefone, Evento evento) {
        for (Mediador m : repositorioMediadores) {
            if (m.getNome().equals(nome) && m.getTelefone().equals(telefone)) {
                evento.registrarMediador(m);
                System.out.println("Mediador registrado com sucesso.");
                return;
            }
        }

        Mediador mediador = new Mediador(nome, telefone);
        evento.registrarMediador(mediador);
        repositorioMediadores.add(mediador);
        System.out.println("Mediador registrado com sucesso.");
    }

    private static void exibirEvento(Evento evento) {
        System.out.printf("Evento ID: %d%n" +
                        "Data: %s%n" +
                        "Tema: %s : %s%n" +
                        "Duração: %d minutos%n" +
                        "Local: %s%n" +
                        "Mediador: %s%s%n",
                evento.getId(),
                dtf.format(evento.getData()),
                evento.getTema().getTitulo(),
                evento.getTema().getSubTitulo(),
                evento.getDuracao(),
                (evento.getLocal() != null) ? evento.getLocal() : "Local não registrado.",
                (evento.getMediador() != null) ? "Nome - " + evento.getMediador().getNome(): "Mediador não registrado.",
                (evento.getMediador() != null) ? ", Telefone -" + evento.getMediador().getTelefone() : "");

        System.out.println("Assuntos:");
        for (Assunto assunto : evento.getAssuntos()) {
            System.out.println("- " + assunto.getDescricao());
        }

        System.out.println("Convidados:");
        for (Convidado convidado : evento.getConvidados()) {
            System.out.println("- " + convidado.getNome());
            System.out.println("-- Formação: " + convidado.getFormacao());
            System.out.println("-- Função: " + convidado.getFuncao());
            System.out.println("-- Rede Social: " + convidado.getRedeSocial());
            System.out.println("-- Titulação: " + convidado.getMaiorTitulacao());
            System.out.println("-- Convidado: " + convidado.getDetalheProfissional());
        }
        System.out.println();
    }

    private static void mostrarParticipantesDoEvento(Evento evento) {
        System.out.println("Participantes: ");
        for (Participacao participacao : repositorioParticipacao) {
            if (participacao.getEvento().getId() == evento.getId()) {
                System.out.println("- Matrícula:" + participacao.getParticipante().getMatricula() + " Nome: " + participacao.getParticipante().getNome());
            }
        }
        System.out.println();
    }


}