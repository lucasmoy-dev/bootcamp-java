package academy.atl.trivia;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatGptClient {
    public String enviarPregunta(String pregunta) {
        String respuestaDeChatGpt = "";
        try {
            // URL de la API de ChatGPT
            URL url = new URL("https://api.openai.com/v1/chat/completions");

            // Establecer la conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");

            // Establecer los encabezados de la solicitud
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer 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");

            connection.setDoOutput(true);
            DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

            // Crear el cuerpo de la solicitud
            String requestBody =
                    "{\"model\": \"gpt-3.5-turbo\", \"messages\": [{\"role\": \"system\", \"content\": \"Dame una pregunta para un juego de trivia que contenga la siguiente estrucuta category, question, answer, explanation, options \"}, {\"role\": \"user\", \"content\": \"Who won the world series in 2020?\"}]}";

            // Enviar la solicitud
            outputStream.writeBytes(requestBody);
            outputStream.flush();
            outputStream.close();

            // Obtener la respuesta
            int responseCode = connection.getResponseCode();
            BufferedReader inputReader;
            if (responseCode == HttpURLConnection.HTTP_OK) {
                inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            } else {
                inputReader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            }

            // Leer la respuesta línea por línea
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = inputReader.readLine()) != null) {
                response.append(inputLine);
            }
            inputReader.close();
            // Imprimir la respuesta
            System.out.println(response.toString());
            respuestaDeChatGpt = response.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return respuestaDeChatGpt;
    }
}
