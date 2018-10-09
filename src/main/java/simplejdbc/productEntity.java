/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejdbc;

/**
 *
 * @author ahochart
 */
public class productEntity {
	// TODO : ajouter les autres propriétés
	private int productId;
	private int cost;
	private String addressLine1;

	public productEntity(int customerId, int cost, String addressLine1) {
		this.productId = customerId;
		this.cost = cost;
		this.addressLine1 = addressLine1;
	}

	/**
	 * Get the value of customerId
	 *
	 * @return the value of customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * Get the value of name
	 *
	 * @return the value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the value of addressLine1
	 *
	 * @return the value of addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}


}

