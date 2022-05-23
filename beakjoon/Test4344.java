import java.util.Scanner;

public class Test4344 {
    public static void main(String[] args){
       /* 평균은 넘겠지
        * 입력값TestIndex: 총 테스트해야하는 갯수
        * 입력값stdIndex: 각 테스트 중 테스트하는 학생의 수
        * 입력값score[][]: 학생들의 점수 배열
        * = 각 Testindex마다 평균을 넘는 학생들의 비율을 반올림해 소수점 셋째 자리까지 출력 
        */

        Scanner sc= new Scanner(System.in);
        
        int TestIndex;
        TestIndex= sc.nextInt();
        
        //입력배열, 평균배열, 결과배열
        int[][] score= new int[TestIndex][];
        double[] avg= new double[TestIndex];
        double[] ans= new double[TestIndex];
        //입력받음
        for(int i= 0; i < TestIndex; i++){
            int index= sc.nextInt();
            score[i]= new int[index];
            double temp= 0;
            for(int j= 0; j < index; j++){
                score[i][j]= sc.nextInt();
                temp += score[i][j];
            }
            //TestIndex마다 평균의 값 저장
            //System.out.println("temp: " + temp + ", index: " + index);
            avg[i]= temp / index;
            
            //평균값보다 높은 사람 인원 체크
            int temp1= 0;
            for(int j= 0; j < index; j++){
                if(avg[i] < score[i][j])
                    temp1++;
            }
            //System.out.println(avg[i] + ", " + temp1);

            //인원 비율(퍼센트)
            ans[i]= ((double)temp1 / index) * 100;
            //System.out.println(ans[i]);
        }
        sc.close();

        //결과
        for(int i= 0; i < ans.length; i++)
            System.out.printf("%.3f%% \n", ans[i]);
    }
    
}
