import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Test1620 {
    public static void main(String[] args) throws IOException{
        /* 1620: 나는야 포켓몬 마스터 이다솜....^^(킹받네)
            시간초과 났음. 배열을 사용했는데, 2가지 해시맵을 사용하니
            치료됐습니다^^ 최고다
         */
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));// buffer 선언
        StringTokenizer st;

        //첫 번째 줄 2개의 입력값 받기
        String first= bf.readLine();
        st= new StringTokenizer(first);
        int tot= Integer.parseInt(st.nextToken());
        int pro= Integer.parseInt(st.nextToken());

        Map<String, Integer> pokMap= new HashMap<String, Integer>();
        Map<Integer, String> numMap= new HashMap<Integer, String>();
        for(int i= 1; i <= tot; i++){
            String pokemon= bf.readLine();
            pokMap.put(pokemon, i);
            numMap.put(i, pokemon);
        }

        for(int i= 0; i < pro; i++){
            String problem= bf.readLine();
            
            boolean isNumeric= true;
           if(!Character.isDigit(problem.charAt(0))){
               isNumeric= false;
           }
            if(isNumeric){
                int isNum= Integer.parseInt(problem);
                if(numMap.containsKey(isNum)){
                    System.out.println(numMap.get(isNum));
                }
            }else{
                if(pokMap.containsKey(problem)){
                    System.out.println(pokMap.get(problem));
                }
            }
        }
    }
}
