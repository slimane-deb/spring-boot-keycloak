package com.demo.keycloak;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class HelloWorldController {

    @GetMapping("/users")
    public Map<String, String> hello(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        return Collections.singletonMap("response", "Hello "+currentPrincipalName);

    }
}
