package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;
/**
 * Runs the Chatbot.
 * @author xorkdork
 * @version 1.2 10/9/14 
 */
public class ChatbotAppController
{
	private ChatbotView applicationView;
	private Chatbot mySillyChatbot;
	private String startMessage;
	private String quitMessage;
	public ChatbotAppController()
	{
		applicationView = new ChatbotView(this);
		mySillyChatbot = new Chatbot("Derf");
		startMessage = "Welcome to the " + mySillyChatbot.getName() + "chatbot. What is your name?";
		quitMessage = "goodbye cruel user :(";
	}
	public Chatbot getMySillyChatbot()
	{
		return mySillyChatbot;
	}
	/**
	 * is a loop
	 */
	public void start()
	{
		String result = applicationView.showChatbotDialog(startMessage);
		while(!mySillyChatbot.quitChecker(result))
		{
			result = mySillyChatbot.processText(result);
			result = applicationView.showChatbotDialog(result);
		}
			quit();
		
	}

	private void quit()
	{
		applicationView.showChatbotMessage(quitMessage);
		System.exit(0);
	}

}
