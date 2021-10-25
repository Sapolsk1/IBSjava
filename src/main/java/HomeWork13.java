import java.util.*;

public class HomeWork13 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean res = startContainEnd(str);
        if (res) {
            String upper = str.toUpperCase(Locale.ROOT);
            System.out.println(upper);
        }
        String repl = str.replaceAll("a", "o").substring(7, 11);
        System.out.println(repl);
    }

    private static boolean startContainEnd(String str) {

        boolean cont = str.contains("Java");
        boolean start = str.startsWith("I like");
        boolean ends = str.endsWith("!!!");
        if (cont && start && ends) {
            System.out.println("Все содержится");
            return true;
        } else {
            System.out.println("Нет необходимой подстроки");
            return false;
        }
    }
}
