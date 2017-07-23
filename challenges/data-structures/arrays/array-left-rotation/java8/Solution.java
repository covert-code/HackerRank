import java.io.*;
import java.util.*;

/**
* @author Allen Jiang
* Solution class for HackerRank
*/

public class Solution {

	/*
	Problem:
	You are given 2 numbers: n and d
	Then you are given an array of numbers of length n, into stdin.
	Rotate them by d to the left and then print them. Example:
	[1 2 3 4] rotate 1 -> [4 1 2 3]
	*/

	// Read input scanner from system.in
	private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Read the array size and distance to rotate
        int len = in.nextInt();
        int dist = in.nextInt();
        // Read the array
        int[] data = readArrayRotate(len, dist);
        // Output
        System.out.println(intArrayToString(data));
    }

    /** Reads an int array from stdin, and rotates it.
    * @param len The length of the array
    * @param dist The distance to rotate
    * @returns The array of integers read.
    */
    private static int[] readArrayRotate(int len, int dist) {
    	int[] data = new int[len];
    	for (int i = 0; i < len; i++) {
    		// Start reading digits, write them in their post-rotation positions
    		// The position is (i - dist) % len; extra +len is antinegative buffer
    		data[(i + len - dist) % len] = in.nextInt();
    	}
    	return data;
    }

    /** Converts an int array into a space-separated string.
    * @param input An array of integers
    * @returns A String containing the ints in input, separated by spaces.
    */
    private static String intArrayToString(int[] input) {
    	String output = "";
        for (int i = 0; i < input.length; i++) {
            // Add space before all but the first one
            if (i > 0) {
                output += " ";
            }
            // Add the next integer
            output += input[i];
        }
        return output;
    }
}