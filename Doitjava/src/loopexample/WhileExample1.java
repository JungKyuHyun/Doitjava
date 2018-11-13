package loopexample;

public class WhileExample1 {

	public static void main(String[] args) {
		int num = 1; //선언과 동시에 초기값 생성 
		int sum = 0;
		
		while (num <=10) { //while(조건식) --> 조건식이 참일때 실행, 거짓이 되면 실행 멈춤 /while(true)=무한반복 
			sum+=num;
			num++;
		}
		System.out.println(sum);
	}
} // while 문의 경우 조건이 거짓일 경우 한번도 실행이 안됨 
