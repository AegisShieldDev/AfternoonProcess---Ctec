package process.model;

public class PlayDohPoly
{
	private int sides;
	
	public PlayDohPoly()
	{
		this.sides = 5;  
	}
	
	public PlayDohPoly(int sides)
	{
		this.sides = sides;
	}
	
	public String toString()
	{
		String description = "I am a Polygon, I have " + sides + " sides";
		return description;
	}
}
