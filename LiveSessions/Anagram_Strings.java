package module1;
  //Angarm grouping :

import java.util.Arrays;
import java.util.Comparator;
 
public class Anagram_Strings {
	static class Anagram_Word{
		String str;
		int index;
		Anagram_Word(String str1, int index1){
			str = str1;
			index = index1;
		}
	}
	static class Anagram_Duplicate{
		Anagram_Word[] array;
		int size;
		Anagram_Duplicate(String str1[], int size1){
		size = size1;
		array = new Anagram_Word[size];
		for (int i =0 ; i< size; ++i){
			array[i] = new Anagram_Word(str1[i],i);
		}
		}
	}
	static class compareTheStrings implements Comparator<Anagram_Word>{
		public int compare(Anagram_Word a, Anagram_Word b){
			return a.str.compareTo(b.str);
		}		
	}
	static void group(String wordArr[], int size)
	{
		Anagram_Duplicate dupArray = new Anagram_Duplicate(wordArr,size);
		for(int i=0; i<size; i++)
		{
			char[] char_arr = dupArray.array[i].str.toCharArray();
			Arrays.sort(char_arr); 
			dupArray.array[i].str = new String(char_arr);
		}
		Arrays.sort(dupArray.array, new compareTheStrings());
		for(int i=0;i<size; i++)
		{
			System.out.println(wordArr[dupArray.array[i].index] + " ");
		}
	}
 
	public static void main(String[] args) {
		String wordArr[] = {"eat", "tea", "tan", "ate","nat","bat"};
		int size = wordArr.length;
		group(wordArr, size); 
	}
 
}
