package helverson.conall;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Board b = new Board(10, 10);
		System.out.println(b);

		Ship ship1 = new Ship("Destroyer", 2);
		Ship ship2 = new Ship("Submarine", 3);
		Ship ship3 = new Ship("Aircraft Carrier", 5);
		Ship ship4 = new Ship("Cruiser", 3);
		Ship ship5 = new Ship("Battleship", 4);

		System.out
				.println("Which ship would you like to place? Destroyer/Submarine/Aircraft Carrier/Cruiser/Battleship");
		Scanner kb = new Scanner(System.in);
		String response = kb.nextLine();

		if (response.equalsIgnoreCase("Destroyer")) {

		}
		if (response.equalsIgnoreCase("Submarine")) {

		}
		if (response.equalsIgnoreCase("Aircraft Carrier")) {

		}
		if (response.equalsIgnoreCase("Cruiser")) {

		}
		if (response.equalsIgnoreCase("Battleship")) {

			System.out.println("Would you like your ship to be horizontal? Yes/No");
			boolean isHorizontal = false;

			if (response.equalsIgnoreCase("Yes")) {

				isHorizontal = true;
			}

			System.out.println("Where would you like to place your ship? x and y co-ordinates");

			if (b.isPlaceable(isHorizontal, 5, 1, 1)) {
				//b.placeShip(ship, 6, 6);
			}

		}

	}
}
