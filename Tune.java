package ie.dit;

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Tune
{
	//x field
	private int x;

	public int getX()
	{
		return x;
	}

	public Tune(int x)
	{
		getX(x);
	}

	//title field
	private String title;

	public int getTitle()
	{
		return title;
	}

	public Tune(String title)
	{
		getTitle(title);
	}

	//altTitle field
	private String altTitle;

	public int getAltTitle()
	{
		return altTitle;
	}

	public Tune(String altTitle)
	{
		getAltTitle(altTitle);
	}

	//notation field
	private String notation;

	public int getNotation()
	{
		return notation;
	}

	public Tune(String notation)
	{
		getNotation(notation);
	}

	//toString
	public String toString()
    {
	    String str = "";
        for(String words:tunes)
        {
        	str += words + "x," + "title," + "altTitle";
        }
        return str;
    }
}