import java.util.Scanner;

public class Test2525 {

	/* 오븐 시계
	 * 첫번째 줄 시 분, 두번째 줄 분 입력값 로직: 분 이후의 시간 출력
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hr, min, set;
		hr= sc.nextInt();
		min= sc.nextInt();
		set= sc.nextInt();
		
		sc.close();
		hr += set / 60;
		min += set % 60;
		
		hr += min / 60;
		min %= 60;
		
		if(23 < hr)
			hr -= 24;
			
		System.out.println(hr + " " + min);
	}

}
