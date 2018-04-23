package helverson.conall;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Board b = new Board(10, 10); 
		System.out.println(b);
		
		Ship Ship = new Ship("Destroyer", 5);
		
		
		System.out.println("Would you like your ship to be horizontal? Yes/No");
		Scanner kb = new Scanner(System.in);
		String response = kb.next();
		boolean isHorizontal;
		
		if(response == "Yes" ) {
			isHorizontal = true;
		}
		else if (response == "No" ){
			isHorizontal = false;
		}
		
		

	}

}
