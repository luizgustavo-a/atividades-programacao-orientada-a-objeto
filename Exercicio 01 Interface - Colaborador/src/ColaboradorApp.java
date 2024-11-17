import java.util.ArrayList;
import java.util.List;

public class ColaboradorApp {
    public static void main(String[] args) {
        List<Colaborador> colaboradores = new ArrayList<>();

        colaboradores.add(new Funcionario("Funcionário", 'O', 6000.00, 2024, 10));

        colaboradores.add(new Terceirizado("Terceirizado", 'P', 5, 7));

        mostrarColaboradores(colaboradores);

        calcularContribuicaoTotal(colaboradores);
    }

    private static void mostrarColaboradores(List<Colaborador> colaboradores) {
        for (Colaborador c : colaboradores) {
            System.out.println(c);
        }
    }

    private static void calcularContribuicaoTotal(List<Colaborador> colaboradores) {
        double soma = 0;
        for (Colaborador c : colaboradores) {
            soma += c.getValorContribuicao();
        }
        System.out.printf("Total de contribuição: R$%.2f", soma);
    }
}
