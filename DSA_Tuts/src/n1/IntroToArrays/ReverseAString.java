package n1.IntroToArrays;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "raj";
		String res = reverse(str);
		System.out.println(res);
		
	}
	
	static String reverse(String str) {
		
		char[] chars = str.toCharArray();
		int low = 0; int high = chars.length - 1;
		
		while(low < high) {
			swap(chars, low, high);
			low++; high--;
		}
		return new String(chars);
	}
	
	static void swap(char [] chars, int low, int high) {
		char a = chars[low];
		chars[low] = chars[high];
		chars[high] = a;
	}

}
