package com.radcortez.rest.ssl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Roberto Cortez
 */
@Controller
@RequestMapping("/")
public class RestService {
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String get() {
        return "Called the get Rest Service";
    }
}
