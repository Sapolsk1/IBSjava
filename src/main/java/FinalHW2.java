import java.util.Scanner;

public class FinalHW2 {
    public static void main(String[] args) {
        System.out.println("Введите простое уравнение из 5 знаков: ");
        Scanner scanner1 = new Scanner(System.in);
        String str=scanner1.nextLine();
        String[] arr=typedToArray(str);
        System.out.println("Ваше уравнение: "+str);
//        System.out.println(Arrays.toString(arr));

        if (arr[0].contains("x")){
            System.out.println("x="+operationLeft(arr));
        } else if (arr[4].contains("x")){
            System.out.println("x="+operationRight(arr));
        } else if(arr[2].contains("x")){
            System.out.println("x="+operationThird(arr));
        } else {
            System.out.println("Ни одно из этих");
        }
    }

    private static String[] typedToArray(String str) {
        String delimeter = "";
        return  str.split(delimeter);
    }
    private static int operationRight(String[] str){
        switch (str[1]){
            case "+":
                return Integer.parseInt(str[0])+Integer.parseInt(str[2]);
            case "-":
                return Integer.parseInt(str[0])-Integer.parseInt(str[2]);
            default: System.out.println("Операция не определена");
                return 0;
        }
    }
    private static int operationLeft(String[] str){
        switch (str[1]){
            case "+":
                return Integer.parseInt(str[4])-Integer.parseInt(str[2]);
            case "-":
                return Integer.parseInt(str[4])+Integer.parseInt(str[2]);
            default: System.out.println("Операция не определена");
                return 0;
        }
    }
    private static int operationThird(String[] str){
        switch (str[1]){
            case "+":
                return Integer.parseInt(str[4])-Integer.parseInt(str[0]);
            case "-":
                return Integer.parseInt(str[0])-Integer.parseInt(str[4]);
            default: System.out.println("Операция не определена");
                return 0;
        }
    }
}
