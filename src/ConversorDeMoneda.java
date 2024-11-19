import com.google.gson.Gson;
import java.io.IOException;

public class ConversorDeMoneda {

    public TasaDeCambio mostrarTasaDeCambio(String base, String destino) throws IOException, InterruptedException {
        ApiCliente apiCliente = new ApiCliente();
        String json = apiCliente.obtenerDatosJson(base, destino);

        Gson gson = new Gson();
        return gson.fromJson(json, TasaDeCambio.class);
    }
}