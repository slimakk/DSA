package numbersGame;

import java.util.HashSet;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var board1 = new GameField();
		var board2 = new GameField();
		
		board1.Move(GameField.UP);
		System.out.println();
		board1.printField();
		
		board2.Move(GameField.DOWN);
		System.out.println();
		board2.printField();
		
		HashSet<GameField> mnozina = new HashSet<>();
		mnozina.add(board1);
		mnozina.add(board2);
		
		System.out.println(board1.hashCode());
		System.out.println(board2.hashCode());
		System.out.println(mnozina.size());
		
		System.out.println(board1.equals(board2));
		System.out.println(board2.equals(board1));
	}

}
