package com.radcortez.rest.ssl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestOperations;

/**
 * @author Roberto Cortez
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RestClientConfig.class)
public class RestServiceClientIT {
    @Autowired
    private RestOperations rest;

    @Test
    public void testRestRequest() throws Exception {
        ResponseEntity<String> response = rest.getForEntity("https://localhost:8443/", String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }
}
