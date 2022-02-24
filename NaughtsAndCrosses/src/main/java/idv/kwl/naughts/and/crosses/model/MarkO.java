package idv.kwl.naughts.and.crosses.model;

public class MarkO extends Mark {

	public MarkO(int x, int y) {
		super(x, y);
	}

	public MarkO(Point point) {
		super(point);
	}

	@Override
	public String toString() {
		return "O";
	}
}
