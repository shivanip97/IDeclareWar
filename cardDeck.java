import java.util.*;

public class cardDeck{
	
	//initialize the array//
	private ArrayList<Card> deck;

	public cardDeck(){
		deck = new ArrayList<Card>();
	}

	public void add(Card aCard){
		deck.add(aCard);
	}
	
	public Card getTopCard(){
		return deck.remove(0);
	}
	
	public String toString(){
		return deck.toString();
	}
	
	public int size(){
		return deck.size();
	}
	
	public void clear(){
		deck.clear();
	}

	public void shuffle(){
		
		Random rand = new Random();

		for (int i=0; i<2000; i++){
		
			if (size() > 0){
				Card topCard = deck.remove(0);   					
				int newPosition = rand.nextInt(deck.size());	
				deck.add(newPosition, topCard);					
			}
		}
	}	
}
