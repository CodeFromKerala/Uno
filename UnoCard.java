public class UnoCard{
	String color;
	String type;
	int value;
	static String[] colorVal = {"Green", "Yellow", "Red", "Blue"};
	static String[] typeVal = {"Number", "+2", "+4", "Wild", "Number", "Number"}; // number added multiple times cus i cant bring myself to think of a better solution (number card should have more probability of appearing)

	UnoCard(String color, String type, int value){
		this.color = color;
		this.type = type;
		this.value = value;
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

	String displayVal(){
		return this.color + "," + this.type + "," + String.valueOf(this.value);
	}
}