/**
 * 
 */
package edu.osu.cse5234.entity;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author shao.211
 *
 */
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Item> itemList;
	/**
	 * 
	 */
	public Order() {
		super();
		
		itemList = new ArrayList<>();
	}
	/**
	 * @return the itemList
	 */
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	/**
	 * @param itemList the itemList to set
	 */
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemList == null) ? 0 : itemList.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (itemList == null) {
			if (other.itemList != null)
				return false;
		} else if (!itemList.equals(other.itemList))
			return false;
		return true;
	}

}
