package com.nishank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class EasyDrinks {

	@Id
	private Long id;
	private String drink_name;
	private String mainqty;
	@Column(name="amount1")
	private Long amount;	
	private String secondqty;
	/*
	 * This value will not be saved in the DB
	 */
	@Transient
	private Long amount2;
	private String directions;
	private DrinksOwnerFullName fullName;

	public DrinksOwnerFullName getFullName() {
		return fullName;
	}

	public void setFullName(DrinksOwnerFullName fullName) {
		this.fullName = fullName;
	}

	public void setSecondqty(String secondqty) {
		this.secondqty = secondqty;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDrink_name() {
		return drink_name;
	}

	public void setDrink_name(String drink_name) {
		this.drink_name = drink_name;
	}

	public String getMainqty() {
		return mainqty;
	}

	public void setMainqty(String mainqty) {
		this.mainqty = mainqty;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getSecondqty() {
		return secondqty;
	}

	public void setSeconfqty(String secondqty) {
		this.secondqty = secondqty;
	}

	public Long getAmount2() {
		return amount2;
	}

	public void setAmount2(Long amount2) {
		this.amount2 = amount2;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}
}
