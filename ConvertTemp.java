import java.util.*;
public class ConvertTemp {
    public static void main(String[] args) {
        double celsius  = 36.50;
        double [] res = convertTemperature(celsius);
        System.out.println(Arrays.toString(res));

    }
    public static double[] convertTemperature(double celsius) {
        double kel = celsius + 273.15;
        double fah = celsius * 1.80 + 32.00;
        double [] arr = { kel,fah};


        return arr;
    }
}
