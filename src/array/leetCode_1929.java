package array;

public class leetCode_1929 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1 };

		int[] answer = getConcatenation(nums);
		
		System.out.println(answer);
	}

	public static int[] getConcatenation(int[] nums) {
		int[] answer = new int[nums.length * 2];
		for (int i = 0; i < nums.length; i++) {
			answer[i] = answer[i + nums.length] = nums[i];
		}

		return answer;
	}

}
