package PrototypePattern;

public interface IMonster {
	public IMonster clone();
	public void attack(Monster foe);
}
