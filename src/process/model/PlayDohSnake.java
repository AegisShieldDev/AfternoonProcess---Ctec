package process.model;

public class PlayDohSnake
{
	private int length;
	
	public PlayDohSnake(int length)
	{
		this.length = length;
	}
	
	public String toString()
	{
		String description = "The length of this snake is " + length;
		return description;
	}
}
