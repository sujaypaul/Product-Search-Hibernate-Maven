package com.nagarro.training.AdvanceJavaAssignment2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tshirts")
public class Tshirt {
//	@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
//	private int tid;
	@Id
	private String id;
	 private String name;
	 private Color color;
	 private Gender gender;
  	 private Size size;
     private String avalibilty;
     
     private double price;
     private double rating;
     
     
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public String getAvalibilty() {
		return avalibilty;
	}
	public void setAvalibilty(String avalibilty) {
		this.avalibilty = avalibilty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
    public String toString() {
        return "Student [id=" + id + ", Name=" + name + ", color" + color + ", gender=" + gender + ", size="+size+", avalibilty=" +avalibilty +"]";
    }

}
