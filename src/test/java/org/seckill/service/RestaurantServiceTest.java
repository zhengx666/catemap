package org.seckill.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by zheng on 2016/6/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"
})
public class RestaurantServiceTest {
    @Autowired
    private CatemapService catemapService;

    @Test
    public void testGetRestaurantList(){
        List<Restaurant> list = catemapService.getRestaurantList();
        for (Restaurant restaurant : list){
            System.out.println(restaurant);
        }
    }

}
