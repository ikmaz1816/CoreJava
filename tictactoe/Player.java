package tictactoe;

class Player {
	String name;
	char symbol;
	public Player(String name,char symbol)
	{
		setName(name);
		setSymbol(symbol);
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSymbol(char symbol)
	{
		this.symbol=symbol;
	}
	public String getName()
	{
		return this.name;
	}
	public char getSymbol()
	{
		return this.symbol;
	}
}
