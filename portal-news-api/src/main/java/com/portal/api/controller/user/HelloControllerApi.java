package com.portal.api.controller.user;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface HelloControllerApi {
    @GetMapping("/hello")
    public Object hello();
}


























