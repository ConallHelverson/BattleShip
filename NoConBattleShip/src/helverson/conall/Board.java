package helverson.conall;

public class Board {
	
	private int width;
	private int length;
	private Cell[][] board;
	
	public Board(int yValue, int xValue){
		
		width=xValue;
		length=yValue;
		board = new Cell[length][width];
		
		for(int i=0;i<xValue; i++){
			for (int j=0;j<yValue;j++){
				board[i][j]= new Cell();
			}
	}
	}	
	
	public int getXValue(){
		return width;
	}
	
	public int getYValue(){
		return length;
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
	
	public boolean isPlaceable(boolean isHorizontal, int shipSize, int x, int y){
		if (isHorizontal==true){
			//board.length<(x+shipSize)||
		
			if (board[0].length<(x+shipSize)||0>x||0>y||board.length<y){	
			return false;
			}	
		}
		else if(isHorizontal==false){
			if (board.length<(y+shipSize)||0>x||0>y||board[0].length<x){
				return false;
			}
		}
		
		return true;
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
