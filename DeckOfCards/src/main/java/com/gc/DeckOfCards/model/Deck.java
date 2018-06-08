package com.gc.DeckOfCards.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Deck {
	
	private boolean success;
	private Card[] cards;
	private String deck_id;
	private boolean shuffled;
	private int remaining;
	
	public Deck() {
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getDeck_id() {
		return deck_id;
	}

	public void setDeck_id(String deck_id) {
		this.deck_id = deck_id;
	}

	public boolean isShuffled() {
		return shuffled;
	}

	public void setShuffled(boolean shuffled) {
		this.shuffled = shuffled;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	
	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Deck [success=" + success + ", deck_id=" + deck_id + ", shuffled=" + shuffled + ", remaining="
				+ remaining + "]";
	}
	
	
	
	

}
