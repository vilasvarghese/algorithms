package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Alice and Bob are being awarded some coins
 * Based on whose coin has more value, they earn points
 * Find out who wins. Return Alice and Bob's points in an Array
 */

public class RaceForPoints {

	public static void main(String[] args) throws Exception{
		Integer[] bobPoints = {3, 5, 10};
		List<Integer> bobsPoints = Arrays.asList(bobPoints);
		
		Integer[] alicePoints = {4, 5, 6};
		List<Integer> alicesPoints = Arrays.asList(alicePoints);
		RaceForPoints r = new RaceForPoints();
		System.out.println(r.findWinner(bobsPoints , alicesPoints));
	}
	
	public List<Integer> findWinner(List<Integer> list1, List<Integer> list2) throws Exception{
		
		if (list1 == null || list2 == null) {
			throw new Exception ("list is null");
		}

		if (list1.size() != list2.size()) {
			throw new Exception("Size doesn't match");
		}
		
		int aliceMark = 0;
		int bobMark = 0;
		for (int i =0; i < list1.size(); i++) {//
			int alicePoint = list2.get(i);
			int bobPoint = list1.get(i);
			if (alicePoint > bobPoint) {
				aliceMark++;
			}else if (bobPoint > alicePoint){
				bobMark++;
			}
		}
		
		List<Integer> result = new ArrayList<Integer>();
		result.add(bobMark);
		result.add(aliceMark);
		return result;
	}
}
