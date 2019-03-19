import java.util.*;

public class Card {
	
	//declare Variables
	private int rank;
	private char suit;

	//constructor
	public Card(char theSuit, int theRank){
		this.suit = theSuit;
		this.rank = theRank;
	}

	public int getRank(){
		return rank;
	}

	public char getSuit(){
		return suit;
	}

	public String toString(){

		if(rank == 11){
			return suit + "" + 'J';
		}
		else if(rank == 12){
			return suit + "" + 'Q';
		}
		else if(rank == 13){
			return suit + "" + 'K';
		}
		else if(rank == 14){
			return suit + "" + 'A';
		}
		else
		return suit + "" + rank;
	}

	public int compareTo(Object anotherCard){
		
		Card another = (Card)anotherCard;
		if(this.rank > another.rank){
			return 1;
		}
		else if(this.rank < another.rank){
			return -1;
		}
		else
			return 0;
	}
}
