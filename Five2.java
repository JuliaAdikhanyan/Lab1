// Упражнение 5-2 (Опционально). Расширенное использование массивов
public class Five2 {

    public static void main(String[] args) {
        int size = 3;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((matrix[i][j] = (int) Math.round(Math.random() * 10)) + " ");
            }
            System.out.println();
        }
        System.out.println();

        // транспортирование матрицы
        // работает за О(n^2)
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
