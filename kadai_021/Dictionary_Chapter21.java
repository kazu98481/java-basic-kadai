package kadai_021;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> dic = new HashMap<String,String>();
	public Dictionary_Chapter21() {
		dic.put("apple","りんご");
		dic.put("peach","桃");
		dic.put("banana","バナナ");
		dic.put("lemon","レモン");
		dic.put("pear","梨");
		dic.put("kiwi","キウィ");
		dic.put("strawberry","いちご");
		dic.put("grape","ぶどう");
		dic.put("muscat","マスカット");
		dic.put("cherry","さくらんぼ");

	}
	
	public void serchWord(ArrayList<String> serch_words) {
		for(int i=0;i < serch_words.size();i++) {
			if(dic.get(serch_words.get(i)) == null) {
				System.out.println(serch_words.get(i) + "は辞書に存在しません");
			}
			else {
				System.out.println(serch_words.get(i) + "の意味は"+ dic.get(serch_words.get(i)));
			}
		}

	}
}
