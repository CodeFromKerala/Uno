/*

Hand Class for cleaner and more readable code

*Made in Java*

*/ 


// imports
import java.util.ArrayList;

// Hand Class
class Hand{
    ArrayList<UnoCard> hand = new ArrayList<>();

    // Constructor Method
    Hand(){
		for (int i = 0; i < 7; i++){
			this.hand.add(UnoCard.generateCard());
		}
	}


    // Method to draw a card from the deck
    void drawCard(){
        this.hand.add(UnoCard.generateCard());
    }

    // Method to display all cards in a hand
    void showHand(){
        for (int i = 0; i < this.hand.size(); i++){
            System.out.println(String.valueOf(i + 1) + this.hand.get(i).displayVal());
        }
    }

    // Method to play a specific card to the pile
    UnoCard playCard(UnoCard card, UnoCard facingCard){
        if (card.color == facingCard.color || card.type == facingCard.type){
            
            return card;
        }else{
            return facingCard;
        } // case to be made of same cards
    }
}