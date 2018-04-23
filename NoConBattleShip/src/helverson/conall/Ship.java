package helverson.conall;

public class Ship {
	
	private String name;

	private int size;

	private boolean isHorizontal;

	private boolean isPlaced;

	private int x;

	private int y;

	private int shipLeft;

	public Ship(String shipName, int shipSize) {
		name = shipName;
		size = shipSize;
		isPlaced = false;
		shipLeft = shipSize;

	}

	public void setLocation(int xValue, int yValue) {
		x = xValue;
		y = yValue;
	}

	public void damage() {
		shipLeft -= 1;
	}
	
/*	public void ShipPlace() {
		if(isPlaceable == true){
			changeState(Filled);
		}
		if (isHorizontal == true) {
			changeState(Filled); 
		}
		else if (isHorizontal == false) {
			
		}
	}*/
}
