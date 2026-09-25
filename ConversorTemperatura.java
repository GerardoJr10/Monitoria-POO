public class ConversorTemperatura {

    // Pertence à classe (static) e não pode ser alterado após inicializado (final)
    public static final double KELVIN_OFFSET = 273.15;

    // Métodos estáticos: podem ser chamados sem instanciar objetos
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // Classe interna estática para testar a classe externa
    public static class TesteConversor {
        public static void main(String[] args) {
            double celsius = 100;
            double fahrenheit = ConversorTemperatura.celsiusParaFahrenheit(celsius);
            System.out.println(celsius + "°C = " + fahrenheit + "°F");

            double f2 = 32;
            double c2 = ConversorTemperatura.fahrenheitParaCelsius(f2);
            System.out.println(f2 + "°F = " + c2 + "°C");

            System.out.println("KELVIN_OFFSET = " + ConversorTemperatura.KELVIN_OFFSET);
        }
    }
}
