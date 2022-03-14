package level01;

public class PhoncatmonMe {
	public static void main(String[] args) {
		int[] nums2= {3, 3, 3, 2, 2, 2};

		int[] test = new int[nums2.length];
		int answer = 0;
		
		int select = nums2.length / 2;
		for(int i= 0; i < nums2.length; i++) {
			int check = 0;
			for(int j= 0; j < i; j++) {
				if(test[j] == nums2[i]) {
					check = 1;
					break;
				}
			}
			if(check == 1)
				continue;
			test[i] = nums2[i];
		}
		
		for(int i= 0; i < test.length; i++) {
			if(test[i] != 0)
				answer++;
		}
		
		if(select < answer)
			System.out.println(select);
		else
			System.out.println(answer);
	}
}
