import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class HideNumber {
    public static void main(String[] args){
        String answer = "";
        //String phone_number= "027778888"; test

        //생각, 문자열 개수를 알기 때문에 받은 문자열-4의 숫자만큼 *를 입력하고, 
        //마지막 4자리를 파싱해서  answer에 넣어놓자
        int index= phone_number.length()-4;

        //4자리 전까지 *
        for(int i= 0; i < index; i++){
            answer += "*";
        }

        //마지막 4자리 추출해서 값 추가
        answer += phone_number.substring(index, phone_number.length());

        // System.out.println("디버그: " + index);
        // System.out.println("결과값: " + answer);
        // return answer;
    }
}
