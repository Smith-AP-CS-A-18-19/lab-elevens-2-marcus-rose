/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */

	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */

		String ranks2[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "Jacks", "Queens", "Kings"};
		String suits2[] = {"Spades" ,"Clubs", "Hearts", "Diamonds"};
		int pointValues2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		Deck e = new Deck(ranks2, suits2, pointValues2);

		for (int i = 1; i < ranks2.length; i++) {
			System.out.print(e.deal());
		}

		System.out.print(e.isEmpty());





// 			for (int i = 0; i < 52; i++) {
// 				String rank = "";
// 				String suit = "";
// 			if ( (i+1) % 13 == 11 ) {
// 				rank = "Jack";
//
// 			} else if ( (i+1) % 13 == 12 ) {
// 				rank = "Queen";
//
// 			} else if ( (i+1) % 13 == 0 ) {
// 				rank = "King";
//
// 			} else if ( (i+1) % 13 == 1 ) {
// 				rank = "Ace";
// 			} else {
//
// 				rank = Integer.toString((i + 1) % 13);
// 			}
//
// 			if (i < 13) {
// 				suit = "Hearts";
//
// 			} else if (i < 26) {
// 				suit = "Diamonds";
//
// 			}  else if (i < 39) {
// 				suit = "Clubs";
//
// 			} else {
// 				suit = "Spades";
// 			}
//
// 			ranks2[i] = rank;
// 			suits2[i] = suit;
// 			pointValues2[i] = ((i+1) % 13);
// }
//
//
//
//


	}
}
