package com;

import com.baizhi.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

@SpringBootTest(classes = Application.class)
public class Test1 {
    @Autowired
    private StringRedisTemplate str;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    //对key操作
    public void test(){
        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        str.keys("*").forEach(a-> System.out.println(a));
        System.out.println(str.delete("name"));

        System.out.println("666");

    }

    
    @Test
    public void test2(){

    }


    @Test
    public void test3(){

    }



}
