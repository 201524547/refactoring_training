package observer_pattern_practice.subject;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends RecordSubject{
	private List<Integer> scores = new ArrayList<Integer>(); 

	public List<Integer> getScoreRecord() {
		return scores;
	}
	public void addScore(int score) { 
		scores.add(score); 
		_notify();
	}

}
