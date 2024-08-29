package PrototypePattern;

public class Orc extends Monster{

	public Orc(int hp, int atk, int def) {
		super(hp, atk, def);
	}

	@Override
	public IMonster clone() {
		return new Orc(this.getHp(), this.getAtk(), this.getDef());
	}

}
