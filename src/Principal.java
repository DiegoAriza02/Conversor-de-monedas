import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        ConversorDeMoneda conversor = new ConversorDeMoneda();
        try {

            conversor.mostrarTasaDeCambio("USD","COP");


            FiltroDeMonedas filtro = new FiltroDeMonedas();
            filtro.filtrarTasasCambio(conversor.mostrarTasaDeCambio("USD","COP"));
        } catch (IOException | InterruptedException e) {
            System.out.println("Error en la solicitud: " + e.getMessage());
        }
    }
}
