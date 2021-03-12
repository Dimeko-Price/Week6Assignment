package Week6Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player() {
		score = 0;
	}
	
	public Player (String newName) {
		name = newName;
		score = 0;
	}
	
	public void describe() {
		System.out.println("The player has the following cards" + name);
		for (Card card: hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck desk) {
		hand.add(desk.draw());
		
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
}
