package idv.kwl.naughts.and.crosses.condition;

import java.util.Map;

import idv.kwl.naughts.and.crosses.model.Mark;
import idv.kwl.naughts.and.crosses.model.NA;
import idv.kwl.naughts.and.crosses.model.Point;

public class ConditionCent implements Condition {

	@Override
	public boolean check(Map<Point, Mark> map) {
		Mark cent = map.get(new Point(1, 1));

		if (cent.equals(NA.class)) {
			return false;
		}

		if (Conditions.equals(map, 0, 0, cent)
				&& Conditions.equals(map, 2, 2, cent)) {
			return true;
		}

		if (Conditions.equals(map, 1, 0, cent)
				&& Conditions.equals(map, 1, 2, cent)) {
			return true;
		}

		if (Conditions.equals(map, 2, 0, cent)
				&& Conditions.equals(map, 0, 2, cent)) {
			return true;
		}

		return false;
	}

}
