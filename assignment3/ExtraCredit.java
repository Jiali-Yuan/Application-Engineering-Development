class ExtraCredit {
	public static void main(String[] args) {
		String test = " the   sky   is blue ";
		System.out.println(reverse(test));
	}
	
	public static String reverse(String s) {
		String[] str = s.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = str.length - 1; i >= 0; i--) {
			sb.append(str[i]).append(" ");
		}
		return sb.toString();
	}
}