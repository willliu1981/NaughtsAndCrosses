package idv.kwl.naughts.and.crosses.model;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		int prime = 31;
		int res = 1;
		res = prime * res + this.getX();
		res = prime * res + this.getY();

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

		if (!(obj instanceof Point)) {
			return false;
		}

		Point other = (Point) obj;

		return this.getX() == other.getX() && this.getY() == other.getY();

	}

}
