package com.anees.squarnumbers;

public class SquareNumbers {

	public static void main(String[] args) {
		SquareAllNumbers obj  = new SquareAllNumbers();
		int[] n = {2,3,4,-5,-6,14};
		System.out.println(obj.squareDigits(n));
		System.out.println(obj.LowestNumber(n));
		}

}
