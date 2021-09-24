
public class CtoFTester {
  public static void main(String[] args) {
    System.out.println ("celsius -> fahrenheit");
    System.out.println ("0 -> " + celsiusToFahrenheit(0)) ;
    System.out.println ("100 -> " + celsiusToFahrenheit(100)) ;
    System.out.println ("5 -> " + celsiusToFahrenheit(5)) ;
    System.out.println ("fahrenheit -> celsius");
    System.out.println ("32 -> " + fahrenheitToCelsius(32)) ;
    System.out.println ("212 -> " + fahrenheitToCelsius(212)) ;
    System.out.println ("41 -> " + fahrenheitToCelsius(41)) ;
  }
  public static double celsiusToFahrenheit(double celsius) {
    double fahrenheit = (9.0/5.0)* celsius + 32;
    return fahrenheit;
  }
  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = (5.0/9.0)* (fahrenheit - 32);
    return celsius;

  }

}
