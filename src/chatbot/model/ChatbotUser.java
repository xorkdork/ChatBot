package chatbot.model;

public class ChatbotUser
{
	private String userName;
	private int age;
	private boolean hasTattoos;
	private boolean needsCorrectiveLenses;
	// things about the user
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
	public boolean isHasTattoos()
	{
		return hasTattoos;
	}
	public boolean isNeedsCorrectiveLenses()
	{
		return needsCorrectiveLenses;
	}
	public void setNeedsCorrectiveLenses(boolean needsCorrectiveLenses)
	{
		this.needsCorrectiveLenses = needsCorrectiveLenses;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setHasTattoos(boolean hasTattoos)
	{
		this.hasTattoos = hasTattoos;
	}
}
