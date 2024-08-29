package PrototypePattern;

public class Driver {

	public static void main(String[] args) {
		Orc orc1 = new Orc(100,10,5);
		Dragon drag1 = new Dragon(200,20,10);
		IMonster orc_prototype = orc1.clone();
		IMonster drag_prototype = drag1.clone();
		
		System.out.println(orc_prototype);
		System.out.println(drag_prototype);
	}

}
