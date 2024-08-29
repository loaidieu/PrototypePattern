package PrototypePattern;

public class Dragon extends Monster{

	public Dragon(int hp, int atk, int def) {
		super(hp, atk, def);
	}

	@Override
	public IMonster clone() {
		// TODO Auto-generated method stub
		return new Dragon(this.getHp(), this.getAtk(), this.getDef());
	}

}
