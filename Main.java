// UNO GAME

// All special or non-number cards will have numerical value of 10

/*

Rules Of Uno ->

1. Cards can be put down only if -> they are same colour, they are of the same number or type
2. If you cannot play a card, you can draw from the deck and then play that card, if it can be done (within the discretion of the player)
3. Person Who finishes their deck wins
4. Stacking is allowed, contrary to the original game

(This is another version of UNO no mercy since there are technically no limits on the number of special or non-special cards in the deck)



*/

// imports 

import java.util.Scanner;

// Main Class
public class Main{
	public static boolean handSize(Hand hand1, Hand hand2){
		return (hand1.hand.size() == 0 || hand2.hand.size() == 0);
	}

	public static void main(String[] args){
		// Player Creation and Variables
		Hand hand1 = new Hand();
		Hand hand2 = new Hand();
		UnoCard facingCard = UnoCard.generateCard();
		Hand[] hands = {hand1, hand2};
		Scanner sc = new Scanner(System.in);
		System.out.println(handSize(hand1, hand2));
		System.out.println(handSize(hands[0], hands[1]));
		// Main Game Loop
		System.out.println("Facing Card -> " + facingCard.displayVal());
		while (hand1.hand.size() != 0 || hand2.hand.size() != 0){
			int roundNum = 1;
			System.out.println("Round " + String.valueOf(roundNum));
			int i = 0;
			while (i < 2){ // Thanks to Joann chetan
				System.out.println("Facing Card ->" + facingCard.displayVal());
				System.out.println("Choose for Player" + String.valueOf(i + 1));
				System.out.println("1. Play Card");
				System.out.println("2. Draw Card");
				System.out.println("3. Show Cards");
				System.out.println("Choice: ");
				int ch = sc.nextInt();
				if (ch == 1){
					int n = sc.nextInt();
					UnoCard card = hands[i].hand.get(n);
					if (Hand.checkCard(card, facingCard)){
						hands[i].playCard(card, facingCard, hands[i]);
						if (i < 1){
							i++;
						}else{
							i--;
						}
					}else{
						System.out.println("Try Again");
					}
				}else if (ch == 2){
					hands[i].drawCard();
				}else if (ch == 3){
					hands[i].showHand();
				}else{
					System.out.println("Invalid Choice, Try again");
				}
			}
			roundNum++;
		}
		
		sc.close();

		// Winning Conditions
		
		if (hand1.hand.size() == 0){
			System.out.println("Player 1 Wins!");
		}else if (hand2.hand.size() == 0){
			System.out.println("Player 2 Wins!");
		}else{
			System.out.println("Fatal Error");
		}
	}
}