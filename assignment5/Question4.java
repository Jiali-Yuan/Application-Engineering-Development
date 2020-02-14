/*Given a string s, find the longest palindromic substring
in s. You may assume that the maximum length of s is 1000
For example, input "babad" return "bab", "aba" is also a
valid answer, you only need to find one*/

class Question4 {
	public static void main(String[] args) {
		String test = "babad";
		System.out.println(palindromicSubstring(test));
	}
	
	public static String palindromicSubstring(String s) {
		if (s == null) return "";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			String s1 = longest(s, i, i);
			result = s1.length() > result.length() ? s1 : result;
			String s2 = longest(s, i, i + 1);
			result = s2.length() > result.length() ? s2 : result;
		}
		return result;
	}
	
	public static String longest(String s, int left, int right) {
		if (left > right) return "";
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}
}