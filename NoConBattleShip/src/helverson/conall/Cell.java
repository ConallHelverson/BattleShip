package helverson.conall;

public class Cell {

	private CellState state;

	public Cell() {

		state = CellState.Empty;
	}

	/**
	 * You can create a cell using a state.
	 * 
	 * @param state
	 *            :empty or filled
	 * @return
	 */
	// public void createCell(CellState state) {
	// s = state;
	// }

	// Change state of a cell.
	public void changeState(CellState state) {
		this.state = state;
	}

	// Next three just return x coordinate, y coordinate, and state.

	public CellState getState() {
		return state;
	}
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		switch (state){
		case Empty:
			sb.append("_");
			break;
		case Filled:
			sb.append("F");
			break;
		default:
			sb.append("_");
		}
		return sb.toString();
			
	}
	
	

	/**
	 * Checks if a cell is filled or not
	 * 
	 * @return true or false (Filled or not)
	 */
	public boolean cellIsFilled() {
		if (state != CellState.Empty) {
			return true;
		} else
			return false;
	}
}
