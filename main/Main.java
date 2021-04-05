package main;

import observer_pattern_practice.observer.DataSheetView;
import observer_pattern_practice.observer.MinMaxView;
import observer_pattern_practice.subject.ScoreRecord;

public class Main {

	private ScoreRecord scoreRecord = new ScoreRecord();
	
	public int main() {
		
		DataSheetView dataSheet = new DataSheetView(scoreRecord,3);
		MinMaxView minMax = new MinMaxView(scoreRecord);
		
		scoreRecord.attach(dataSheet);
		scoreRecord.attach(minMax);
		
		scoreRecord.addScore(10);
		scoreRecord.addScore(20);
		scoreRecord.addScore(30);
		scoreRecord.addScore(50);
		scoreRecord.addScore(100);
		scoreRecord.addScore(0);
		
		return 0;
	}
}
