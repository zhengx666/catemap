package org.seckill.entity;

/**
 * Created by zheng on 2016/6/20.
 */
public class Restaurant {
    private long restaurantId;
    private String restaurantName;
    private String userName;
    private double latitude;
    private  double longitude;
    private int recommendedStars;
    private String recommendedReason;

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getRecommendedStars() {
        return recommendedStars;
    }

    public void setRecommendedStars(int recommendedStars) {
        this.recommendedStars = recommendedStars;
    }

    public String getRecommendedReason() {
        return recommendedReason;
    }

    public void setRecommendedReason(String recommendedReason) {
        this.recommendedReason = recommendedReason;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", restaurantName='" + restaurantName + '\'' +
                ", userName='" + userName + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", recommendedStars=" + recommendedStars +
                ", recommendedReason='" + recommendedReason + '\'' +
                '}';
    }
}
