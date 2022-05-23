import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Test1764 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));// buffer 선언
        StringTokenizer st; 

        /* 듣보잡
         *for문 하나를 사용해서 한 번에 처리 가능한지 검색해보자.
         * 해쉬맵의 값에 null을 사용할 수 있다면,
         * 키랑 값이 같은 거만 카운트 해도 괜찮을 듯.
         * **사전 순으로 출력한다!**에라잉ㅜㅜ
        */

        //1번째 줄 2개의 입력값 받기
        String first= bf.readLine();
        //토큰 선언
        st= new StringTokenizer(first);
        //2개 듣못명단 수, 보못명단 수
        int listen= Integer.parseInt(st.nextToken());
        int see= Integer.parseInt(st.nextToken());
        int answer= 0;

        //해쉬맵 선언
        HashMap<String, String> map= new HashMap<String, String>();
        for(int i= 0; i < listen+see; i++){
            //듣보잡들 명단 입력
            String str= bf.readLine();
            
            //상관 없을 것 같긴 한데, 일단 듣지 못한 친구들 키로 저장함.
            if(i < listen){
                map.put(str, null);
            //보지 못한 친구들 저장
            }else{
                //할 땐, 듣지 못한 친구들 중 중복이 있는지 확인 
                if(map.containsKey(str)){
                    //후 저장, 숫자 세주기
                    map.put(str, str);
                    answer++;
                }
            }
        }

        //몇 명인지 숫자 출력해주고..
        System.out.println(answer);
        //사전 순으로 출력해야한대.....하...
        String[] answers= new String[answer];
        int i= 0;
        //일단 키와 값이 중복인 친구들 찾아서 배열에 저장
        for(Map.Entry<String, String> find:map.entrySet()){
            if(find.getKey().equals(find.getValue())){
                answers[i++] = find.getKey();
            }
        }
        //사전으로 정렬
        Arrays.sort(answers);
        //출력...
        for(int j= 0; j < answers.length; j++){
            System.out.println(answers[j]);
        }
        //아 줄일 방법이 없나??
    }
}
