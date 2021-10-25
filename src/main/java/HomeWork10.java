import java.util.*;

public class HomeWork10 {
        public static void main (String[] args) {
            System.out.println("Введите размерность матрицы\n Число строк: ");
            Scanner scan1= new Scanner(System.in);
            int str=scan1.nextInt();
            System.out.println("Число столбцов: ");
            Scanner scan2= new Scanner(System.in);
            int col=scan2.nextInt();
            int[][] matrix= new int[str][col];
            System.out.println("Заполните матрицу: ");
            for (int i=0; i < matrix.length; i++){
                for (int j=0; j < matrix[i].length; j++){
                    System.out.println("Заполните: Строка " + (i+1)+ " Колонка "+ (j+1));
                    Scanner scan3= new Scanner(System.in);
                    int num=scan3.nextInt();
                    matrix[i][j]=num;
                }
            }
            int[] arr2= new int[matrix[0].length];
            for (int i=0; i < arr2.length; i++){
                arr2[i]=matrix[0][i]*3;
            }
            System.out.print(Arrays.toString(arr2));
        }
}
