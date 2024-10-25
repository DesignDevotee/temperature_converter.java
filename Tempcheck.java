import java.util.Scanner;

public class Tempcheck {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("1.celsius to fahrenheit");
        System.out.println("2.fahrenheit to celsius");  
        
        double ConvertedTemperature ;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1 -> {
                System.out.println("enter celcius temperature");
                double c =sc.nextDouble();
                ConvertedTemperature = celsiusToFahrenheit(c);
                System.out.println(ConvertedTemperature + " fahrenheit");
            }
            case 2 -> {
                System.out.println("enter fahrenheit temperature");
                double f =sc.nextDouble();
                ConvertedTemperature = FahrenheitToCelsius(f);
                System.out.println(ConvertedTemperature + " celcius");
            }
            default -> System.out.println("enter correct key (1 / 2)");
        }
        sc.close();
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }
    
    public static double FahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

}
