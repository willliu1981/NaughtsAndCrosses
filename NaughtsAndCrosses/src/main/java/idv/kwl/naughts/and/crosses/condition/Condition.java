package idv.kwl.naughts.and.crosses.condition;

import java.util.Map;

import idv.kwl.naughts.and.crosses.model.Mark;
import idv.kwl.naughts.and.crosses.model.Point;

public interface Condition {

	boolean check(Map<Point,Mark> map);
}
