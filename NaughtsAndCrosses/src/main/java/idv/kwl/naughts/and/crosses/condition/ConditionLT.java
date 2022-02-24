package idv.kwl.naughts.and.crosses.condition;

import java.util.Map;

import idv.kwl.naughts.and.crosses.model.Mark;
import idv.kwl.naughts.and.crosses.model.NA;
import idv.kwl.naughts.and.crosses.model.Point;

public class ConditionLT implements Condition {

	@Override
	public boolean check(Map<Point, Mark> map) {
		Mark compared = map.get(new Point(0, 0));

		if (compared.equals(NA.class)) {
			return false;
		}

		if (Conditions.equals(map, compared, 1, 0, 2, 0)) {
			return true;
		}

		if (Conditions.equals(map, compared, 0, 1, 0, 2)) {
			return true;
		}

		return false;
	}

}
