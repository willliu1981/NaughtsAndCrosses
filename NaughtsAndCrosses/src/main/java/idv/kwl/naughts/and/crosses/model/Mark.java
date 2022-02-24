package idv.kwl.naughts.and.crosses.model;

public abstract class Mark {
	private Point point;

	public Mark(int x, int y) {
		this.point = new Point(x, y);
	}

	public Mark(Point point) {
		this.point = point;
	}

	public Point getPoint() {
		return point;
	}

	@Override
	public int hashCode() {
		int prime = 31;
		int res = 1;
		res = prime * res + this.getClass().hashCode();

		return res;
	}

	public boolean equals(Class clazz) {

		return this.getClass() == clazz;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		return this.getClass() == obj.getClass();

		/*
		if (this.getClass() != obj.getClass()) {
		return false;
		}
		
		Mark other = (Mark) obj;
		
		return this.point.getX() == other.point.getX() && this.point.getY() == other.point.getY();
		//*/
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [point=" + point + "]";
	}

}
