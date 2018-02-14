package ie.dit;

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();

	public TuneBook()
    {
        loadTuneBook();
    }

    public void TuneBook()
    {
    	BufferedReader inputStream = null;
			try {
    		
    		inputStream = new BufferedReader(new FileReader("words.txt"));
    
    		String l;
    		
    		while ((l = inputStream.readLine()) != null) 
    		{
        		System.out.println(l);
    		}
	}
		catch (IOException e)
		{
    		e.printStackTrace();
		} 
		finally 
		{
    		if (inputStream != null) {
        	try
        	{
            	inputStream.close();
        	}
        	catch(Exception e)
        	{
           		e.printStackTrace();
        	}
    	}
    }
}