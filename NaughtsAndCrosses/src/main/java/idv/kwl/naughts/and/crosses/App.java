package idv.kwl.naughts.and.crosses;

import java.util.HashSet;
import java.util.Set;

import idv.kwl.naughts.and.crosses.model.Checker;
import idv.kwl.naughts.and.crosses.model.Mark;
import idv.kwl.naughts.and.crosses.model.MarkO;
import idv.kwl.naughts.and.crosses.model.MarkX;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Checker checker = Checker.getInstance();
		System.out.println(checker);
		MarkX mx = new MarkX(1, 1);
		checker.setMark(mx);
		System.out.println(checker);

		MarkO mo = new MarkO(1, 1);
		checker.setMark(mo);
		System.out.println(checker);

	}
}
