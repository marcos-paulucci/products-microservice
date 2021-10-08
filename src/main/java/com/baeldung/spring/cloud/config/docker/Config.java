package com.baeldung.spring.cloud.config.docker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
class Config {

    @Bean
    public JedisConnectionFactory redisConnectionFactory() {

        String redis = "redis";
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration(redis, 6379);
        System.out.println("hostname is " + redis);
        return new JedisConnectionFactory(config);
    }
}