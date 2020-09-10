package model;

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

}