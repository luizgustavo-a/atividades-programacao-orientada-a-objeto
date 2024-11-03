import java.util.List;
import java.util.Arrays;

public class CountingInversions {

    public static long countInversions(List<Integer> arr) {
        long inversionCounter = 0;
        for(int i = 0; i<arr.size()-1; i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inversionCounter++;
                }
            }
        }
        return inversionCounter;
    }

    public static void main(String[] args) {
        // Teste simples
        List<Integer> arr = Arrays.asList(2, 4, 1, 3, 5);
        long inversions = countInversions(arr);
        System.out.println(inversions);  // Deve imprimir 3
    }
}
