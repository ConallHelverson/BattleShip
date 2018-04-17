package helverson.conall;

public class Board {
	
	private int width=10;
	private int length=10;
	
	public Board(int y, int x){
		
		width=x;
		length=y;
		Cell[][] Board=new Cell[y][x];
		
		for(int i=0;i<x; i++){
			for (int j=0;j<y;j++){
			Board[j][i]=new Cell();
			}
	}
	}	
	
	public Cell displayBoard(Cell[][] Board){

		for(int i=0;i<Board[0].length;i++){
			for (int j=0;j<Board.length;j++){
				return Board[i][j];
			}
			System.out.println("");
		}
		return null;
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
