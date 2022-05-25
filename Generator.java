package mod;

public class Generator {
	
	/*These instance variables are used to store data for the number of correct and incorrect questions that have been answered,
	  along with the correct answer for the current question.*/
	private int correct;
	private int incorrect;
	private int answer;
	
	//These methods give access to the values that are stored within the private instance variables.
	public int getCorrect() {return correct;}
	public int getIncorrect() {return incorrect;}
	public int getAnswer() {return answer;}
	
	//These setters allow for the incrementation of the instance varaibles from outside classes.
	public void addC() {correct++;}
	public void addI() {incorrect++;}
	
	//The constructor sets the "correct" and "incorrect" instance variables to be 0, as no questions have been answered yet.
	public Generator() {
		correct = 0;
		incorrect = 0;
	}
	
	/*This method is used to generate a new addition problem. It will create the two numbers from 0 - 100. The answer to the question is
	  the greater of the two numbers, and is stored in the "answer" instance variable. It will return the finished equation, which is
	  (bigger number - smaller number) + smaller number = bigger number.*/
	public String generateAddition() {
		int num1 = ((int) (Math.random() * 10)) + (((int) (Math.random() * 10)) * 10);
		if(Math.random() < 0.50)
			num1++;
		int num2 = ((int) (Math.random() * 10)) + (((int) (Math.random() * 10)) * 10);
		if(Math.random() < 0.50)
			num2++;
		if(num1 > num2) {
			answer = num1;
			return num1 - num2 + " + " + num2 + " = ";
		}
		else {
			answer = num2;
			return num2 - num1 + " + " + num1 + " = ";
		}
	}
	
	
	public String generateSubtraction() {
		int num1 = ((int) (Math.random() * 10)) + (((int) (Math.random() * 10)) * 10);
		if(Math.random() < 0.50)
			num1++;
		int num2 = ((int) (Math.random() * 10)) + (((int) (Math.random() * 10)) * 10);
		if(Math.random() < 0.50)
			num2++;
		if(num2 > num1) {
			answer = num2;
			return (num2 + num1) + " - " + num1 + " = ";
		}
		else {
			answer = num1;
			return (num1 + num2) + " - " + num2 + " = ";
		}
	}
	
	
	public String generateMultiplication() {
		int num1 = ((int) (Math.random() * 10)) + (((int) (Math.random() * 10)) * 10);
		if(Math.random() < 0.50)
			num1++;
		int num2 = ((int) (Math.random() * 10));
		if(Math.random() < 0.50)
			num2++;
		if(num1 % num2 != 0)
			num1 -= num1 % num2;
		answer = num1;
		return answer / num2 + " \u00D7 " + num2 + " = ";
	}
	
	/*This method is used to generate a new division problem. 
	  */
	public String generateDivision() {
		int num1 = ((int) (Math.random() * 10)) + (((int) (Math.random() * 10)) * 10);
		if(Math.random() < 0.50)
			num1++;
		int num2 = ((int) (Math.random() * 10)) + (((int) (Math.random() * 10)) * 10);
		if(Math.random() < 0.50)
			num2++;
		answer = num1;
		return (num1 * num2) + " \u00F7 " + num2 + " = ";
	}
	
	//This method will choose a random math problem to generate each time it is called. 
	public String generateRandom() {
		double x = Math.random();
		if(x < 0.25) {
			return generateAddition();
		}
		else if(x < 0.5) {
			return generateSubtraction();
		}
		else if(x < 0.75) {
			return generateMultiplication();
		}
		else {
			return generateDivision();
		}
	}
}
