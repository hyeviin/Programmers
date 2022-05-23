import java.util.Scanner;

public class Test1712 {

	public static void main(String[] args) {
		/* 손익분기점
		 * 노트북을 생산하는 값보다, 판매하는 값이 더 클 때의 판매량 출력. 
		 * 입력값A: 고정비용 (매년) 1회
		 * 입력값B: 가변비용  (생산시 마다) 중복
		 * 입력값C: 1대당 판매비용 
		 * 더 클 때가 없다면, -1을 출력
		 */
		
		Scanner sc= new Scanner(System.in);
		
		int fixPrice, varPrice, sale;

		fixPrice= sc.nextInt();
		varPrice= sc.nextInt();
		sale= sc.nextInt();
		sc.close();

		if(sale <= varPrice)
			System.out.println(-1);
		else{
			int i= 1; 
			while((sale-varPrice)*i <= fixPrice){
				i++;
			}
			System.out.println(i);
		}
	}

}
