import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ApiCliente {

    public String obtenerDatosJson(String base, String destino) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/8e7556a79bac01862b65c71f/pair/" +
                URLEncoder.encode(base, StandardCharsets.UTF_8) + "/" +
                URLEncoder.encode(destino, StandardCharsets.UTF_8);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
