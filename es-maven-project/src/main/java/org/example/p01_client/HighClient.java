package org.example.p01_client;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

public class HighClient {
    public static void main(String[] args) {
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http")));




        try {
            esClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
