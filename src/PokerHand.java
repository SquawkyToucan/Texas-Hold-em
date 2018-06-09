import java.util.ArrayList;
import java.util.Collections;

/**
 * Texas Hold-em! Your task is to determine if the cards in the list makes up a
 * straight (five cards of sequential rank) or not. The cards will always have
 * values ranging from 2-14, where 14 is the ace.
 * 
 * Be aware that the ace (14) also should count as value 1!
 * 
 * The number of cards will vary, but will never be more than 7 (the board (5) +
 * player hand (2))
 * 
 * Examples:
 * 
 * straight: 9-10-11-12-13
 * 
 * straight: 14-2-3-4-5
 * 
 * straight: 2-7-8-5-10-9-11
 * 
 * not straight: 7-8-12-13-14
 *
 **/
public final class PokerHand {
	public static boolean IsStraight(ArrayList<Integer> cards) {
		boolean isStraight = false;
		if (cards.size() < 5 || cards.size() > 7) {
			// fail
			System.out.println("You don't have enough cards, silly!");
			return false;
		} else {
			// only need one
			Collections.sort(cards);
			// sort through the first, second, and third depending on the length
			if (cards.get(cards.size() - 1) == 14 && cards.get(0) == 2) {
				if (cards.get(1) == 3 && cards.get(2) == 4 && cards.get(3) == 5) {
					isStraight = true;
				}
			}
			if (cards.size() == 7 && !isStraight) {
				// need to check numbers one, two, and three
				for (int i = 0; i < 5; i++) {
					if (cards.get(i) + 1 != cards.get(i + 1)) {
						isStraight = false;
						break;
					}
					isStraight = true;
				}
				for (int i = 1; i < 6; i++) {
					if (cards.get(i) + 1 != cards.get(i + 1)) {
						isStraight = false;
						break;
					}
					isStraight = true;
				}
				for (int i = 2; i < 7; i++) {
					if (cards.get(i) + 1 != cards.get(i + 1)) {
						isStraight = false;
						break;
					}
					isStraight = true;
				}
			} else if (cards.size() == 6 && !isStraight) {
				// need to check numbers one, two, and three
				for (int i = 0; i < 5; i++) {
					if (cards.get(i) + 1 != cards.get(i + 1)) {
						isStraight = false;
						break;
					}
					isStraight = true;
				}
				for (int i = 1; i < 6; i++) {
					if (cards.get(i) + 1 != cards.get(i + 1)) {
						isStraight = false;
						break;
					}
					isStraight = true;
				}
			} else if (cards.size() == 5 && !isStraight) {
				// need to check only the first
				for (int i = 0; i < 4; i++) {
					if (cards.get(i) + 1 != cards.get(i + 1)) {
						isStraight = false;
						break;
					}
					isStraight = true;
				}
			}
		}
		return isStraight;
	}
}