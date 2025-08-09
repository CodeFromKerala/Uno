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
            System.out.println(String.valueOf(i + 1) + ". " + this.hand.get(i).displayVal());
        }
    }

    // Method to play a specific card to the pile
    UnoCard playCard(UnoCard card, UnoCard facingCard, Hand hand){
        hand.hand.remove(card);
        return card;
    }

    // Checking whether given card is playable
    static boolean checkCard(UnoCard card, UnoCard facingCard){
        return (card.type == facingCard.type ) || (card.value == facingCard.value) || (card.color == facingCard.color);
    }
}