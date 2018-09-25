package com.lianggzone.rxjava2.samples.demos;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import sun.net.www.http.HttpClient;

import java.io.IOException;

public class HttpClientDemo {
    public static void main(String[] args) {
        HttpEntity entity = null;
        try {
            String url = "http://www.163.com";
            CloseableHttpClient client = HttpClients.createDefault();

            HttpGet get = new HttpGet(url);
            CloseableHttpResponse response = client.execute(get);

            int statusCode = response.getStatusLine().getStatusCode();
            if(statusCode == 200) {
                String respStr = null;
                entity = response.getEntity();
                if(entity != null){
                    respStr = EntityUtils.toString(entity, "UTF-8");
                }
                System.out.println(respStr);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                EntityUtils.consume(entity);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
