import java.util.List;
import java.util.Arrays;

public class GridChallenge {

    // Função para verificar o Grid Challenge
    public static String gridChallenge(List<String> grid) {
        for (int i = 0; i<grid.size(); i++) {
            char[] chars = grid.get(i).toCharArray();
            Arrays.sort(chars);
            grid.set(i, new String(chars));
        }

        for (int col = 0; col < grid.get(0).length(); col++) {
            for (int row = 0; row < grid.size()-1; row++) {
                if (grid.get(row).charAt(col) > grid.get(row+1).charAt(col)) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        // Teste simples
        List<String> grid1 = Arrays.asList("mpxz", "abcd", "wlmf");
        String result1 = gridChallenge(grid1);
        System.out.println(result1);  // Deve imprimir "YES"

        // Outro teste
        List<String> grid2 = Arrays.asList("aab", "aac", "bbc");
        String result2 = gridChallenge(grid2);
        System.out.println(result2);  // Deve imprimir "YES"
    }
}
