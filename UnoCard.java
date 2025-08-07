public class UnoCard{
	String color;
	String type;
	int value;
	static String[] colorVal = {"Green", "Yellow", "Red", "Blue"};
	static String[] typeVal = {"Number", "+2", "+4", "Wild"};

	UnoCard(String color, String type, int value){
		this.color = color;
		this.type = type;
		this.value = value;
	}

	static UnoCard[] generateHand(){
		UnoCard[] hand = new UnoCard[7];
		for (int i = 0; i < 7; i++){
			hand[i] = generateCard();
		}
		return hand;
	}
	
	static UnoCard generateCard(){
		int colorType = (int)(Math.random() * 3);
			int typeType = (int)(Math.random() * 3);
			UnoCard card = new UnoCard(colorVal[colorType], typeVal[typeType], 0);
			if (typeType == 0){
				card.value = (int)(Math.random() * 9);
			}else{
				card.value = 10;
			}
			return card;
	}

	void displayVal(){
		System.out.println(this.color + "," + this.type + "," + String.valueOf(this.value));
	}
}