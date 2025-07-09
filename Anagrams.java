package test;

import java.util.Arrays;

public class Anagrams {

	public static boolean isAnagram(String s , String s1) {
		
		if (s1.length()!=s.length()) {
			return false;
		}
		
		char[] a = s.toCharArray();
		char[] b = s1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a, b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "silent";
		String s1 = "listen";
		
		System.out.println(isAnagram(s, s1));
		
	}

}

