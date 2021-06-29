package ex1;

public class ConversionUtil {
    public static double fahrenheitToCelsius(double fDegree){
        return (fDegree-32)/1.8;
    }

    public static double celciusToFahrenheit(double cDegree){
        return cDegree * 1.8 + 32;
    }

    public static void main(String[] args) {

        double f = 90.5;
        double c = fahrenheitToCelsius(f);
        System.out.printf("%.1f F = %.1f C\n", f, c);
        double c1 = 30.5;
        double f1 = celciusToFahrenheit(c1);
        System.out.printf("%.1fC = %.1fF", c1, f1);

    }


}
