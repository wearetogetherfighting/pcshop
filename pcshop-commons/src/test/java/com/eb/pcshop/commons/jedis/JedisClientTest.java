/*package com.eb.pcshop.commons.jedis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class JedisClientTest {
    @Autowired
    private JedisClient jedisClient;

    @Test
    public void testGet() throws Exception {
        System.out.println(jedisClient.get("name"));
    }

    @Test
    public void testSet() throws Exception {
        jedisClient.set("age","25");
        jedisClient.set("name","kongzeqi");
        jedisClient.set("hibbit","game");
        jedisClient.set("game","dnf");
        jedisClient.set("work","it");
        jedisClient.set("bad","huaqian");
    }

    @Test
    public void t1() throws IOException {
        String name = jedisClient.get("name");
        String age = jedisClient.get("age");
        String hibbit = jedisClient.get("hibbit");
        String work = jedisClient.get("work");
        String bad = jedisClient.get("bad");
        String game = jedisClient.get("game");
        System.out.println(name);
        System.out.println(age);
        System.out.println(hibbit);
        System.out.println(work);
        System.out.println(bad);
        System.out.println(game);
        *//*Set<HostAndPort> nodes = new HashSet<HostAndPort>();
        nodes.add(new HostAndPort("39.106.15.147", 7001));
        nodes.add(new HostAndPort("39.106.15.147", 7002));
        nodes.add(new HostAndPort("39.106.15.147", 7003));
        nodes.add(new HostAndPort("39.106.15.147", 7004));
        nodes.add(new HostAndPort("39.106.15.147", 7005));
        nodes.add(new HostAndPort("39.106.15.147", 7006));

        JedisCluster jedisCluster = new JedisCluster(nodes);

        System.out.println(jedisCluster.get("name"));
        jedisCluster.close();*//*
    }

}*/
