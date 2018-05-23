package com.jhuep.web_development.pizzapolis.entity;
// Generated May 9, 2017 4:30:58 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * PizzaCrust generated by hbm2java
 */
public class PizzaCrust implements java.io.Serializable {

    private Integer id;
    private String crustName;
    private Double cost;
    private Set<Pizza> pizzas = new HashSet<Pizza>(0);

    public PizzaCrust() {
    }

    public PizzaCrust(String crustName, Double cost, Set<Pizza> pizzas) {
        this.crustName = crustName;
        this.cost = cost;
        this.pizzas = pizzas;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCrustName() {
        return this.crustName;
    }

    public void setCrustName(String crustName) {
        this.crustName = crustName;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Set<Pizza> getPizzas() {
        return this.pizzas;
    }

    public void setPizzas(Set<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.crustName);
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
        final PizzaCrust other = (PizzaCrust) obj;
        if (!Objects.equals(this.crustName, other.crustName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PizzaCrust{" + "id=" + id + ", crustName=" + crustName + ", cost=" + cost + '}';
    }

}
