package helverson.conall;

public class Board {
	
	private int width=5;
	private int length=5;
	
	public Board(int y, int x){
		
		width=x;
		length=y;
		Cell Board[][]=new Cell[y][x];
		
		for(int i=0;i<x; i++){
			for (int j=0;j<y;j++){
			Board[j][i]=new Cell();
			}
	}
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
