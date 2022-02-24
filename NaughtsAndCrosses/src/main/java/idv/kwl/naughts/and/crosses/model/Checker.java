package idv.kwl.naughts.and.crosses.model;

import java.util.HashMap;
import java.util.Map;

public class Checker {
	private static Checker instance;

	private Map<Point, Mark> markMap;

	private Checker() {

		markMap = new HashMap<>();
		for (int x = 0; x <= 2; x++) {
			for (int y = 0; y <= 2; y++) {
				Point point = new Point(x, y);
				markMap.put(point, new NA(x, y));
			}
		}
	}

	public static Checker getInstance() {
		instance = new Checker();

		return instance;
	}

	public void setMark(Mark mark) {
		this.markMap.put(mark.getPoint(), mark);
	}

	@Override
	public String toString() {
		return "Checker [markMap=" + markMap + "]";
	}

}
