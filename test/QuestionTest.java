package test;

import java.util.ArrayList;

import model.Question;
import model.QuestionBank;

public class QuestionTest {

	public static void main(String[] args){

		ArrayList<Question> db = QuestionBank.database;
		Question q1 =db.get(0);
		q1.display();
		assert !q1.checkAnswer("Bill Gates");//== false;
		assert q1.checkAnswer("James Gosling");// == true;
		assert q1.checkAnswer("james gosling"); //== true;

	Question q2 =db.get(1);
	q2.display();
	assert q2.checkAnswer("Edmond");
	assert !q2.checkAnswer("Tusla");

	Question q3 =db.get(2);
	q3.display();
	assert q3.checkAnswer("2");
	assert!q3.checkAnswer("3");

	
	Question q4 =db.get(3);
	q4.display();
	assert q4.checkAnswer("4");
	assert !q4.checkAnswer("2");

	}
	
}
