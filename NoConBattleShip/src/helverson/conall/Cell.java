package helverson.conall;

public class Cell {

	private int x;
	private int y;
	private CellState s;

	/**
	 * Default coordinate is (0,0), or A1
	 */
	public Cell() {
		x = 0;
		y = 0;
		s = CellState.Empty;
	}

	/**
	 * You can create a cell using an x, y coordinate, and the state.
	 * @param xCoordinate :xcoordinate of cell
	 * @param yCoordinate :ycoordinate of cell
	 * @param state :empty or filled
	 */
	public Cell(int xCoordinate, int yCoordinate, CellState state) {
		x = xCoordinate;
		y = yCoordinate;
		s = state;
	}

	//Change state of a cell.
	public void changeState(CellState state){
	s=state;
	}
	
	//Next three just return x coordinate, y coordinate, and state.
	
	public int getXValue() {
		return x;
	}

	public int getYValue() {
		return y;
	}
	
	public String getState(){
		if (s==CellState.Empty){ 
			return ("_");
		}
		else if (s==CellState.Filled){
			return ("F");
		}
		else if (s==CellState.Hit){
			return("X");
		}
		else{
			return (".");
		}
		
	}
	/**
	 * Checks if a cell is filled or not
	 * @return true or false (Filled or not)
	 */
	public boolean cellIsFilled() {
		if(s!=CellState.Empty){
			return true;
		}
		else return false;
		}
	}

