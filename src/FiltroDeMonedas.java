import java.io.IOException;
import java.util.Scanner;

public class FiltroDeMonedas {
    private ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();

    public void filtrarTasasCambio(TasaDeCambio tasaDeCambio) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción de conversión:");
            System.out.println("1. USD a Pesos Colombianos (COP)");
            System.out.println("2. USD a Pesos Argentinos (ARS)");
            System.out.println("3. USD a Real Brasileño (BRL)");
            System.out.println("4. Real Brasileño a USD");
            System.out.println("5. Peso Argentino a USD");
            System.out.println("6. Peso Colombiano a USD");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirMoneda("USD", "COP");
                    break;
                case 2:
                    convertirMoneda("USD", "ARS");
                    break;
                case 3:
                    convertirMoneda("USD", "BRL");
                    break;
                case 4:
                    convertirMoneda("BRL", "USD");
                    break;
                case 5:
                    convertirMoneda("ARS", "USD");
                    break;
                case 6:
                    convertirMoneda("COP", "USD");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void convertirMoneda(String base, String destino) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de " + base + " a convertir: ");
        double cantidad = scanner.nextDouble();

        try {
            TasaDeCambio tasaDeCambio = conversorDeMoneda.mostrarTasaDeCambio(base,destino);
            double tasa = tasaDeCambio.getConversion_rate();  // Obtener la tasa directamente de `tasaDeCambio`
            System.out.println("Tasa de " + base + " a " + destino + ": " + tasa);
            double resultado = cantidad * tasa;
            System.out.println(cantidad + " " + base + " = " + resultado + " " + destino);
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al obtener la tasa de cambio: " + e.getMessage());
        }
    }

}