public class largest_row_column {
    
    public static void main(String[] args) {
        
        int[][] matrix = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matrix[i][j] = (Math.random() < 0.5) ? 1 : 0;
            }
        }

        printMatrix(matrix);

        System.out.println();

        showValues(matrix);
    }

    public static void printMatrix(int matrix[][]){

        for (int i = 0 ; i < 4; i++){

            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println();
        }
    }

    public static void showValues(int matrix[][]){

        //checking rows

            int max_R_sum = 0;
            int max_row = 0;

            for(int i = 0; i < 4; i++){

                int sum = 0;

                for (int j = 0; j < 4; j++) {
                    sum += matrix[i][j];
                }

                if (sum > max_R_sum) {
                    max_R_sum = sum;
                    max_row = i;
                }
            }


        //checking columns

            int max_C_sum = 0;
            int max_column = 0;

            for(int j = 0; j < 4; j++){

                int sum = 0;

                for (int i = 0; i < 4; i++) {
                    sum += matrix[i][j];
                }

                if (sum > max_C_sum) {
                    max_C_sum = sum;
                    max_column = j;
                }
            }

            System.out.println("Largest Row index: " + max_row);
            System.out.println("Largest Column index: " + max_column);
    }
}
