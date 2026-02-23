public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Diagonal Principal");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][i]);
        }
        System.out.println("Diagonal Secundaria");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][2 - i]);
        }
    }
}