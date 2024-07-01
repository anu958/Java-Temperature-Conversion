import java.util.Scanner;

public class TemperatureConverter {
    
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
    
    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }
    
    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    
    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter between Celsius, Fahrenheit, and Kelvin");
        System.out.println("Enter the temperature value and its unit (Celsius / Fahrenheit / Kelvin)");
        System.out.print("Example: 25 Celsius -> ");
        
        String input = scanner.nextLine().trim();
        
        // Splitting the input into value and unit
        String[] parts = input.split("\\s+");
        
        if (parts.length != 2) {
            System.out.println("Invalid input format. Please try again.");
            return;
        }
        
        try {
            double value = Double.parseDouble(parts[0]);
            String unit = parts[1].toLowerCase();
            
            switch (unit) {
                case "celsius":
                case "c":
                    double celsius = value;
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    double kelvin = celsiusToKelvin(celsius);
                    System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit and %.2f Kelvin.\n", celsius, fahrenheit, kelvin);
                    break;
                case "fahrenheit":
                case "f":
                    double fahrenheitInput = value;
                    double celsiusFromF = fahrenheitToCelsius(fahrenheitInput);
                    double kelvinFromF = fahrenheitToKelvin(fahrenheitInput);
                    System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius and %.2f Kelvin.\n", fahrenheitInput, celsiusFromF, kelvinFromF);
                    break;
                case "kelvin":
                case "k":
                    double kelvinInput = value;
                    double celsiusFromK = kelvinToCelsius(kelvinInput);
                    double fahrenheitFromK = kelvinToFahrenheit(kelvinInput);
                    System.out.printf("%.2f Kelvin is equal to %.2f Celsius and %.2f Fahrenheit.\n", kelvinInput, celsiusFromK, fahrenheitFromK);
                    break;
                default:
                    System.out.println("Invalid unit. Please enter Celsius, Fahrenheit, or Kelvin.");
                    break;
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid temperature value.");
        }
        
        scanner.close();
    }
}
