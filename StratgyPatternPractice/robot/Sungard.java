package StratgyPatternPractice;

import StratgyPatternPractice.attack.TaekwonVAttack;
import StratgyPatternPractice.move.AtomMove;

public class Sungard extends Robot{
	public Sungard(String name) {
		super(name);
		TaekwonVAttack taekwonVAttack = new TaekwonVAttack();
		AtomMove atomMove = new AtomMove();
		
		setRobotAttack(taekwonVAttack);
		setRobotMove(atomMove);
	}
}
