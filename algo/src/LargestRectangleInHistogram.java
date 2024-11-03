import java.util.Stack;

public class LargestRectangleInHistogram {

    // Função para encontrar a maior área no histograma
    public static int largestRectangleArea(int[] heights) {
        int[] extendedHeights = new int[heights.length + 1];
        System.arraycopy(heights, 0, extendedHeights, 0, heights.length);
        extendedHeights[heights.length] = 0;

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i<extendedHeights.length; i++) {
            while (!stack.isEmpty() && extendedHeights[i] < extendedHeights[stack.peek()]) {
                int topIndex = stack.pop();
                int height = extendedHeights[topIndex];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        // Teste simples
        int[] heights1 = {2, 1, 5, 6, 2, 3};
        int area1 = largestRectangleArea(heights1);
        System.out.println(area1);  // Deve imprimir 10

        // Outro teste
        int[] heights2 = {2, 4};
        int area2 = largestRectangleArea(heights2);
        System.out.println(area2);  // Deve imprimir 4
    }
}
