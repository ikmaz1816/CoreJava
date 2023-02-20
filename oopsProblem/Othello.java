package oopsProblem;

import java.util.Scanner;

public class Othello {
	final static int player1Symbol = 1;
	final static int player2Symbol = 2;

		private int board[][];

		public Othello() {
			board = new int[8][8];
			board[3][3] = player1Symbol;
			board[3][4] = player2Symbol;
			board[4][3] = player2Symbol;
			board[4][4] = player1Symbol;
		}

		public void print() {
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
		}

		public boolean move(int symbol, int x, int y){
			boolean isAdvantage=false;
			if(x<0 || x>=board.length || y<0 || y>=board.length || board[x][y]!=0)
				return isAdvantage;

			int[] xcoordinate={-1,-1,-1,0,0,1,1,1};
			int[] ycoordinate={-1,0,1,-1,1,-1,0,1};
			for(int i=0;i<xcoordinate.length;i++)
			{
				int count=0;
				int currentX= x + xcoordinate[i];
				int currentY= y + ycoordinate[i];
				while(currentX>=0 && currentX<board.length && currentY>=0 && currentY<board.length)
				{
					if(board[currentX][currentY]==0)
						break;
					else if(board[currentX][currentY]!=symbol)
					{
						currentX+=xcoordinate[i];
						currentY+=ycoordinate[i];
						count++;
					}
					else
					{
						if(count>0)
						{
							isAdvantage=true;
							int currX=currentX-xcoordinate[i];
							int currY=currentY-ycoordinate[i];
							while(currX!=x || currY!=y)
							{
								board[currX][currY]=symbol;
								currX-=xcoordinate[i];
								currY-=ycoordinate[i];
							}
						}
						break;
					}
				}
			}
			if(isAdvantage)
			{
				board[x][y]=symbol;
			}
			return isAdvantage;
		}
	public static void main(String[] args) {
		Othello b = new Othello();
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		boolean p1Turn = true;
		while(n > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			boolean ans = false;
			if(p1Turn) {
				ans = b.move(player1Symbol, x, y);
			}
			else {
				ans = b.move(player2Symbol, x, y);
			}
			if(ans) {
				b.print();
				p1Turn = !p1Turn;
				n--;
			}
			else {
				System.out.println(ans);
			}
		}
		s.close();

	}
}
