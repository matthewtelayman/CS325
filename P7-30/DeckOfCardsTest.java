//card shuffling and dealing
public class DeckOfCardsTest {
	// execute application
	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); // place Cards in random order

		Card[] hand = new Card[5]; // store five cards

		// get first five cards
		for (int i = 0; i < 5; i++) {
			hand[i] = myDeckOfCards.dealCard(); // get next card
			System.out.println(hand[i]);
		}

		// display result
		System.out.println("\nHand contains:");

		int couples = myDeckOfCards.pairs(hand); // a pair
		myDeckOfCards.twoPairs(couples); // two pairs
		int triples = myDeckOfCards.threeOfAKind(hand); // three of a kind
		myDeckOfCards.fourOfAKind(hand); // four of a kind
		myDeckOfCards.flush(hand); // a flush
		myDeckOfCards.straight(hand); // a straight
		myDeckOfCards.fullHouse(couples, triples); // a full house
	}
}
