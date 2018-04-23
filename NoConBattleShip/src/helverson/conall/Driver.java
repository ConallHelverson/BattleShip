package helverson.conall;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Board b = new Board(10, 10); 
		System.out.println(b);
		

		Ship ship = new Ship("Destroyer", 5);
		
		
		System.out.println("Would you like your ship to be horizontal? Yes/No");
		Scanner kb = new Scanner(System.in);
		String response = kb.nextLine();
		boolean isHorizontal = false;
		
		if(response.equalsIgnoreCase("Yes") ) {
			
			isHorizontal = true;
		}
		
		System.out.println("Where would you like to place your ship? x and y co-ordinates");
	
		
		if (b.isPlaceable(isHorizontal, 5, 1, 1)){
			//b.placeShip(ship, 6, 6);
		}
		
	
		
		

	}

}
