import java.util.Arrays;
import java.util.Locale;

public class HomeWork13 {
    public static void main(String[] args) {
        String[] numbers={"1","2","3","4","5","6","7","8","9","0"};
        String[] cyrillic={"а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х","ц","ч","ш","щ","ъ","ы","ъ","э","ю","я"};
        String str="I love java 8 Я люблю java 14 core1";
        String[] strArray=typedToArray(str);
        String[] newStrArr=arrayLatin(strArray,numbers, cyrillic);
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(newStrArr));
        printArr(newStrArr);

    }

    private static String[] typedToArray(String str) {
        String delimeter = " ";
        String[] strArray= str.split(delimeter);
        return strArray;
    }
    private static String[] arrayLatin(String[] str1, String[] numbers, String[] cyrillic) {
        String[] newStr=new String[10];
        boolean flag=true;
        int k=0;
        for (int i=0; i<str1.length-1; i++){
            flag=true;
            for(int j=0; j<numbers.length;j++){
                if (str1[i].toLowerCase(Locale.ROOT).contains(numbers[j])) {
                    flag = false;
                    break;
                }
            }
            for(int w=0; w<cyrillic.length;w++){
                if (str1[i].toLowerCase(Locale.ROOT).contains(cyrillic[w])) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                newStr[k]=str1[i];
                ++k;

            }
        }
        System.out.println("Всего слов с латиницей: " + k);
        return newStr;
    }
    private static void printArr(String[] str) {
        System.out.print("[");
        for (int i=0; i<str.length; i++){
            if (str[i]!=null) {
                System.out.print(str[i]+" ");
            }
        }
        System.out.print("]");
    }

}