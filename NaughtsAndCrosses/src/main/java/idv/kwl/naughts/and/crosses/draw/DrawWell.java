package idv.kwl.naughts.and.crosses.draw;

import java.util.Map;

import idv.kwl.naughts.and.crosses.model.Mark;
import idv.kwl.naughts.and.crosses.model.Point;

public class DrawWell {

	public static void drawWell(Map<Point, Mark> map) {

		System.out.printf(" %s │ %s │ %s\n", map.get(new Point(0, 0)),
				map.get(new Point(1, 0)), map.get(new Point(2, 0)));
		System.out.println("———┼———┼———");

		System.out.printf(" %s │ %s │ %s\n", map.get(new Point(0, 1)),
				map.get(new Point(1, 1)), map.get(new Point(2, 1)));
		System.out.println("———┼———┼———");

		System.out.printf(" %s │ %s │ %s\n", map.get(new Point(0, 2)),
				map.get(new Point(1, 2)), map.get(new Point(2, 2)));

	}
}
