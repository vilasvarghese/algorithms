package com.forcollege;

import java.util.ArrayList;

//Special number which is divisible by 1 and itself with in the range.

public class CountNumberDivisibleBy {
	public static void main(String[] args) {
		CountNumberDivisibleBy c = new CountNumberDivisibleBy();
		ArrayList<Integer> arrayList = c.numberDivisibleBy(0, 11);
		for (Integer i : arrayList) {
			System.out.println(i);
		}
	}
		
	public ArrayList<Integer> numberDivisibleBy(int from, int to){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(to-from);
		boolean flag = false;
		if (from <= 1 && to >= 2) {
			arrayList.add(2);
		}
		for(int i = from; i <= to; i++)
        {
            for( int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
                else
                {
                    flag = true;
                }
            }
            if(flag == true)
            {
                //System.out.println(i);
                arrayList.add(i);
            }
        }
		return arrayList;
   }
}

