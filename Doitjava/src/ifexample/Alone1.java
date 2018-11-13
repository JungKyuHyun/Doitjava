package ifexample;

public class Alone1 {

	public static void main(String[] args) {
		String stair = "2층";
		
		switch (stair) {
		case "1층" :
			System.out.println(stair + " 약국 입니다.");
			break;
		case "2층":
			System.out.println(stair + " 정형외과 입니다.");
			break;
		case "3층":
			System.out.println(stair + " 피부과 입니다.");
			break;
		case "4층" :
			System.out.println(stair + " 치과 입니다.");
			break;
		case "5층" :
			System.out.println(stair + " 헬스클럽입니다.");
			break;
		default:
			System.out.println("그런 층은 없어요!");
			break;
			
		}
	}

}
