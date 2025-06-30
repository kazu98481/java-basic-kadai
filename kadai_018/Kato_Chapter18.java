package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName = "加藤";	//姓
	public String givenName = "";	//名
	public String address = "住所は東京都中野区●×です";		//住所
	
	public void commonIntroduce() {
		System.out.println(address);
	}
	
	abstract public void eachIntroduce();
	
	public void execlntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		commonIntroduce();
		eachIntroduce();
		System.out.println("");
		
	}
	
}
