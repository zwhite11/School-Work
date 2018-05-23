package com.jhuep.web_development.pizzapolis.entity;
// Generated May 9, 2017 4:30:58 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Sides generated by hbm2java
 */
public class Sides implements java.io.Serializable {

    private Integer id;
    private String name;
    private String size;
    private Double price;
    private Set<OrderSides> orderSideses = new HashSet<OrderSides>(0);

    public Sides() {
    }

    public Sides(String name, String size, Double price, Set<OrderSides> orderSideses) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.orderSideses = orderSideses;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<OrderSides> getOrderSideses() {
        return this.orderSideses;
    }

    public void setOrderSideses(Set<OrderSides> orderSideses) {
        this.orderSideses = orderSideses;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.size);
        hash = 67 * hash + Objects.hashCode(this.price);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sides other = (Sides) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sides{" + "id=" + id + ", name=" + name + ", size=" + size + ", price=" + price + '}';
    }

}
