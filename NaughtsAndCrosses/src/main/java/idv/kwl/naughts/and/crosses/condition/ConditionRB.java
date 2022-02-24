package idv.kwl.naughts.and.crosses.condition;

import java.util.Map;

import idv.kwl.naughts.and.crosses.model.Mark;
import idv.kwl.naughts.and.crosses.model.NA;
import idv.kwl.naughts.and.crosses.model.Point;

public class ConditionRB implements Condition {

	@Override
	public boolean check(Map<Point, Mark> map) {
		Mark compared = map.get(new Point(2, 2));

		if (compared.equals(NA.class)) {
			return false;
		}

		if (Conditions.equals(map, compared, 2, 0, 2, 1)) {
			return true;
		}

		if (Conditions.equals(map, compared, 0, 2, 1, 2)) {
			return true;
		}

		return false;
	}

}
