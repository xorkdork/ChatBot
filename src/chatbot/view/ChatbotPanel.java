package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatbotAppController;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ChatbotPanel extends JPanel
{
	private ChatbotAppController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	public ChatbotPanel(ChatbotAppController baseController) 
	{
		this.baseController = baseController;
		firstButton = new JButton("click pls");
		firstButton.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		chatPane = new JScrollPane();
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		this.setBackground(SystemColor.windowBorder);
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
		this.add(chatPane);
		chatArea = new JTextArea(5, 20);
		add(chatArea);
		
		chatArea.setLineWrap(true);
	
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 145, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 155, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatArea, 107, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatArea, -5, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 6, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 89, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, 26, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, 271, SpringLayout.WEST, this);
	}
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText(firstTextField.getText()+ ";)");
			}
		});
		
	}
}
