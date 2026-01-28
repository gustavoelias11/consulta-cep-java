import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("--=== Consulta CEP ===---");
        System.out.println("Informe o CEP que deseja consultar:");
        String cep = leitura.nextLine();
        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);

            System.out.println("Resultado do JSON que vem da API");
            System.out.println(novoEndereco);

            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvaJson(novoEndereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}