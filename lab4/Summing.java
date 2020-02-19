package com.cg.iter.lab4;

public class Summing {

	public static int SummingCubes(int n) {
		int y = (n * (n + 1) / 2);

		return y * y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(SummingCubes(n));
	}

}
