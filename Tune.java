package ie.dit;

public class Tune
{
	private int x;

	public int getX()
	{
		return x;
	}

	public Tune(int x)
	{
		getX(x);
	}

	private String title;

	public int getTitle()
	{
		return title;
	}

	public Tune(String title)
	{
		getTitle(title);
	}


	private String altTitle;

	public int getAltTitle()
	{
		return altTitle;
	}

	public Tune(String altTitle)
	{
		getAltTitle(altTitle);
	}

	private String notation;

	public int getNotation()
	{
		return notation;
	}

	public Tune(String notation)
	{
		getNotation(notation);
	}

}