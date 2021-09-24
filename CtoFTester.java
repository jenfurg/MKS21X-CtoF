public class CtoFTester {
  public static void celsiusToFahrenheit(double celsius) {
    double farenheit = (9.0/5.0)*celsius + 32;
    System.out.println(farenheit);
  }
  public static void farenheitToCelsius(double farenheit) {
    double celsius = (5.0/9.0)*farenheit - 32;
    System.out.println(celsius);
  }
}
