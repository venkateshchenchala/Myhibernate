package com.venky.Hibernateprojectdemoo.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="supermarket_table")
public class Supermarket implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Supermark [id=" + id + ", name=" + name + ", price=" + price + "]";
}
}
