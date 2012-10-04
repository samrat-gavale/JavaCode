package object_oriented.cards;

public class Card {
	int num = 0;
	Suit suit;
	public Card(int n, Suit s){
		num = n;
		suit = s;
	}
	public Card(){
		
	}
	public void swap(Card c){
		Card temp = c;
		c = this;
		this.num = temp.num;
		this.suit = temp.suit;
	}
	
	public void print(){
		System.out.print("Num - "+num+"\n");
		System.out.print("Suit - "+suit.name+"\n");
	}
}