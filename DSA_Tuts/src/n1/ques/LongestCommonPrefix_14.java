package n1.ques;

public class LongestCommonPrefix_14 {
	
/*	Write a function to find the longest common prefix string amongst an array of strings.
	If there is no common prefix, return an empty string "".
			
Example 1:			Input: strs = ["flower","flow","flight"] Output: "fl"
				
Example 2:			Input: strs = ["dog","racecar","car"] Output: ""
					Explanation: There is no common prefix among the input strings. */

	public static void main(String[] args) {
		
		String [] strs = {"flower","flight","flow"};
		System.out.println(LongestPrefix(strs));
		System.out.println(LongestCommonPrefix_HorizontalScanning(strs));
	}
	
	static String LongestPrefix(String [] str) { //Bruteforce
	/*	⏱ Time Complexity: Worst case: O(N * M)
			where N = number of strings, M = length of shortest string.
		🔧 Space: O(1) */
		if(str == null || str.length == 0) return "";
		
		for(int i = 0; i < str[0].length() ; i++ ) {
			char c = str[0].charAt(i);
			for(int j = 1 ; j < str.length ; j++) {
				if(i >= str[j].length() || c != str[j].charAt(i)) {
					return str[i].substring(0,i);
				}
			}
		}
		return str[0];
	}
	
	static String LongestCommonPrefix_HorizontalScanning(String [] strs) {
	/*	⏱ Time: O(N * M) Efficient if common prefix shrinks fast.
		🔧 Space: O(1) */
		if(strs == null || strs.length == 0) return "";
		
		String prefix = strs[0];
		for( int i = 1; i < strs.length ; i++) {
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0 , prefix.length() - 1);
				if(prefix.isEmpty())  return "";
			}
		}
		return prefix;
	}
	
	static String LongestCommonPrefix_VerticalScanning(String [] strs) {
		
		return null;
	}

}
