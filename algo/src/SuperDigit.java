public class SuperDigit {

    // Função para calcular o super dígito
    public static int superDigit(String n, int k) {
        int firstSum = 0;
        for (char c : n.toCharArray()) {
            firstSum+= Character.getNumericValue(c);
        }
        firstSum*=k;

        return getSuperDigit(firstSum);
    }

    private static int getSuperDigit(int number) {
        if(number<10) {
            return number;
        }

        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number -= number % 10;
            number /= 10;
        }

        return getSuperDigit(sum);
    }

    public static void main(String[] args) {
        // Teste simples
        String n = "9875";
        int k = 4;
        int result = superDigit(n, k);
        System.out.println(result);  // Deve imprimir 8

        // Outro teste
        String n2 = "123";
        int k2 = 3;
        int result2 = superDigit(n2, k2);
        System.out.println(result2);  // Deve imprimir 9
    }
}
