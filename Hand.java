import java.util.ArrayList;

class Hand{
    ArrayList<UnoCard> hand = new ArrayList<>();

    Hand(){
		for (int i = 0; i < 7; i++){
			this.hand.add(UnoCard.generateCard());
		}
	}

    void drawCard(){
        this.hand.add(UnoCard.generateCard());
    }

    void showHand(){
        for (int i = 0; i < this.hand.size(); i++){
            this.hand.get(i).displayVal();
        }
    }

    UnoCard playCard(UnoCard card, UnoCard facingCard){
        if (card.color == facingCard.color || card.type == facingCard.type){
            return card;
        }else{
            return facingCard;
        } // case to be made of same cards
    }
}