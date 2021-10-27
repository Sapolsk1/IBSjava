import java.util.Scanner;

public class FinalHW3 {

    public static void main (String[] args) {
        System.out.print("Введите количество строк: ");
        Scanner scanner1= new Scanner(System.in);
        int numstr=scanner1.nextInt();
        String[] arr=new String[numstr];
        System.out.print("Введите строки ");
        for(int i=0; i<arr.length; i++){
            Scanner scanner2= new Scanner(System.in);
            arr[i]=scanner2.nextLine();
            System.out.println("Строка "+(i+1)+" "+arr[i]);
        }
        int [] nums=new int[arr.length];
        int max=0, prev=0, index=0;
        for(int i=0; i<arr.length; i++){
            nums[i]=countUniqueCharacters(arr[i]);
            max=Math.max(max,nums[i]);
            if(max != prev){
                index=i;
            }
            prev=max;
        }
        System.out.println("максимум уникальных символов "+max);
        System.out.println("В строке: "+(index+1)+" "+arr[index]);
    }


    public static int countUniqueCharacters(String str) {
        String lowerCase = str.toLowerCase();
        char characters[] = lowerCase.toCharArray();
        int countChars = str.length();
        for (int i = 0; i < characters.length; i++) {
            if (i != lowerCase.indexOf(characters[i])) {
                countChars--;
            }
        }
        return countChars;
    }
}
