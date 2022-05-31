package mod;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Overseer {

	/*These are the instance variables used to hold various information. The String arrays are used to hold options for JOptionPane selection windows.
	  The ArrayLists are used to hold values for correct answers, incorrect answers, user answers, and temp variables. The Generator variable is used
	  to access the methods in the Generator class to create new equations.*/
	private Generator g;
	private String[] options = {"Generate Math Problem", "Previous Problems", "Exit"};
	private String[] options2 = {"Addition", "Subtraction", "Multiplication", "Division", "Multiple Types", "Cancel"};
	private String[] optionsMultiple = {"Two Types", "Three Types", "All Types", "Cancel"};
	private String[] optionsTypes = {"Addition", "Subtraction", "Multiplication", "Division", "Cancel"};
	private String[] options3 = {"Yes", "No"};
	private ArrayList<String> questions;
	private ArrayList<String> uAnswer;
	private ArrayList<Boolean> correct;
	private ArrayList<String> temp;
	private ArrayList<Boolean> tempc;
	private ArrayList<String> tempu;
	
	/*This method is used to run all of the other methods in the classes. It contains all of the message dialogue commands, the option window commands, and
	  the decision making conditions in order to continue the program. The method will use the ArrayLists to track the inputs and outputs from the generator
	  and user.*/
	public Overseer() {
		g = new Generator();
		correct = new ArrayList<Boolean>();
		questions = new ArrayList<String>();
		uAnswer = new ArrayList<String>();
		JOptionPane.showMessageDialog(null, "Welcome to the Math Practice Program.", "Math Practice", 1, null);
		boolean loop = true;
		int i = 0;
		while(loop) {
			int a = JOptionPane.showOptionDialog(null, "What would you like to do?", "Math Practice", 0, 3, null, options, 0);
			if(a == 0) {
				temp = new ArrayList<String>();
				tempu = new ArrayList<String>();
				tempc = new ArrayList<Boolean>();
				String c = JOptionPane.showInputDialog(null, "How many problems would you like to solve?", "Math Practice", 3);
				int ca = Integer.parseInt(c);
				int b = JOptionPane.showOptionDialog(null, "What kind of math problem would you like to generate?", "Math Practice", 0, 3, null, options2, 0);
				if(b != 4) {
					for(int p = 0; p < ca; p++) {
						String s = opt(b);
						if(s != null) {
							questions.add(s + g.getAnswer());
							temp.add(s + g.getAnswer());
							String ans = JOptionPane.showInputDialog(null, "What is the answer to this question?\n\n" + s, "Math Practice", 3);
							int answer = Integer.parseInt(ans);
							uAnswer.add(ans);
							correct.add(answer == g.getAnswer());
							tempc.add(answer == g.getAnswer());
							tempu.add(ans);
							if(answer == g.getAnswer()) {
								JOptionPane.showMessageDialog(null, "The equation:\n\n" + questions.get(i) + "\n\nYou got the questions correct!", "Math Practice", 1, null);
								g.addC();
								i++;
							}
							else {
								JOptionPane.showMessageDialog(null, "The equation:\n\n" + questions.get(i) + "\n\nYou got the questions incorrect. :(\nBetter luck next time.", "Math Practice", 1, null);
								g.addI();
								i++;
							}
						}
					}
				}
				else {
					int d = JOptionPane.showOptionDialog(null, "How many types of problems would you like to generate?", "Math Practice", 0, 3, null, optionsMultiple, 0);
					if(d == 0) {
						int e = JOptionPane.showOptionDialog(null, "What is the first type of problem you would like solve?", "Math Practice", 0, 3, null, optionsTypes, 0);
						if(e != 4) {
							int f = JOptionPane.showOptionDialog(null, "What is the second type of problem you would like to solve?", "Math Practice", 0, 3, null, optionsTypes, 0);
							for(int p = 0; p < ca; p++) {
								String s = opt2(e, f);
								questions.add(s + g.getAnswer());
								temp.add(s + g.getAnswer());
								String ans = JOptionPane.showInputDialog(null, "What is the answer to this question?\n\n" + s, "Math Practice", 3);
								int answer = Integer.parseInt(ans);
								uAnswer.add(ans);
								correct.add(answer == g.getAnswer());
								tempc.add(answer == g.getAnswer());
								tempu.add(ans);
								if(answer == g.getAnswer()) {
									JOptionPane.showMessageDialog(null, "The equation:\n\n" + questions.get(i) + "\n\nYou got the questions correct!", "Math Practice", 1, null);
									g.addC();
									i++;
								}
								else {
									JOptionPane.showMessageDialog(null, "The equation:\n\n" + questions.get(i) + "\n\nYou got the questions incorrect. :(\nBetter luck next time.", "Math Practice", 1, null);
									g.addI();
									i++;
								}
							}
						}
					}
					else if(d == 1) {
						int e = JOptionPane.showOptionDialog(null, "What is the first type of problem you would like solve?", "Math Practice", 0, 3, null, optionsTypes, 0);
						if(e != 4) {
							int f = JOptionPane.showOptionDialog(null, "What is the second type of problem you would like to solve?", "Math Practice", 0, 3, null, optionsTypes, 0);
							int h = JOptionPane.showOptionDialog(null, "What is the third type of problem you would like to solve?", "Math Practice", 0, 3, null, optionsTypes, 0);
							for(int p = 0; p < ca; p++) {
								String s = opt2(e, f, h);
								questions.add(s + g.getAnswer());
								temp.add(s + g.getAnswer());
								String ans = JOptionPane.showInputDialog(null, "What is the answer to this question?\n\n" + s, "Math Practice", 3);
								int answer = Integer.parseInt(ans);
								uAnswer.add(ans);
								correct.add(answer == g.getAnswer());
								tempc.add(answer == g.getAnswer());
								tempu.add(ans);
								if(answer == g.getAnswer()) {
									JOptionPane.showMessageDialog(null, "The equation:\n\n" + questions.get(i) + "\n\nYou got the questions correct!", "Math Practice", 1, null);
									g.addC();
									i++;
								}
								else {
									JOptionPane.showMessageDialog(null, "The equation:\n\n" + questions.get(i) + "\n\nYou got the questions incorrect. :(\nBetter luck next time.", "Math Practice", 1, null);
									g.addI();
									i++;
								}
							}
						}
					}
					else if(d == 2) {
						for(int p = 0; p < ca; p++) {
							String s = g.generateRandom();
							questions.add(s + g.getAnswer());
							temp.add(s + g.getAnswer());
							String ans = JOptionPane.showInputDialog(null, "What is the answer to this question?\n\n" + s, "Math Practice", 3);
							int answer = Integer.parseInt(ans);
							uAnswer.add(ans);
							correct.add(answer == g.getAnswer());
							tempc.add(answer == g.getAnswer());
							tempu.add(ans);
							if(answer == g.getAnswer()) {
								JOptionPane.showMessageDialog(null, "The equation:\n\n" + questions.get(i) + "\n\nYou got the questions correct!", "Math Practice", 1, null);
								g.addC();
								i++;
							}
							else {
								JOptionPane.showMessageDialog(null, "The equation:\n\n" + questions.get(i) + "\n\nYou got the questions incorrect. :(\nBetter luck next time.", "Math Practice", 1, null);
								g.addI();
								i++;
							}
						}
					}
				}
				JOptionPane.showMessageDialog(null, "Previous Problems:\n\n" + drawMap(temp, tempu, tempc) + "Questions Correct: " + correct() + "\nQuestions Incorrect: " + incorrect() 
				+ "\nPercentage Correct: " + percentage() * 100 + "%", "Math Practice", 1, null);
			}
			else {
				if(a == 1) {
					JOptionPane.showMessageDialog(null, "Previous Problems:\n\n" + drawMap(questions, uAnswer, correct) + ratios(), "Math Practice", 1, null);
				}
				else {
					int b = JOptionPane.showOptionDialog(null, "Are you sure you would like to exit the program?", "Math Practice", 0, 3, null, options3, 0);
					if(b == 0) {
						loop = false;
						JOptionPane.showMessageDialog(null, "Thank you for using the Math Practice Program.\nHope to see you again soon. :)", "Math Practice", 1, null);
					}
				}
			}
		}
	}
	
	//This method takes the user input from the single selection and calls the Generator class to create a new equation of that type and returns it.
	public String opt(int x) {
		if(x == 0) 
			return g.generateAddition();
		else if(x == 1)
			return g.generateSubtraction();
		else if(x == 2)
			return g.generateMultiplication();
		else if(x == 3)
			return g.generateDivision();
		return null;
	}
	
	/*THis method randomly determines which of the two selected math equation types chosen by the user to generate. It will call the other class to create
	  a new equation of either of the two user-selected equation types.*/
	public String opt2(int x, int y) {
		if(Math.random() < 0.5) {
			if(x == 0) 
				return g.generateAddition();
			else if(x == 1)
				return g.generateSubtraction();
			else if(x == 2)
				return g.generateMultiplication();
			else if(x == 3)
				return g.generateDivision();
		}
		else {
			if(y == 0) 
				return g.generateAddition();
			else if(y == 1)
				return g.generateSubtraction();
			else if(y == 2)
				return g.generateMultiplication();
			else if(y == 3)
				return g.generateDivision();
		}
		return null;
	}
	
	/*THis method randomly determines which of the three selected math equation types chosen by the user to generate. It will call the other class to create
	  a new equation of any of the three user-selected equation types.*/
	public String opt2(int x, int y, int z) {
		if(Math.random() < 0.33) {
			if(x == 0) 
				return g.generateAddition();
			else if(x == 1)
				return g.generateSubtraction();
			else if(x == 2)
				return g.generateMultiplication();
			else if(x == 3)
				return g.generateDivision();
		}
		else if(Math.random() < 0.66){
			if(y == 0) 
				return g.generateAddition();
			else if(y == 1)
				return g.generateSubtraction();
			else if(y == 2)
				return g.generateMultiplication();
			else if(y == 3)
				return g.generateDivision();
		}
		else {
			if(z == 0) 
				return g.generateAddition();
			else if(z == 1)
				return g.generateSubtraction();
			else if(z == 2)
				return g.generateMultiplication();
			else if(z == 3)
				return g.generateDivision();
		}
		return null;
	}
	
	/*This method is used to create a String that shows all of the equations that the user has been given, along with the user's answer and the correct answer.*/
	public String drawMap(ArrayList<String> s, ArrayList<String> u, ArrayList<Boolean> c) {
		String ret = "";
		for(int i = 0; i < s.size(); i++) {
			ret += (i + 1) + ") " + s.get(i) + "\nYour Answer: " + u.get(i) + "\nCorrect: " + c.get(i) + "\n\n";
		}
		return ret;
	}
	
	/*This method returns a String that includes the number of questions correct, number of questions incorrect, and the percentage for the number of questions
	  correct out of total questions.*/
	public String ratios() {
		return "Questions Correct: " + g.getCorrect() + "\nQuestions Incorrect: " + g.getIncorrect() 
		+ "\nPercentage Correct: " + g.getCorrect() / (1.0 * g.getCorrect() + g.getIncorrect()) * 100 + "%";
	}
	
	//This method determines how many questions the user has gotten correct.
	public int correct() {
		int cnt = 0;
		for(Boolean a : tempc) {
			if(a == true)
				cnt++;
		}
		return cnt;
	}
	
	//This method determines how many questions the user has gotten incorrect.
	public int incorrect() {
		int cnt = 0;
		for(Boolean a : tempc) {
			if(a == false)
				cnt++;
		}
		return cnt;
	}
	
	//THis method deteremines the percentage of questions the user has gotten correct compared to total questions.
	public double percentage() {
		return 1.0 * correct() / (correct() + incorrect());
	}
}
