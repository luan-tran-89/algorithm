package com.algo.lab4.sort.sortroutines;

import com.algo.lab4.sort.runtime.Sorter;

import java.util.Arrays;


/**
 * This is the slowest version of BubbleSort
 * No optimization for already sorted arrays.
 * Doesn't take into account the fact that
 * largest elements are pushed to the right.
 *
 */
public class BubbleSort2 extends Sorter {
	
	int[] arr;
	public int[] sort(int[] array){
		this.arr = array;
		bubbleSort();
		return arr;
		
	}
	private void bubbleSort(){
		int n = arr.length;                     // 2
		boolean isSwap = false;          // 1
		for(int i = 0; i < n - 1; i++) {            // n + 2
			for (int j = 0; j < n - i - 1; j++) {  // (n+2)*(n-1-i+2)
				if(arr[j] > arr[j+1]) {                // (n+2)*( n-1-i+2)*3
					swap(j, j+1);                     // (n+2)*(n-1-i+2)*2
					isSwap = true;                 // (n+2)*(n-1-i+2)
				}
			}
			if(!isSwap) break;                  // n+2
		}
	}
	
	int[] swap(int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
		
	}
	public static void main(String[] args){
		int[] test = {21,13,1,-22, 51, 5, 18};
		BubbleSort2 bs = new BubbleSort2();
		
		System.out.println(Arrays.toString(bs.sort(test)));
		
	}

}
