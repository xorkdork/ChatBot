package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatbotAppController;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class ChatbotFrame extends JFrame
{
	private ChatbotPanel basePanel;
	public ChatbotFrame(ChatbotAppController baseController) 
	{
		setTitle("da chatbot");
		setFont(new Font("Comic Sans MS", Font.ITALIC, 12));
		setBackground(SystemColor.desktop);
		setForeground(SystemColor.desktop);
		basePanel = new ChatbotPanel(baseController);
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setResizable(false);
		setVisible(true);
	}

}
