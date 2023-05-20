package com.string;

public class StringEx {
	public static void main(String[] args) {
		String s = "Sachin";
		String t = new String("Sachin");
		
		String sa = new String("Sachin");

//		System.out.println(s + 1);

//		System.out.println(s.equals(t));
//		System.out.println(s.hashCode());
//		System.out.println(t.hashCode());

		String str1 = "apple";
		String str2 = "banana";
		String str3 = "apple";

		// Compare str1 and str2
		int result1 = str1.compareTo(str2);
		System.out.println(result1); // Output: -1

		// Compare str1 and str3
		int result2 = str1.compareTo(str3);
		System.out.println(result2); // Output: 0

		// Compare str2 and str1
		int result3 = str2.compareTo(str1);
		System.out.println(result3); // Output: 1

	}
}

