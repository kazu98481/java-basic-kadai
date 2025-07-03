package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		
		ArrayList<String>words = new ArrayList<String>();
		words.add("apple");
		words.add("banana");
		words.add("grape");
		words.add("orange");
		
		dic.serchWord(words);

	}

}
