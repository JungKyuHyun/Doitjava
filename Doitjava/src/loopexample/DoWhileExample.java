package loopexample;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while(num <=10 );
		
		System.out.println(sum);
	}
} // do-while문의 경우 조건이 참이 아니더라도 do{}는 무조건 한번은 실행함.
