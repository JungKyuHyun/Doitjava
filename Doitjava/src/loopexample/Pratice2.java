package loopexample;

public class Pratice2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		switch (operator) {
		case '+' :
			System.out.println(num1 + num2);
			break;
		case '-' : 
			System.out.println(num1 - num2);
			break;
		case '*' :
			System.out.println(num1 * num2);
			break;
		case '%' :
			System.out.println(num1 % num2);
			break;
		default :
			System.out.println("연산자를 다시 입력 하세요.");
			break;
		}
	}

}
