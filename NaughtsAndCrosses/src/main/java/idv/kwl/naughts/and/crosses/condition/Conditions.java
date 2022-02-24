package idv.kwl.naughts.and.crosses.condition;

import java.util.Map;

import idv.kwl.naughts.and.crosses.model.Mark;
import idv.kwl.naughts.and.crosses.model.Point;

public class Conditions {

	public static boolean equals(Map<Point, Mark> map, int x, int y,
			Mark target) {

		return map.get(new Point(x, y)).equals(target);
	}

	public static boolean equals(Map<Point, Mark> map, Mark target, int x1,
			int y1, int x2, int y2) {

		return equals(map,x1,y1,target) &&  equals(map,x2,y2,target);
	}
}
