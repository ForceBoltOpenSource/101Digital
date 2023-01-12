package com.ca.order.domain;

import java.util.HashMap;
import java.util.Map;

public class FoodMenu {



private String foodName;
private String foodDescription;
private String foodCatalog;
private Double foodPrice;
private Integer id;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getFoodName() {
return foodName;
}

public void setFoodName(String foodName) {
this.foodName = foodName;
}

public String getFoodDescription() {
return foodDescription;
}

public void setFoodDescription(String foodDescription) {
this.foodDescription = foodDescription;
}

public String getFoodCatalog() {
return foodCatalog;
}

public void setFoodCatalog(String foodCatalog) {
this.foodCatalog = foodCatalog;
}

public Double getFoodPrice() {
return foodPrice;
}

public void setFoodPrice(Double foodPrice) {
this.foodPrice = foodPrice;
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
