
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APItester {
    public static void main(String[] args) {
        
        HttpClient client = HttpClient.newHttpClient();


        String url = "https://official-joke-api.appspot.com/random_joke";
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        System.out.println("Pinging serveer: " +url);
        System.out.println("Waiting for respnose...\n");

        try {
            long startTime = System.currentTimeMillis();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            long endTime = System.currentTimeMillis();
            long timeTaken=endTime-startTime;

            String rawData = response.body();


            int startSetup = rawData.indexOf("\"setup\":\"")+9;
            int endSetup = rawData.indexOf("\"", startSetup);
            String cleanSetup = rawData.substring(startSetup,endSetup);

            int startPunchline = rawData.indexOf("\"punchline\":\"") +13;
            int endPunchline = rawData.indexOf("\"", startPunchline);
            String cleanPunchline =rawData.substring(startPunchline, endPunchline);

            System.out.println("---CONNECTION SUCCESS---");
            System.out.println("Latency:" + timeTaken + "milliseconds");
            System.out.println("\n" + cleanSetup);
            System.out.println(cleanPunchline);


        } catch (Exception e) {
            System.out.println("The request failed!" +e.getMessage());
        } 

    }
    
}
