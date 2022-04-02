package com.qa.ims.persistence.domain;

import java.util.ArrayList;
import java.util.Objects;

public class Order {

	private Long id;
	String firstName;
	String surname;
	String name;
	String description;
	private int price;

	public Order(Long id, String firstName, String surname, String name, String description, Double price) {
	}

	public Order(Long id, String firstName, String surname, String name, String description, int price) {
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Order(Long id) {

	}

	public Order(String firstName, String surname, String name, String description) {
		// TODO Auto-generated constructor stub
	}

	public Order(Long id, String firstName, String surname, String name, String description) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getItem() {
		return name;
	}

	public void setItem(String item) {
		this.name = item;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "Order [id: " + id + ", firstName: " + firstName + ", surname: " + surname + ", item: " + name
				+ ", description: " + description + ", price: £" + price + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
