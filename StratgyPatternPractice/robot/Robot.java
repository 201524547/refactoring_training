package StratgyPatternPractice;

import StratgyPatternPractice.attack.RobotAttack;
import StratgyPatternPractice.move.RobotMove;

public abstract class Robot {
	private String name;
	private RobotAttack robotAttack;
	private RobotMove robotMove;

	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRobotAttack(RobotAttack robotAttack) {
		this.robotAttack = robotAttack;
	}

	public void setRobotMove(RobotMove robotMove) {
		this.robotMove = robotMove;
	}
	public void attack() {
		robotAttack.attack();
	}
	public void move() {
		robotMove.move();
	}


}
