package com.baeldung.spring.cloud.config.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerProductController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void addLink(String userId, String someValue) {
        String name = redisTemplate.getClientList().get(0).getName();
        redisTemplate.opsForList().leftPush(userId, someValue);
    }

    @GetMapping("/products")
    public String getMessage() {
        addLink("a", "b");
        return "A brand new product";
    }
}
