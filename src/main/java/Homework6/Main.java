package Homework6;

public class Main {
    public static void main(String[] args) {
        ConvertMass convertMass = new ConvertMass();
        ConvertDistance convertDistance = new ConvertDistance();
        if(convertMass.getUnit() == 1) {
            convertMass.convert(convertMass.getValue(), convertMass.getType());
        }else
        convertDistance.convert(convertDistance.getValue(), convertDistance.getType());
    }
}
