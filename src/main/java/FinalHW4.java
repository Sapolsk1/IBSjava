import java.util.Scanner;

public class FinalHW4 {
    public static void main (String[] args) {
        System.out.println("Загадка: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.");
        int count=3;
        String rightAnswer="Заархивированный вирус";
        String hint="подсказка";
        System.out.println("У вас 3 попытки, на первой попытке можно получить подсказку написав Подсказка");
        boolean flag = true;
        for(; count>0; count--) {
            Scanner scanner1 = new Scanner(System.in);
            String notLower= scanner1.nextLine();
            String answer=notLower.toLowerCase();
            if(answer.toLowerCase().equals(rightAnswer)){
                System.out.println("Правильно!");
                System.exit(0);
            } else if(answer.equals(hint) & count<3) {
                System.out.println("Подсказка уже недоступна");
                ++count;
            } else if (answer.equals(hint) & flag==true) {
                System.out.println("Архив");
                --count;
                flag=false;
            } else if (answer.equals(hint) & flag==false) {
                System.out.println("Подсказка уже недоступна");
                ++count;
            } else if (!answer.equals(rightAnswer) & count==1){
                System.out.println("Обидно, приходи в другой раз");
            } else if (!answer.equals(rightAnswer) & count>1){
                System.out.println("Подумай еще!");
            }
        }
    }
}
