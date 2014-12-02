package chatbot.model;

import java.util.ArrayList;

public class Chatbot

{
	private ArrayList<String> memeList;
	private String name;

	/**
	 * creates a Chatbot object with the simplified name and initializes the
	 * current number of chats to zer0.
	 * 
	 * @param name
	 *            The supplied name for the Chatbot
	 */
	
	public Chatbot(String name)
	{
		memeList = new ArrayList<String>();
		userInputList = new ArrayList<String>();
		this.name = name;
		contentArea = "";
		chatCount = 0;
		myUser = new ChatbotUser();
		fillTheMemeList();
	}
	private String contentArea;
	/**
	* The amount of chats that have occurred with this chatbot.
	*/
	private int chatCount;
	/**
	* The current user of the Chatbot object.
	*/
	private ChatbotUser myUser;
	/**
	* The list of user input for the Chatbot
	*/
	private ArrayList<String> userInputList; 

	

	public String getName()
	{
		return name;
	}
	// Le Meme List
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

	public ChatbotUser getMyUser()
	{
		return myUser;
	}

	public void setMyUser(ChatbotUser myUser)
	{
		this.myUser = myUser;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String processText(String currentInput)
	{
		String result = "";
		if (getChatCount() < 5)
		{
			// Ask questions about all data members here
			// you will need ifs or a switch
			// assign via myUser.set...
			if (getChatCount() == 0)
			{
				myUser.setUserName(currentInput);
				result = "Good name " + myUser.getUserName() + " how old are you?";
			}
			else if (getChatCount() == 1)
			{
				int userAge = Integer.parseInt(currentInput);
				myUser.setAge(userAge);
			}
			// continue for other user info fields
		}
		else if (currentInput != null && currentInput.length() > 0)
		{
			int randomPosition = (int) (Math.random() * 6);
			if (randomPosition == 0)
			{
				if (stringLengthChecker(currentInput))
				{
					result = "too long";
				}
				else
				{
					result = "short words";
				}
			}
			else if (randomPosition == 1)
			{
				if (contentChecker(currentInput))
				{
					result = "yup you know the secret";
				}
				else
				{
					result = "try again another time";
				}
			}
			else if (randomPosition == 2)
			{
				if (memeChecker(currentInput))
				{
					result = "Wow, " + currentInput + " is a meme. Wahoo!";
				}
				else
				{
					result = "not a meme, try again";
				}
			}
			else if (randomPosition == 3)
			{
				// Talk about the user here
			}
			else if (randomPosition == 4)
			{
				// add to our list
				userInputList.add(currentInput);
				result = "Thank you for the comment";
			}
			else
			{
				if (userInputChecker(currentInput))
				{
				}
				else
				{
				}
			}
		}
		else
		{
			result = "use words!!!!";
		}
		updateChatCount();
		return result;
	}

	private boolean userInputChecker(String userInput)
	{
		boolean matchesInput = false;
		for (int loopCount = 0; loopCount < userInputList.size(); loopCount++)
		{
			if (userInput.equalsIgnoreCase(userInputList.get(loopCount)))
			{
				matchesInput = true;
				userInputList.remove(loopCount);
				loopCount--;
			}
		}
		return matchesInput;
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
			if (input.equalsIgnoreCase(currentMeme))
			{
				isAMeme = true;
			}
		}
		for (int loopCounter = 0; loopCounter < memeList.size(); loopCounter++)
		{
			if (input.equalsIgnoreCase(memeList.get(loopCounter)))
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
