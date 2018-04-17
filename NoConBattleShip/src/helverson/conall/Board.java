package helverson.conall;

public class Board {
	
	private int width;
	private int length;
	private Cell[][] board;
	
	public Board(int y, int x){
		
		width=x;
		length=y;
		board = new Cell[length][width];
		
		for(int i=0;i<x; i++){
			for (int j=0;j<y;j++){
				board[i][j]= new Cell();
			}
	}
	}	
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		
		for(int i=0;i<board[0].length;i++){
			for (int j=0;j<board.length;j++){
				 sb.append(board[i][j]);
				 sb.append(" ");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
		
		
	//public Void createBoard(int y, int x){
	//	width=x;
	//  length=y;
		
	//	for(int i=0;i<x; i++){
	//		for (int j=0;j<y;j++){
	//		Cell Board[j][i]=createCell(i,j,CellState.Empty);
		//	}
//	}
	
	
	
}
