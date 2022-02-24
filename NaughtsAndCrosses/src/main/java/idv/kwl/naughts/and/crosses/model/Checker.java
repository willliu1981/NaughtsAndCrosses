package idv.kwl.naughts.and.crosses.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Checker {
	private static Checker instance;
	private List<Mark> marks;
	
	private Map<Point ,Mark> markMap; 
	
	private Checker() {
		marks = new ArrayList<>();
		for (int x = 0; x <= 2; x++) {
			for (int y = 0; y <= 2; y++) {
				marks.add(new NA(x, y));
			}
		}
	}

	public static Checker getInstance() {
		instance = new Checker();

		return instance;
	}
	
	public void setMark(Mark mark) {
		//this.marks.stream().filter(null)
	}
}
