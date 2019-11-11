package com.revature.eval;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.lang.*;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		String s= "";
		
		
		if(string==" ") {
			s=" ";
			
		}
		if(string==null) {
			return null;
		}
		
		else {
			
		
 for(int i=string.length()-1;i>=0;i--) {
	 s+=string.charAt(i);
	 
	 
 }
 
		}
	return s;

		}
	
	
		
	
	
	

	
	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	
	
	public String acronym(String phrase) {
	
		
		if(phrase==null) {
			return null;
		}
		
		
		String [] splitString= phrase.split("\\s*(=>|,|=>|-|\\s)\\s*");
		
		String [] upperCased= new String[splitString.length];
		StringBuffer sb= new StringBuffer();
		String acronym=" ";
		
	if(phrase.isEmpty()) {
		
		return acronym;
	}
	
	if(phrase!=null) {
	
	
			
	
		for(int i=0;i<splitString.length;i++) {
			upperCased[i]=splitString[i].toUpperCase();
		}
		
	//	for(int i=0;i<fixedSplitStringtoUpperCase.length;i++) {
			
		//	acronym+=fixedSplitStringtoUpperCase[i].charAt(0);
		
			for(int i=0;i<upperCased.length;i++) {
				
				sb.append(upperCased[i].charAt(0));
			}
		
		
		
		
	//	}
		acronym= sb.toString();
		
		
		return acronym;
		
	}
	
	else {
		return null;
	}
	
	
	
	
	
	
	
	
		}
		
	
		
	

	
	/**
	 * 3. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
	int count=0;
	
	String string1= string.toUpperCase();
	
	for(int i=0;i<string1.length();i++) {
		
		if((string1.charAt(i)=='A') ||(string1.charAt(i)=='E') || (string1.charAt(i)=='I') || (string1.charAt(i)=='O') || (string1.charAt(i)=='L') || (string1.charAt(i)=='N') || (string1.charAt(i)=='R') || (string1.charAt(i)=='S') || (string1.charAt(i)=='T') || (string1.charAt(i)=='U')) {
			
			count+=1;
			
		}
		
		else if((string1.charAt(i)=='D') || (string1.charAt(i)=='G')){
			count+=2;
		}
		
		
				
		
if((string1.charAt(i)=='B') || (string1.charAt(i)=='C') || (string1.charAt(i)=='M') || (string1.charAt(i)=='P')) {
			
			count+=3;
		}
		
		else if(string1.charAt(i)=='F' || string1.charAt(i)=='H' || string1.charAt(i)=='V'|| string1.charAt(i)=='W'|| string1.charAt(i)=='Y'){
			
			count+=4;	
		}	
		
		else if(string1.charAt(i)=='K') {
			
			count+=5;
			
		}
	else if((string1.charAt(i)=='J') || (string1.charAt(i)=='X')) {
			
			count+=8;
			
		}
	else if((string1.charAt(i)=='Q') || (string1.charAt(i)=='Z')) {
		
		count+=10;
		
	}
		
		
		
		
		
		
		
	}
		
		
		
		
		
		return count;
	}
	
	
	/**
	 * 4. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return 
	 */
	public Map<String, Integer> wordCount(String string) {
		
		String [] wordsinString =string.split("\\s*(=>|,|\\s)\\s*");
		
		
		LinkedHashMap<String, Integer> wordCount= new LinkedHashMap<String, Integer>();
		int count=0;
		for(int i=0;i<wordsinString.length;i++) {
			for(int j=0;j<wordsinString.length;j++) {
				
				if(wordsinString[i].equals(wordsinString[j])) {
					count++;
					
				}
				
			}
		wordCount.put(wordsinString[i],count);
		
		count=0;
		
		}
		
		return wordCount;
		
		
		
		
		
		
		
	}
	
	/**
	 * 5. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			
			
			
	
		
	return 0;
		
	
		
		
		
	
		
			
			
			
		
			
	

		
		
			
			
			
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		
			int x= sortedList.size()/2;
			
			
			
			
		
			
			
			
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	
}
