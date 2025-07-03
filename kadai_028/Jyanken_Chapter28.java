package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
	    //Scannerクラスのオブジェクトを生成する
	    Scanner scanner = new Scanner(System.in);
	    String input = "" ;
	    do {
		    input = scanner.next();
		    if(input.equals("r") || input.equals("s") || input.equals("p")) {
		    	break;
		    }
	    	System.out.println("じゃんけんの手を入力してください");
		}while(!(input.equals("r")) || !(input.equals("s")) || (input.equals("p")));
	    scanner.close();
			
	 return input;
		
	}
	public String getRandom() {
		String[] handSign = {"r","s","p"};
		return handSign[(int)(Math.floor(Math.random() * 3))];
	}
	
	public void playGame(String myHandSign,String partnerHandSign) {
		HashMap<String,String> handSign = new HashMap<String,String>();
		handSign.put("r","グー");
		handSign.put("s","チョキ");
		handSign.put("p","パー");
		System.out.println("自分の手は" + handSign.get(myHandSign) + "、対戦相手の手は" + handSign.get(partnerHandSign));;
		switch(myHandSign) {
			case "r" -> {
				if(partnerHandSign.equals("r")) {
					System.out.println("あいこです");
					
				} else if(partnerHandSign.equals("s")) {
					System.out.println("自分の勝ちです");
				}else if(partnerHandSign.equals("p")){
					System.out.println("自分の負けです");
				}
			}
			
			case "s" -> {
				if(partnerHandSign.equals("r")) {
					System.out.println("自分の負けです");
					
				} else if(partnerHandSign.equals("s")) {
					System.out.println("あいこです");
				}else if(partnerHandSign.equals("p")){
					System.out.println("自分の勝ちです");
				}	
			}
			
			case "p"-> {
				if(partnerHandSign.equals("r")) {
					System.out.println("自分の勝ちです");
					
				} else if(partnerHandSign.equals("s")) {
					System.out.println("自分の負けです");
				}else if(partnerHandSign.equals("p")){
					System.out.println("あいこです");
				}	
				
			}
		}
		
		
		
	}
}
