package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Restaurant;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zheng on 2016/6/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class RestaurantDaoTest {
    @Resource
    private RestaurantDao restaurantdao;
    @Test
    public void testQueryAll() throws Exception {
        List<Restaurant> restaurants = restaurantdao.queryAll();
        for(Restaurant restaurant : restaurants){
            System.out.println(restaurant);
        }
    }
}
