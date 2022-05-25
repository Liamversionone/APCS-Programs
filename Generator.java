package mod;

public class Generator {

	private int correct;
	private int incorrect;
	private int answer;
	
	public int getCorrect() {return correct;}
	public int getIncorrect() {return incorrect;}
	public int getAnswer() {return answer;}
	
	public void addC() {correct++;}
	public void addI() {incorrect++;}
	
	public Generator() {
		correct = 0;
		incorrect = 0;
	}
	
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
