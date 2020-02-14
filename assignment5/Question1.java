/*Giving a string, find the first non-repeating 
character in it and return its index
For example, "leetcode", return 0*/

import java.util.HashMap;

class Question1 {
	public static void main(String[] args) {
		String test = "leetcode";
		System.out.println(firstNonRep(test));
	}
	public static int firstNonRep(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
		}
		for (int i = 0; i < str.length(); i++) {
			if (hm.get(str.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}