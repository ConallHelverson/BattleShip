package helverson.conall;

public class Cell {


	private CellState s;

	public Cell() {
	
		s = CellState.Empty;
	}

	/**
	 * You can create a cell using a state.
	 * @param state :empty or filled
	 * @return 
	 */
	//public void createCell(CellState state) {
	//	s = state;
	//}

	//Change state of a cell.
	public void changeState(CellState state){
	s=state;
	}
	
	//Next three just return x coordinate, y coordinate, and state.
	
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

