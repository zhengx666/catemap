package org.seckill.dao;

import org.seckill.entity.Restaurant;

import java.util.List;

/**
 * Created by zheng on 2016/6/20.
 */
public interface RestaurantDao {
    List<Restaurant> queryAll();
}
