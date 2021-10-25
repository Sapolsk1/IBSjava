import java.util.*;


public class HomeWork9 {
        public static void main (String[] args) {
            System.out.println("Введите размер массива: ");
            Scanner scan= new Scanner(System.in);
            int num = scan.nextInt();
            double[] arr= new double[num];
            for (int i=0; i < arr.length; i++){
                System.out.println("Введите данные для элемента: "+ i);
                Scanner scan2= new Scanner(System.in);
                arr[i]= scan2.nextDouble();
            }
            double average = midAriphmethic(arr);
            double[] arr2=new double[num];
            for (int i=0; i < arr2.length; i++){
                arr2[i]=arr[i]*average;
            }
            System.out.print(Arrays.toString(arr2));
        }
        private static double midAriphmethic (double[] arr) {
            double average=0;
            for (int i=0; i< arr.length; i++){
                average +=arr[i];
            }
            return average/arr.length;
        }
}
