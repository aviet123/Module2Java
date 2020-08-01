package ArrayFunctionAndOOP;

public class FindMinInArr2 {
    public static void main(String[] args) {
        int indexrow = 0;
        int indexcolumn = 0;
        int[][] matrix = new int[5][5];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
        int min = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (min > matrix[row][column]){
                    min = matrix[row][column];
                    indexrow = row;
                    indexcolumn = column;
                }
            }
        }
        System.out.println("min value in matrix is "+min+" at row "+indexrow+" and column "+indexcolumn);
    }
}
