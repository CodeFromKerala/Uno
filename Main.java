// UNO GAME

// All special or non-number cards will have numerical value of 10

public class Main{

	public static void main(String[] args){
		UnoCard[] hand1 = UnoCard.generateHand();
		UnoCard[] hand2 = UnoCard.generateHand();
		for (int j = 0; j < 7; j++){
			hand1[j].displayVal();
			hand2[j].displayVal();
		}
	}

}
