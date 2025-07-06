package test;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public boolean duplicateNumber(int []nums) {
		
		Set<Integer> s1 = new HashSet<>();
		for (int i : nums) {
			if (s1.contains(i)) {
				return true;
			}
			s1.add(i);
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		ContainsDuplicate c = new ContainsDuplicate();
		System.out.println(c.duplicateNumber(nums));
	}

}
