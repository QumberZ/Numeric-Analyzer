package edu.cuny.csi.csc330.lab2;

import java.util.Arrays;
//import static java.lang.Math.min;
import java.lang.Math;

public class NumericAnalyzer {

	private String[] args;

	public NumericAnalyzer(String[] args) {
		this.args = args;
	}

	public void displayArgs() {
		for (int i = 0; i < args.length; i++) {
			System.out.printf("%s   ", args[i]);

		}
		return;

	}

	public void sortedAscendingly() {
		Arrays.sort(args);
		System.out.printf("\nSorted args ascendingly : %s", Arrays.toString(args));

	}

	public void sizeOfList() {
		for (int i = 0; i < args.length; i++) {
		}
		System.out.printf("\nCount:                                          ", args.length);
		System.out.println(args.length);
	}

	public int minVal() {
//		int vals = 0;
//		int min = 0;
//		int num = 0;
//		for(int i = 0; i < args.length; i++) {
//			min = Integer.parseInt(args[0]);
//			while(vals < i) {
//				num = Integer.parseInt(args[vals]);
//				if(min > num)
//					min = num;
//			}
		System.out.println("Min:                                            " + args[0]);

		return 0;
	}

	public int maxVal() {

		System.out.println("Max:                                            " + args[args.length - 1]);
		return 0;
	}

	public void Sum() {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}

		System.out.println("Sum:                                           " + sum);

	}

	public void Range() {

		int max = Integer.valueOf(args[args.length - 1]);

		int min = Integer.valueOf(args[0]);

		int range = max - min;

		System.out.println("Range:                                          " + range);

	}

	public void meanVal() {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		int mean = sum / args.length;
		System.out.println("Mean:                                           " + mean);
	}

//	private int Median() {
//		for(int i = 0; i < args.length; i++ ) {
//		if (args.length % 2 == 1) {
//			return args[args.length / 2];
//		}
//		}

//		int median = Integer.valueOf(args.length);
//	
//		int n = 0;
//		
//			if(median % 2 == 1) {
//			median = args[ / 2];
//			
//		}
//			System.out.println("\nMedian: " + median);

	public void Variance() {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		int mean = sum / args.length;
		for (int i = 0; i < args.length; i++) {
			int variance = Integer.parseInt(args[i]);
			sum += Math.pow(variance - mean, 2);
		}
		System.out.println("Variance:                                      " + sum);
	}

	public void standardDeviation() {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		int mean = sum / args.length;
		for (int i = 0; i < args.length; i++) {
			int variance = Integer.parseInt(args[i]);
			sum += Math.pow(variance - mean, 2);
		}

		int deviation = (int) Math.sqrt(sum);
		System.out.println("Standard Deviation:                             " + deviation);

	}

	public static void main(String[] args) {

		if (args.length == 0) {
			System.err.println("Pass in 1 or more positive integer number values.");
			System.exit(1);
		}

		NumericAnalyzer cmlArgs = new NumericAnalyzer(args);

		cmlArgs.displayArgs();
		cmlArgs.sortedAscendingly();
		cmlArgs.sizeOfList();
		cmlArgs.minVal();
		cmlArgs.maxVal();
		cmlArgs.Range();
		cmlArgs.Sum();
		cmlArgs.meanVal();
		// cmlArgs.Median();
		cmlArgs.Variance();
		cmlArgs.standardDeviation();

	}

}
