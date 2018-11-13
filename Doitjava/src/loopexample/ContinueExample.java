package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <=100 ; num++) {
			if(num % 2 == 1) {
				continue;  //반복문에서 continue문을 만나면 이후의 문장은 수행하지 않고 for문의 처음으로 돌아가 증감식을 실행 
			}
			total += num;
		}
	System.out.println(total);
	}

}
