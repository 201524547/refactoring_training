package StratgyPatternPractice;

import StratgyPatternPractice.attack.AtomAttack;
import StratgyPatternPractice.move.AtomMove;

public class Atom extends Robot {
	public Atom(String name) {
		super(name);

		AtomAttack atomAttack = new AtomAttack();
		AtomMove atomMove = new AtomMove();
		setRobotAttack(atomAttack);
		setRobotMove(atomMove);
	}

}