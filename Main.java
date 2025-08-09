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

	public static void main(String[] args){
		// Player Creation and Variables
		Hand hand1 = new Hand();
		Hand hand2 = new Hand();
		boolean turn = true;
		UnoCard facingCard = UnoCard.generateCard();
		
		// Main Game Loop
		System.out.println("Facing Card -> " + facingCard.displayVal());
		while (hand1.hand.size() != 0 || hand2.hand.size() != 0){
			Scanner sc = new Scanner(System.in);
			if (turn){
				hand1.showHand();
				System.out.println("Hand1's Turn -> ");
				int ch = sc.nextInt();
				System.out.println("Facing Card: " + hand1.playCard(hand1.hand.get(ch - 1), facingCard).displayVal());
				turn = false;
			}else{
				hand2.showHand();
				System.out.println("Hand2's Turn -> ");
				int ch = sc.nextInt();
				System.out.println("Facing Card: " + hand2.playCard(hand2.hand.get(ch - 1), facingCard).displayVal());
				turn = true;
			}
		}
		
		// Winning Conditions
		
		if (hand1.hand.size() == 0){
			System.out.println("Player 1 Wins!");
		}else{
			System.out.println("Player 2 Wins!");
		}
	}	
}