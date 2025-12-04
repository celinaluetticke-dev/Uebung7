package h2;

import java.util.Arrays;

public class H2_main {

	public static int[] change(int[] a, int[] b, int start, int end) {

	    if (end <= start) {
	        return new int[0];
	    }

	    if (Arrays.compare(a, b) != 0) {
	        return Arrays.copyOfRange(a, 0, a.length);
	    }

	    Arrays.sort(a);
	    return Arrays.copyOfRange(a, start, end);
	}

	public static void main(String[] args) {

		int[] a = {2, 7, 1, 9};
		int[] b = {2, 7, 1, 9};

		int start = 3;
		int end = 2;

		int[] result = change(a, b, start, end);

		System.out.println("Array a: " + Arrays.toString(a));
		System.out.println("Array b: " + Arrays.toString(b));
		System.out.println("Start: " + start);
		System.out.println("Ende: " + end);
		System.out.println("Ergebnis: " + Arrays.toString(result));
	}
}