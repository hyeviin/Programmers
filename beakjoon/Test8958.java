import java.util.Scanner;

public class Test8958 {
    public static void main(String[] args){
       /* OX퀴즈
        * 입력값TestIndex: 총 테스트해야하는 갯수
        * 입력 배열: tests, 결과 배열: results
        * = 점수는 그 문제까지 연속된 O의 개수, 점수 출력
        */

        Scanner sc= new Scanner(System.in);
        int testIndex;
        testIndex= sc.nextInt();
        String[] tests= new String[testIndex];
        //결과배열
        int[] results= new int[testIndex];

        //엔터 후 테스트케이스 입력
        sc.nextLine();

        for(int i= 0; i < tests.length; i++){
            
            //test입력
            tests[i]= sc.nextLine();

            //O만 구분하기
            String[] temp= tests[i].split("X");
            //System.out.println(temp); test
            //결과
            int result=0;
            for(String o:temp){
                //O일시만 문자열 데이터 있음. 혹시나 싶은 처리,,,(없어도 될 듯?)
                //System.out.println(o); test
                if(0 < o.length()){
                    for(int j= 1; j <= o.length(); j++){
                        result += j;
                    }
                }
            }
            results[i]= result;
        }
        sc.close();

        for(int ans: results)
            System.out.println(ans);
    }
}
