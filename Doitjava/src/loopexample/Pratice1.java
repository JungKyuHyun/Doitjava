package loopexample;

public class Pratice1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		if (operator == '+') {
			System.out.println(num1 + num2);
					}
		else if (operator == '-') {
			System.out.println(num1 - num2);
				}
		else if (operator == '*') {
			System.out.println(num1*num2);
			}
		else if (operator == '%') {
			System.out.println(num1 % num2);
		}
		else {
			System.out.println("연산자를 다시 입력해 주세요.");
		}
	}
}
