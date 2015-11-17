/**
 * 
 */
package edu.osu.cse5234.entity;

import java.io.Serializable;

/**
 * @author shao.211
 *
 */
public class PaymentInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String creditCardNumber;
	private String expireDate;
	private String cvvCode;
	private String cardHolderName;
	
	/**
	 * 
	 */
	public PaymentInfo() {
		super();
	}
	
	public PaymentInfo(String cardNumber, String expire, String cvv, String name) {
		super();
		
		creditCardNumber = cardNumber;
		expireDate = expire;
		cvvCode = cvv;
		cardHolderName = name;
		
	}

	/**
	 * @return the creditCardNumber
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * @param creditCardNumber the creditCardNumber to set
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	/**
	 * @return the expireDate
	 */
	public String getExpireDate() {
		return expireDate;
	}

	/**
	 * @param expireDate the expireDate to set
	 */
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	/**
	 * @return the cvvCode
	 */
	public String getCvvCode() {
		return cvvCode;
	}

	/**
	 * @param cvvCode the cvvCode to set
	 */
	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}

	/**
	 * @return the cardHolderName
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}

	/**
	 * @param cardHolderName the cardHolderName to set
	 */
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardHolderName == null) ? 0 : cardHolderName.hashCode());
		result = prime * result + ((creditCardNumber == null) ? 0 : creditCardNumber.hashCode());
		result = prime * result + ((cvvCode == null) ? 0 : cvvCode.hashCode());
		result = prime * result + ((expireDate == null) ? 0 : expireDate.hashCode());
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
		PaymentInfo other = (PaymentInfo) obj;
		if (cardHolderName == null) {
			if (other.cardHolderName != null)
				return false;
		} else if (!cardHolderName.equals(other.cardHolderName))
			return false;
		if (creditCardNumber == null) {
			if (other.creditCardNumber != null)
				return false;
		} else if (!creditCardNumber.equals(other.creditCardNumber))
			return false;
		if (cvvCode == null) {
			if (other.cvvCode != null)
				return false;
		} else if (!cvvCode.equals(other.cvvCode))
			return false;
		if (expireDate == null) {
			if (other.expireDate != null)
				return false;
		} else if (!expireDate.equals(other.expireDate))
			return false;
		return true;
	}

}
