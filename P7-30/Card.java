//Matt Layman card.java
//card class represents a playing card.
public class Card {
	private final String face; // face of card ("Ace", "Deuce", ...)
	private final String suit; // suit of card ("Hearts", "Diamond", ...)

	public Card(String cardFace, String cardSuit) {
		face = cardFace; // face of card
		suit = cardSuit; // suit of card
	}

	// return card face
	public String getFace() {
		return face;
	}

	// return suit
	public String getSuit() {
		return suit;
	}

	// return string rep of card
	public String toString() {
		return face + " of " + suit;
	}
} // end class Card

