package com.lianggzone.rxjava2.samples.demos;

import io.reactivex.Maybe;
import io.reactivex.Observable;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpClientDemo2 {
    public static void main(String[] args) {
        Maybe.<String>just("http://www.163.com")
            .map(url -> {
                CloseableHttpClient client = HttpClients.createDefault();
                HttpGet get = new HttpGet(url);
                CloseableHttpResponse response = client.execute(get);
                return response;
            })
            .subscribe(response -> {
                int statusCode = response.getStatusLine().getStatusCode();
                if(statusCode == 200) {
                    String respStr = null;
                    HttpEntity entity = response.getEntity();
                    if(entity != null){
                        respStr = EntityUtils.toString(entity, "UTF-8");
                    }
                    System.out.println(respStr);
                    EntityUtils.consume(entity);
                }
            });
    }
}
