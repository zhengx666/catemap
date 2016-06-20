package org.seckill.web;

import org.seckill.dto.CatemapResult;
import org.seckill.entity.Restaurant;
import org.seckill.service.CatemapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zheng on 2016/6/20.
 */
@Controller
@RequestMapping("/catemap")
public class CatemapController {
    @Autowired
    private CatemapService catemapService;

    @RequestMapping(value = "/list",
        method = RequestMethod.GET,
        produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public CatemapResult<List<Restaurant>> getRestaurantList(){
        List<Restaurant> list = catemapService.getRestaurantList();
        if (list == null){
            return new CatemapResult<List<Restaurant>>(false,"没有数据");
        }
        return new CatemapResult<List<Restaurant>>(true,list);
    }

    @RequestMapping(value = "/add",
        method = RequestMethod.POST)
    public void createRestaurant(@RequestParam("map-lng") double mapLng,
                                  @RequestParam("map-lat") double mapLat,
                                  @RequestParam("restaurant-name") String restaurantName,
                                  @RequestParam("recommended-stars") int recommendedStars,
                                  @RequestParam("recommended-reason") String recommendedReason
                                 ){
        System.out.println(":::::");
        System.out.println(mapLng+"  "+mapLat+"  "+ restaurantName);
    }
}
