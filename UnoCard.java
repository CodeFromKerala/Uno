/*

UnoCard Class for cleaner and more readable code

*Made In Java :)*

*/ 

// UnoCard Class
public class UnoCard{
	String color;
	String type;
	int value;
	static String[] colorVal = {"Green", "Yellow", "Red", "Blue"};
	static String[] typeVal = {"Number", "+2", "+4", "Wild", "Number", "Number"}; 
	/* number added multiple times cus i cant bring myself to think of a better/cleaner solution 
	(number card should have more probability of appearing)
	*/

	// Constructor Method
	UnoCard(String color, String type, int value){
		this.color = color;
		this.type = type;
		this.value = value;
	}
	
	// Card Generating Method
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

	// For Displaying Card
	String displayVal(){
		return this.color + "," + this.type + "," + String.valueOf(this.value);
	}
}