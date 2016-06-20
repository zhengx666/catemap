package org.seckill.service.impl;

import org.seckill.dao.RestaurantDao;
import org.seckill.entity.Restaurant;
import org.seckill.service.CatemapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zheng on 2016/6/20.
 */
@Service
public class CatemapServiceImpl implements CatemapService{
    @Autowired
    private RestaurantDao restaurantdao;
    public List<Restaurant> getRestaurantList() {
        return restaurantdao.queryAll();
    }
}
