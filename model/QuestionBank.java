
package model;

import java.util.ArrayList;

public class QuestionBank {

	public static final ArrayList<Question> database = new ArrayList<>();

	static{

	database.add(new Question(
		"Who is the inventor of java language?",
		"James Gosling"
	));

	database.add(new Question(

		"in what city is UCO located",
		"Edmond"


	));
	var c1 = new ChoiceQuestion(
		"What is the captail city of Oklahoma?",
		"2"

	);
		c1.addChoice("Norman");
		c1.addChoice("Oklahoma City");
		c1.addChoice("USA");
		c1.addChoice("Tulsa");
		database.add(c1);

		var c2 = new ChoiceQuestion(
			
		 "Which of the foloowing is not a Java Keyword?",
		"4"
		);
		c2.addChoice("int");
		c2.addChoice("for");
		c2.addChoice("instanceof");
		c2.addChoice("String");
		database.add(c2);

	







	}


	
}
