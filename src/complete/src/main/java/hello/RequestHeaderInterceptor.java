package hello;

import java.io.IOException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

/* Copyright (C) 2017 Ilakkuvaselvi Manoharan - All Rights Reserved
 * 
 */


public class RequestHeaderInterceptor implements ClientHttpRequestInterceptor{
	
	@Override
    public ClientHttpResponse intercept(
            HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {

        HttpHeaders headers = request.getHeaders();
        headers.add("X-Cisco-Meraki-API-Key", "741f8f89617deccbbc77e980e340b7624fb98a34");
        headers.add("Content-Type", "application/json");
        return execution.execute(request, body);
    }

}
