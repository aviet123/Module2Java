package ArrayFunctionAndOOP;

public class tinhhangcheo {
    public static void main(String[] args) {
        int count = 0;
        int sum =0;
        int[][] matrix = new int[5][5];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i <matrix.length ; i++) {
            sum += matrix[i][count];
            count++;
        }
        System.out.println(sum);
    }
}
