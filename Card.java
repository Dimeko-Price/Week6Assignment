package Week6Assignment;

public class Card {

	private int value;
	private String suit;
	
	
	public Card() {}
	
	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
	}
	
	
	public void describe() {
		System.out.println(suit + value);
		
	}
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
