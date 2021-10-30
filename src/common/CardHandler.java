package common;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class CardHandler {
	private static Random rand = new Random();
	private static int[] card_nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
	private static String[] card_symbols = { "♥", "♦", "♠", "♣" };
	private static Set<Card> cardRepos = new HashSet<Card>(53);
	private Card card;

	public CardHandler() {
		this.card = getCard();
	}

	public static Card getCard() {
		Card game_card = new Card(card_nums[rand.nextInt(13)], card_symbols[rand.nextInt(3)]);
		while (cardRepos.contains(game_card)) {
			game_card = new Card(card_nums[rand.nextInt(13)], card_symbols[rand.nextInt(3)]);
		}
		cardRepos.add(game_card);
		if (cardRepos.size() > 5) {
			cardRepos.clear();
		}
		return game_card;
	}

	public void showCardRepo() {
		Iterator<Card> it = cardRepos.iterator();
		while (it.hasNext()) {
			Card card = (Card) it.next();
			System.out.println(card.getCardFull());
		}
		System.out.println("repo size :" + cardRepos.size());
	}

	public Card setCard(int card_num, String card_symbol) {
		return new Card(card_num, card_symbol);
	}

//	public Card getCard() {
//		return this.card;♣
//	}
	public int getCardNum() {
		return card.getCard_num();
	}

	public String getCardFull() {
		return card.getCardFull();
	}

	public boolean isBiggerThan(CardHandler card) {
		if (this.getCardNum() > card.getCardNum()) {
			return true;
		}
		return false;

	}

//	public static void main(String[] args) {
//		System.out.println(cardRepos.size());
//		for (int i = 0; i < 10; i++) {
//			Card card = getCard();
//			System.out.println(card.getCardFull());
//		}
//		System.out.println(cardRepos.size());
//	}

}
