package com.fyfe.mod.http;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class AWSHttpRequest {

    public static final String URL = "https://mwagvlissc.execute-api.us-west-2.amazonaws.com/hello-world";

    public static void wah() {
        try(CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(URL);

            HttpResponse response = client.execute(request);

            String text = new BufferedReader(new InputStreamReader(response.getEntity().getContent()))
                    .lines()
                    .collect(Collectors.joining("\n"));

            System.out.println(text);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
