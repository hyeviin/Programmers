import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test17219 {
    public static void main(String[] args) throws NumberFormatException, IOException{
/*         17219: 비밀번호찾기
        버퍼로 입력받아서 해시 맵에 적용
        key의 값만 for문 돌려서 동일한 값만 출력함. */
        
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in)); //buffer 선언
        String nums= bf.readLine(); //먼저 1줄 입력
        StringTokenizer st; //한 줄에 2개 값이 입력되기에 분할해줄 토큰
        
        st= new StringTokenizer(nums);
        int tot = Integer.parseInt(st.nextToken()); //첫번째 호출
        int ansNum = Integer.parseInt(st.nextToken()); //두번째 호출
        
        HashMap<String,String> map = new HashMap<String,String>();//HashMap생성
        
        //(입력되는)tot
        for(int i= 0; i < tot; i++){
            //한 줄을 받아서
            String str= bf.readLine();
            st= new StringTokenizer(str);
            //토큰으로 메일과 비밀번호 나눠주고
            String key= st.nextToken();
            String value= st.nextToken();
            //map에 저장
            map.put(key, value);
        }

        //(찾아야하는) ansNum
        for(int i= 0; i < ansNum; i++){
            //한 줄을 받아서
            String value= bf.readLine();
            //containsKey로 받은 값과 저장된 값을 비교
            if(map.containsKey(value)){
                //동일하다면 찾아야 하는 비밀번호이기 때문에 출력함
                System.out.println(map.get(value));
            }
        }
        //이게 정답이네..?호매...
    }
}
