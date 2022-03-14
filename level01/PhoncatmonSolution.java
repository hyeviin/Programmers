package level01;

public class PhoncatmonSolution {
    public int solution(int[] nums) {
        int[] test = new int[nums.length];
		int select = nums.length / 2;
        int answer = 0;
        
		for(int i= 0; i < nums.length; i++) {
			int check = 0;
			for(int j= 0; j < i; j++) {
				if(test[j] == nums[i]) {
					check = 1;
					break;
				}
			}
			if(check == 1)
				continue;
			test[i] = nums[i];
		}
		
		for(int i= 0; i < test.length; i++) {
			if(test[i] != 0)
				answer++;
		}
		
		if(select < answer)
			return select;
		else
			return answer;
    }
}
