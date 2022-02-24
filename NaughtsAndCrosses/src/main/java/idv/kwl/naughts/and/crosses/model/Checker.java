package idv.kwl.naughts.and.crosses.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import idv.kwl.naughts.and.crosses.condition.Condition;
import idv.kwl.naughts.and.crosses.condition.ConditionCent;
import idv.kwl.naughts.and.crosses.condition.ConditionLT;
import idv.kwl.naughts.and.crosses.condition.ConditionRB;
import idv.kwl.naughts.and.crosses.exception.SetErrorException;

public class Checker {
	private static Checker instance;

	private Map<Point, Mark> markMap;
	private List<Condition> conds;

	private Checker() {
		conds = new ArrayList<>();
		conds.add(new ConditionCent());
		conds.add(new ConditionLT());
		conds.add(new ConditionRB());

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
		if (this.markMap.get(mark.getPoint()) instanceof NA) {
			this.markMap.put(mark.getPoint(), mark);
		} else {
			throw new SetErrorException(mark.getClass().getSimpleName() + " set to "
					+ this.markMap.get(mark.getPoint()).getClass().getSimpleName());
		}
	}

	public boolean check() {
		return this.conds.stream().anyMatch(y -> y.check(markMap));
	}

	@Override
	public String toString() {
		return "Checker [markMap=" + markMap + "]";
	}

}
