package StratgyPatternPractice;

import StratgyPatternPractice.attack.TaekwonVAttack;
import StratgyPatternPractice.move.TaekwonVMove;

public class TaekwonV extends Robot {
	public TaekwonV(String name) {
		super(name);
		
		TaekwonVAttack taekwonVAttack = new TaekwonVAttack();
		TaekwonVMove taekwonVMove = new TaekwonVMove();
		
		setRobotAttack(taekwonVAttack);
		setRobotMove(taekwonVMove);
	}
}