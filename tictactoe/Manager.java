package tictactoe;

import java.util.Scanner;

public class Manager {
	int num;
	Scanner sc;
	public Manager()
	{
		this.num=0;
		sc=new Scanner(System.in);
	}
	public Player takeInput(int num)
	{
		System.out.println("Enter the name of Player "+ num);
		String name=sc.next();
		System.out.println("Enter the symbol for Player "+num);
		char symbol=sc.next().charAt(0);
		return new Player(name,symbol);
	}
	public void start()
	{
		Player p1=takeInput(++num);
		Player p2=takeInput(++num);
		while(p1.getSymbol()==p2.getSymbol())
		{
			System.out.println("Symbol of player2 matches with player1 re-enter the symbol");
			p2.setSymbol(sc.next().charAt(0));
		}
		Board board=new Board(p1.getSymbol(),p2.getSymbol());
		boolean player1=true;
		int status=Board.INCOMPLETE;
		while(status==Board.INCOMPLETE || status==Board.INVALID)
		{
			if(player1)
			{
				System.out.println("Enter the x coordinate for player 1");
				int x=sc.nextInt();
				System.out.println("Enter the y coordinate for player 1");
				int y=sc.nextInt();
				status=board.move(x,y,p1.getSymbol());
				if(status==Board.INVALID)
					continue;
				player1=!player1;
			}
			else
			{
				System.out.println("Enter the x coordinate for player 2");
				int x=sc.nextInt();
				System.out.println("Enter the y coordinate for player 2");
				int y=sc.nextInt();
				status=board.move(x,y,p2.getSymbol());
				if(status==Board.INVALID)
					continue;
				player1=true;
			}
			board.display();
		}
		if(status==Board.PLAYER1)
		{
			System.out.println("Player"+p1.getName() +"Wins!!!!");
		}
		else if(status==Board.PLAYER2)
		{
			System.out.println("Player"+p2.getName() +" Wins!!!");
		}
		else if(status==Board.DRAW)
		{
			System.out.println("DRAW");
		}
	}
	public static void main(String[] args) {
		Manager mg=new Manager();
		mg.start();
	}
}
