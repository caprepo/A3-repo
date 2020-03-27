package org.cap.model;

import java.time.LocalDate;

public class Card {
	private int cardNo;
	private String cardName;
	private String cardtype;
	private LocalDate cardExpiryDate;
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public LocalDate getCardExpiryDate() {
		return cardExpiryDate;
	}
	public void setCardExpiryDate(LocalDate cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}
	public Card(int cardNo, String cardName, String cardtype, LocalDate cardExpiryDate) {
		super();
		this.cardNo = cardNo;
		this.cardName = cardName;
		this.cardtype = cardtype;
		this.cardExpiryDate = cardExpiryDate;
	}
	public Card() {
		super();
	}
	
	

}
