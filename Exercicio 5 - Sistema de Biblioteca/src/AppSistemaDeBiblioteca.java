import java.util.ArrayList;
import java.util.List;

public class AppSistemaDeBiblioteca {
    public static void main(String[] args) {
        Midia pdf = new Midia(1, "PDF");
        Midia papel = new Midia(2, "Papel");
        Midia audio = new Midia(3, "Áudio");

        Livro aGuerraDosTronos = new Livro(1, "A Guerra dos Tronos", "Fantasia");
        Livro entendendoAlgoritmos = new Livro(2, "Entendendo Algoritmos", "Algoritmos");

        List<Edicao> edicoes = new ArrayList<>();
        edicoes.add(new Edicao(1, 1996, aGuerraDosTronos, pdf));
        edicoes.add(new Edicao(2, 1996, aGuerraDosTronos, audio));
        edicoes.add(new Edicao(3, 1996, aGuerraDosTronos, papel));
        edicoes.add(new Edicao(4, 2017, entendendoAlgoritmos, pdf));
        edicoes.add(new Edicao(5, 2017, entendendoAlgoritmos, papel));

        mostrarEdicoes(edicoes);
    }

    private static void mostrarEdicoes(List<Edicao> edicoes) {
        System.out.println("=========================================================================");
        System.out.println("Título                 Assunto       Ano   Situação    Descrição de mídia");
        System.out.println("=========================================================================");
        for (Edicao edicao : edicoes) {
            System.out.printf("%-21s  %-12s  %4d  %-10s  %-18s\n",
                    edicao.getLivro().getTitulo(),
                    edicao.getLivro().getAssunto(),
                    edicao.getAno(),
                    edicao.getSituacao() == 'D' ? "Disponível" : "Emprestado",
                    edicao.getMidia().getDescricao());
        }
        System.out.println("=========================================================================");
    }
}
