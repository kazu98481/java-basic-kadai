package text.section_15;

public class Car_Chapter15 {

	private int gear = 1;
	private int speed = 10;
	
	public void gearChange(final int afterGear) {
		System.out.println("ギア" + this.gear +"からギア"+afterGear + "に切り替えました");
		this.gear = afterGear;
	}
	public void run() {

		 this.speed = switch(this.gear){
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
