package observer_pattern_practice.subject;

import java.util.ArrayList;
import java.util.List;

import observer_pattern_practice.observer.DataSheetView;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>(); 
	private DataSheetView dataSheetView; 

	public void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetView = dataSheetView;
	}

	public void addScore(int score) { 
		scores.add(score); 
		dataSheetView.update(); 
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}
