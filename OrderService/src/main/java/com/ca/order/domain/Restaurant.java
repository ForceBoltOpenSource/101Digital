package com.ca.order.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {



private String restaurantName;
private String restaurantCatalog;
private List<FoodMenu> foodMenu = null;
private Address address;
private Integer id;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getRestaurantName() {
return restaurantName;
}

public void setRestaurantName(String restaurantName) {
this.restaurantName = restaurantName;
}

public String getRestaurantCatalog() {
return restaurantCatalog;
}

public void setRestaurantCatalog(String restaurantCatalog) {
this.restaurantCatalog = restaurantCatalog;
}

public List<FoodMenu> getFoodMenu() {
return foodMenu;
}

public void setFoodMenu(List<FoodMenu> foodMenu) {
this.foodMenu = foodMenu;
}

public Address getAddress() {
return address;
}

public void setAddress(Address address) {
this.address = address;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
