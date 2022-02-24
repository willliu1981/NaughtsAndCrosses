package idv.kwl.naughts.and.crosses.model;

public abstract class Mark {
	private Point point;

	public Mark(int x, int y) {
		this.point = new Point(x, y);
	}

	@Override
	public int hashCode() {
		int prime = 31;
		int res = 1;
		res = prime * res + this.point.getX();
		res = prime * res + this.point.getY();

		return res;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

//		if (this.getClass() != obj.getClass()) {
//			return false;
//		}

		if (!(obj instanceof Mark)) {
			return false;
		}

		Mark other = (Mark) obj;

		return this.point.getX() == other.point.getX() && this.point.getY() == other.point.getY();

	}

}
