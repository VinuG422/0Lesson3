package model;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Question{
// One for text and one for answer.
	private String text; 
	private String answer;

	// constructor. 
	public Question(String text, String answer){
		this.text = text;
		this.answer = answer;
	}

	// Check if answer is correct
	// True or false.

	public boolean checkAnswer(String response){
		return response.equalsIgnoreCase(answer);
	}

	// Display the question. 

	public void display(){
		System.out.println(text);
	}

	public void render(Graphics2D g2){
		g2.setColor(Color.yellow);
		g2.setFont(new Font("courier" , Font.BOLD, 14 ));
		g2.drawString(text, 50, 100);
		


	}

}