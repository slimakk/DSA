package numbersGame;


public class GameField {
	private int[][] field = {{7, 2, 4},{5, 0, 6}, {8, 3, 1}};
	
	private int X = 1;
	private int Y = 1;
	
	public static final int UP = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int RIGHT = 4;
	
	public void Move(int direction)
	{
		switch(direction)
		{
		case UP:
			field[X][Y] = field[X-1][Y];
			field[X-1][Y] = 0;
			X = X - 1;
			break;
		case DOWN:
			field[X][Y] = field[X+1][Y];
			field[X+1][Y] = 0;
			X = X + 1;
			break;
		case LEFT:
			field[X][Y] = field[X][Y-1];
			field[X][Y-1] = 0;
			Y = Y - 1;
			break;
		case RIGHT:
			field[X][Y] = field[X][Y+1];
			field[X][Y+1] = 0;
			Y = Y + 1;
			break;
		}
	}
	
	public void printField()
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
	}
}
