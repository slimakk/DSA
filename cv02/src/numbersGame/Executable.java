package numbersGame;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var board = new GameField();
		
		board.printField();
		
		board.Move(GameField.UP);
		
		System.out.println();
		
		board.printField();
		
		board.Move(GameField.LEFT);
		
		System.out.println();
		
		board.printField();
		
		board.Move(GameField.DOWN);
		
		System.out.println();
		
		board.printField();
		
		board.Move(GameField.DOWN);
		
		System.out.println();
		
		board.printField();
		
		board.Move(GameField.RIGHT);
		
		System.out.println();
		
		board.printField();
	}

}
