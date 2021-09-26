package Homework6;
/**
 * Единицы измерения массы:
 * грамм 1
 * кг 1000
 * центнер 10^5
 * тн 10^6
 */

public class ConvertMass extends Conventer{

    final double ratioGram = 1;
    final double ratioKilo = 1000;
    final double ratioCentner = 10000;
    final double ratioTon = 100000;



    int getType(){
        return 0;
    }

    double getValue(){
        return 0;
    }

    @Override
    double convert(double value, int type) {
        return 0;
    }
}
