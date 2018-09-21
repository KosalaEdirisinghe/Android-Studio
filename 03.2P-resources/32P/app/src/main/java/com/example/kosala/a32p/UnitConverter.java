package com.example.kosala.a32p;

public class UnitConverter {
    public static double inchToCm(double inch) {
        return inch*2.54;
    }

    public static double feetToCm(double feet){
        return feet*12*2.54;
    }

    public static double mileToCm(double mile){
        return mile*5280*12*2.54;
    }
    public static double inchToM(double inch){
        return inch*2.54/100;
    }
    public static double feetToM(double feet) {
        return feet * 12 * 2.54/100;
    }
    public static double mileToM(double mile) {
        return mile * 5280 * 12 * 2.54/100;
    }

}
