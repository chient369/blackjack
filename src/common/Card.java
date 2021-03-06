package common;

import java.util.Objects;

public class Card {
	private int card_num;
	private String card_symbols;
	private final String ACE = "A";
	private final String JACK = "J";
	private final String QUEEN = "Q";
	private final String KING = "K";

	public Card() {
		super();
	}

	public Card(int card_num, String card_symbols) {
		super();
		this.card_symbols = card_symbols;
		this.card_num = card_num;
	}

	public String getCard_symbols() {
		return card_symbols;
	}

	public void setCard_symbols(String card_symbols) {
		this.card_symbols = card_symbols;
	}

	public void setCard_num(int card_num) {
		this.card_num = card_num;
	}

	public int getCard_num() {
		return card_num;
	}

	public String getCardFull() {
		String card_spec = null;
		switch (this.getCard_num()) {
		case 1:
			card_spec = ACE;
			return card_spec + this.getCard_symbols();
		case 11:
			card_spec = JACK;
			return card_spec + this.getCard_symbols();
		case 12:
			card_spec = QUEEN;
			return card_spec + this.getCard_symbols();
		case 13:
			card_spec = KING;
			return card_spec + this.getCard_symbols();
		default:
			return this.card_num + this.card_symbols;

		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(card_num, card_symbols);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Card) {
			Card card_1 = (Card) obj;
			if (this.getCard_num()==card_1.getCard_num() && this.card_symbols.equals(card_1.card_symbols)) {
				return true;
			}
		}
		return false;
	}
	

//	public static void main(String[] args) {
//		Card card = new Card(1,"♧");
//		Card card2 = new Card(1,"♧");
//		System.out.println(card.equals(card2));
//	}

}
