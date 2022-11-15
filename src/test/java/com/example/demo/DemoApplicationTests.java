package com.example.demo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.HashMap;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

        HashMap<String, Object> map = new HashMap<>();

        Calendar instance = Calendar.getInstance();
        // 20秒后令牌token失效
        instance.add(Calendar.HOUR,1);

        String token = JWT.create()
                .withHeader(map) // header可以不写，因为默认值就是它
                .withClaim("userId", 21)  //payload
                .withClaim("username", "xiaoshuang")
                .withExpiresAt(instance.getTime()) // 指定令牌的过期时间
                .sign(Algorithm.HMAC256("XIAOSHUANG"));//签名

        System.out.println(token);

    }

}
