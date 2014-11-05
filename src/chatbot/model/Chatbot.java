package chatbot.model;

import java.util.ArrayList;

public class Chatbot

{
	private ArrayList<String> memeList;
	private String name;
	private int chatCount;
	/**
	 * creates a Chatbot object with the simplified name and initializes the current number of chats to zer0.
	 * 
	 * @param name The supplied name for the Chatbot
	 */
	public Chatbot(String name)
	{
		memeList = new ArrayList<String>();
		this.name = name;
		chatCount = 0;
		fillTheMemeList();
	}
	public String processText(String currentInput)
	{
		String result = "";
		int randomPosition = (int) (Math.random() * 3);
		if(currentInput != null)
		if(randomPosition == 0)
			if(stringLengthChecker(currentInput))
		{
			
			result = "too long";
		}
			else 
			{
				
				result = "short words";
			}
		else if(randomPosition == 1)
		
		{
			if(contentChecker(currentInput))
			{
				result = "yup";
			}
			else
			{
				result = "nope";
			}
			
		}
		if(memeChecker(currentInput))
		{
			result = " wow, " + currentInput + " is a meme, wahoo!";
		}
		else
		{
			result = " not a meme, try again";
			
		}
	

		return result;
	}
	public String getName()
	{
		return name;
	}
	private void fillTheMemeList()
	{
		memeList.add("kitties");
		memeList.add("doge");
		memeList.add("Jangles");
		memeList.add("satan bear");
		memeList.add("y u no");
		
	}
	public int getChatCount()
	
	{
		return chatCount;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	private void updateChatCount()
	{
		chatCount++;
	}
	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;
		if (input.length() >= 20)
		{
			isTooLong = true;
		}
		return isTooLong;
	}
	private boolean contentChecker(String input)
	{
		boolean hasContent = false;
		return hasContent;
	
		
	}
	private boolean memeChecker(String input)
	{
		boolean isAMeme = false;
		for (String currentMeme : memeList)
		{
			if(input.equalsIgnoreCase(currentMeme))
			{
				isAMeme = true;
			}
		}
		for(int loopCounter = 0; loopCounter <memeList.size(); loopCounter++)
		{
			if(input.equalsIgnoreCase(memeList.get(loopCounter)))
			{
				isAMeme = true;
			}
		}
		return isAMeme;
	}
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
	
		if (input != null && input.equals("Scumbag"))
		{
			okToQuit = true;
		}
		return okToQuit;
	}
}
