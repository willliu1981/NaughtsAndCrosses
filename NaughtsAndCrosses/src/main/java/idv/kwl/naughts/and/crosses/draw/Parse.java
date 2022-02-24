package idv.kwl.naughts.and.crosses.draw;

import idv.kwl.naughts.and.crosses.exception.SetErrorException;
import idv.kwl.naughts.and.crosses.model.Point;

public class Parse {
	public static Point parse(int number) {
		switch (number) {
		case 1:
			return new Point(0, 0);
		case 2:
			return new Point(1, 0);
		case 3:
			return new Point(2, 0);
		case 4:
			return new Point(0, 1);
		case 5:
			return new Point(1, 1);
		case 6:
			return new Point(2, 1);
		case 7:
			return new Point(0, 2);
		case 8:
			return new Point(1, 2);
		case 9:
			return new Point(2, 2);
		default:
			throw new SetErrorException("parse error:" + number);
		}

	}
}
