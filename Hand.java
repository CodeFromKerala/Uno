import java.util.ArrayList;

class Hand{
    static boolean turn;
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
}