import java.util.Scanner;

public class Test2480 {

	public static void main(String[] args) {
		/* 주사위 세개
		 * 입력값01: 같은 눈 3개 일 때, 10,000원+(같은 눈)×1,000원의 상금 
		 * 입력값02: 같은 눈 2개 일 때, 1,000원+(같은눈)×100원의 상금 
		 * 입력값03: 같은 눈 0개 일 때, (그 중 가장 큰 눈)×100원의 상금
		 */
		Scanner sc= new Scanner(System.in);
		
		int n0, n1, n2;
		int ans= 0;
		
		n0= sc.nextInt();
		n1= sc.nextInt();
		n2= sc.nextInt();
		
		sc.close();
		//같은 눈 3개
		if((n0 == n1) && (n1 == n2)) {
			ans= 10000 + (n0 * 1000);
		}else {
			//같은 눈 2개
			if((n0 == n1) || (n0 == n2)) {
				ans= 1000 + (n0 * 100);
			}else if((n1 == n2)) {
				ans= 1000 + (n1 * 100);
			}else {
				//같은 눈 0개
				if(n0 < n1) {
					if(n1 < n2) {
						ans= n2 * 100;
					}else {
						ans= n1 * 100;
					}
				}else {
					if(n0 < n2) {
						ans= n2 * 100;
					}else {
						ans= n0 * 100;
					}
				}
			}
		}
		
		System.out.println(ans);
	}

}
