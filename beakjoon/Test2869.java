
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2869 {

	public static void main(String[] args) {
		/* 달팽이는 올라가고 싶다
		 * 낮에 A미터 올라가고, B미터 미끄러진다. 높이 V미터인 나무 막대 꼭대기까지 올라가는 데 걸리는 시간은? 
		 * 입력값A: 필수적으로 +되는 값
		 * 입력값B: 이후 -되는 값 
		 * 입력값V: 도달해야하는 값
		 */
		
		
		/*
		Scanner sc= new Scanner(System.in);
		int top, down, goal;
		int temp= 0;
		
		top= sc.nextInt();
		down= sc.nextInt();
		goal= sc.nextInt();

		sc.close();

		int i;
		for(i= 0; temp < goal; i++){
			if(-1 < (i-1))
				temp -= down;
			// System.out.println(i + ": " + temp);
			temp += top;
			// System.out.println(i + ": " + temp);
		}

		System.out.println(i);
		*/

		
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		try {
			String inNum= br.readLine();
			String[] inNums= inNum.split(" ");
			
			int top= Integer.parseInt(inNums[0]);
			int down= Integer.parseInt(inNums[1]);
			int goal= Integer.parseInt(inNums[2]);
            
			int day= (goal-down)/(top-down);

			if(((goal-down)%(top-down)) != 0)
				day++;
			System.out.println(day);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
