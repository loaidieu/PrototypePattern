package PrototypePattern;

public abstract class Monster implements IMonster{
	private int health;
	private int attack;
	private int defend;
	
	public Monster(int hp, int atk, int def) {
		this.health = hp;
		this.attack = atk;
		this.defend = def;
	}
	
	public int getHp() {
		return this.health;
	}
	public int getAtk()
	{
		return this.attack;
	}
	public int getDef()
	{
		return this.defend;
	}
	
	public void setHp(int hp) {
		this.health = hp;
	}
	
	public abstract IMonster clone();
	
	public void attack(Monster foe) {
		foe.setHp(foe.getHp() - this.getAtk());
	}
	
	public String toString()
	{
		return "HP: " + this.health + ", Atk: " + this.attack + ", Defend: " + this.defend;
	}
}
