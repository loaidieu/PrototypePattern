package PrototypePattern;

public class Driver {

	public static void main(String[] args) {
		Orc orc1 = new Orc(100,10,5);
		Dragon drag1 = new Dragon(200,20,10);
		IMonster orc_prototype = orc1.clone();
		IMonster drag_prototype = drag1.clone();
		
		System.out.println(orc_prototype);
		System.out.println(drag_prototype);
		System.out.println("after the first round's moves");
		System.out.println("Orc1 attack drag1");
		orc1.attack(drag1);
		System.out.println(orc1);
		System.out.println("drag1 attack orc1");
		drag1.attack(orc1);
		System.out.println(orc1);
		System.out.println(drag1);
	}

}
