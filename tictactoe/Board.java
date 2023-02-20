package tictactoe;

class Board {
	public static final int SIZE=3;
	public static final int PLAYER1=1;
	public static final int PLAYER2=2;
	public static final int INVALID=3;
	public static final int DRAW=4;
	public static final int INCOMPLETE=5;
	
	char[][] board;
	char p1symbol,p2symbol;
	int count;
	public Board(char p1symbol,char p2symbol)
	{
		this.count=0;
		this.p1symbol=p1symbol;
		this.p2symbol=p2symbol;
		board=new char[SIZE][SIZE];
		for(int i=0;i<SIZE;i++)
		{
			for(int j=0;j<SIZE;j++)
			{
				board[i][j]=' ';
			}
		}
	}
	public void display()
	{
		for(int i=0;i<SIZE;i++)
		{
			for(int j=0;j<SIZE;j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public int move(int x,int y,char symbol)
	{
		if(x<0 || x>SIZE || y<0 || y>SIZE || board[x][y]!=' ')
			return INVALID;
		board[x][y]=symbol;
		count++;
		if(board[x][0]==board[x][1] && board[x][1]==board[x][2])
			return symbol==p1symbol ? PLAYER1:PLAYER2;
		else if(board[0][y]==board[1][y] && board[1][y]==board[2][y])
			return symbol==p1symbol ? PLAYER1 :PLAYER2;
		else if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2])
			return symbol==p1symbol ? PLAYER1 : PLAYER2;
		else if(board[0][2]!=' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0])
			return symbol==p1symbol ? PLAYER1 : PLAYER2;
		else if(count==SIZE*SIZE)
			return DRAW;
		return INCOMPLETE;
		
	}
}
