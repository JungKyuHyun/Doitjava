package loopexample;

public class BreakExample2 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num=0; ; num++) { //조건식 생략.for 문안에..!
			sum += num;
			if (sum >=100)
				break;
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}

}
