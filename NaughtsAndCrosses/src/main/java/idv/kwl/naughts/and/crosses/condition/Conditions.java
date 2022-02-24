package idv.kwl.naughts.and.crosses.condition;

import java.util.Map;

import idv.kwl.naughts.and.crosses.model.Mark;
import idv.kwl.naughts.and.crosses.model.Point;

public class Conditions {

	public static boolean equals(Map<Point, Mark> map, int x, int y, Mark target) {

		return map.get(new Point(x, y)).equals(target);
	}
}
