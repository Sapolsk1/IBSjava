package Homework6;

public class Main {
    public static void main(String[] args) {
        ConvertMass convertMass = new ConvertMass();
        ConvertDistance convertDistance = new ConvertDistance();

        convertMass.convert(convertMass.getUnit(), convertMass.getValue(), convertMass.getType());
        convertDistance.convert(convertDistance.getUnit(), convertDistance.getValue(), convertDistance.getType());
    }
}
