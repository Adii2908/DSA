package n3.CarryForward.SubArrays;

public class ReturnCountOfPairs {
	
	//Given string s of lowercase chars, return count of pairs(i,j)
	// i < j && s[i]='a' && s[j] = 'g'

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abegag";
		System.out.println(countPairs(s));
		
		String s1 = "abegag";
		System.out.println(countPairs1(s1));
	}
	
	static int countPairs(String s) { // BruteForce
		int count = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == 'a') {
				for(int j = i + 1 ; j < s.length(); j++) {
					if(s.charAt(j) == 'g') {
						count++;
					}
				}
			}
		}
		System.out.println("Bruteforce -> T.C - O(N^2) && S.C - O(1)");
		return count;
	}
	
	static int countPairs1(String s) { //Approach1
		int countA = 0;
		int totalPairs = 0;
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == 'a') {
				countA++;
			}
			if(s.charAt(i) == 'g') {
				totalPairs += countA;
			}
		}
		return totalPairs;
	}

}
