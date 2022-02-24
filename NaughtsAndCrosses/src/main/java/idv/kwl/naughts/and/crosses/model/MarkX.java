package idv.kwl.naughts.and.crosses.model;

public class MarkX extends Mark {

	public MarkX(int x, int y) {
		super(x, y);
	}

	public MarkX(Point point) {
		super(point);
	}

	@Override
	public String toString() {
		return "X";
	}
}
