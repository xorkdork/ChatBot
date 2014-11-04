package chatbot.model;

public class ChatbotUser
{
	private String userName;
	private int age;
	private boolean hasTattoos;
	private boolean needsCorrectiveLenses;
	public ChatbotUser()
	{
		this.userName = "";
		this.age = -999;
		this.hasTattoos = false;
		this.needsCorrectiveLenses = false;
	}
	public String getUserName()
	{
		return userName;
	}
	public int getAge()
	{
		return age;
	}
}
