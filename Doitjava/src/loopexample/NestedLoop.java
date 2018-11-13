package loopexample;

public class NestedLoop { //nested loop : 중첩루프=내포된루프, 외부루프와 내부 루프로 나뉨 

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2; dan<=9 ; dan++) {
			for(times = 1; times<=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				
			}
			System.out.println();
		}
	}

}
