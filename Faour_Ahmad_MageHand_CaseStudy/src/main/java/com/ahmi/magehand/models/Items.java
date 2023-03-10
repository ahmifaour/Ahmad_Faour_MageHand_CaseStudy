package com.ahmi.magehand.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Items {

	/**
	 * 
	 * An entity representing an Item.
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iId;

	@Column(name = "Item Name", length = 50, nullable = false)
	private String itemName;

	@Column(name = "Item Description", length = 500, nullable = false)
	private String itemDesc;

	/**
	 * 
	 * Default constructor for Items.
	 */
	public Items() {
	}

	/**
	 * 
	 * Constructor for Items with all fields.
	 * 
	 * @param iId              the item's ID.
	 * @param itemName         the item's name.
	 * @param itemDesc         the item's description.
	 * @param iCharacterSheets the collection of character sheets that the item
	 *                         belongs to.
	 */
	public Items(Long iId, String itemName, String itemDesc) {
		this.iId = iId;
		this.itemName = itemName;
		this.itemDesc = itemDesc;
	}

	/**
	 * 
	 * Returns the item's ID.
	 * 
	 * @return the item's ID.
	 */
	public Long getiId() {
		return iId;
	}

	/**
	 * 
	 * Sets the item's ID.
	 * 
	 * @param iId the new ID for the item.
	 */
	public void setiId(Long iId) {
		this.iId = iId;
	}

	/**
	 * 
	 * Returns the item's name.
	 * 
	 * @return the item's name.
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * 
	 * Sets the item's name.
	 * 
	 * @param itemName the new name for the item.
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * 
	 * Returns the item's description.
	 * 
	 * @return the item's description.
	 */
	public String getItemDesc() {
		return itemDesc;
	}

	/**
	 * 
	 * Sets the item's description.
	 * 
	 * @param itemDesc the new description for the item.
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	/**
	 * 
	 * Returns a string representation of the item.
	 * 
	 * @return a string representation of the item.
	 */

	@Override
	public String toString() {
		return "Items [iId=" + iId + ", itemName=" + itemName + ", itemDesc=" + itemDesc + "]";
	}

	/**
	 * 
	 * Returns a hash code for the item.
	 * 
	 * @return a hash code for the item.
	 */

	@Override
	public int hashCode() {

		return Objects.hash(iId, itemDesc, itemName);

	}

	/**
	 * 
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * @param obj the object to compare with
	 * @return true if this object is the same as the obj argument; false otherwise
	 */

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		return Objects.equals(iId, other.iId) && Objects.equals(itemDesc, other.itemDesc)
				&& Objects.equals(itemName, other.itemName);

	}

}
