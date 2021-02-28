package com.nishank.model;

import com.nishank.entities.DrinksOwnerFullName;

public class EasyDrinksModel {

	private Long id;
	private String drink_name;
	private String mainqty;
	private Long amount;
	private String seconfqty;
	private Long amount2;
	private String directions;
	private DrinksOwnerFullName fullName;

	public Long getId() {
		return id;
	}

	public DrinksOwnerFullName getFullName() {
		return fullName;
	}

	public void setFullName(DrinksOwnerFullName fullName) {
		this.fullName = fullName;
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

	public String getSeconfqty() {
		return seconfqty;
	}

	public void setSeconfqty(String seconfqty) {
		this.seconfqty = seconfqty;
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
