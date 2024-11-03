import java.util.Stack;

public class TrappingRainWater {

    // Função para calcular a água capturada
    public static int trap(int[] height) {
        if (height.length == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        int totalWater = 0;

        for (int i = 0; i < height.length; i++) {
            // Enquanto a pilha não estiver vazia e a altura atual for maior que a altura na posição do topo da pilha
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();  // Pega a posição do topo
                if (stack.isEmpty()) break;  // Se a pilha estiver vazia, não pode capturar água

                // Calcula a distância entre a barra atual e a barra que está agora no topo da pilha
                int distance = i - stack.peek() - 1;
                // Calcula a altura da água que pode ser capturada
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
                System.out.println("hei: " + height[i] + " peek: " + height[stack.peek()] + " top: " + height[top]);
                System.out.println("dis: " + distance + " hei: " + boundedHeight + " = " + distance * boundedHeight);
                totalWater += distance * boundedHeight;  // Acumula a água total
            }
            stack.push(i);  // Adiciona a barra atual à pilha
        }

        return totalWater;
    }

    public static void main(String[] args) {
        // Teste 1
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height1));  // Deve imprimir 6

        // Teste 2
        int[] height2 = {4,2,0,3,2,5};
        System.out.println(trap(height2));  // Deve imprimir 9

        // Teste 3: Sem água capturada
        int[] height3 = {1,2,3,4,5};
        System.out.println(trap(height3));  // Deve imprimir 0

        // Teste 4: Todas as barras com a mesma altura
        int[] height4 = {2,2,2,2};
        System.out.println(trap(height4));  // Deve imprimir 0

        // Teste 5: Grade Vazia
        int[] height5 = {};
        System.out.println(trap(height5));  // Deve imprimir 0

        // Teste 6: Uma única barra
        int[] height6 = {5};
        System.out.println(trap(height6));  // Deve imprimir 0

        // Teste 7: Dois picos
        int[] height7 = {3, 0, 2, 0, 4};
        System.out.println(trap(height7));  // Deve imprimir 7
    }
}
