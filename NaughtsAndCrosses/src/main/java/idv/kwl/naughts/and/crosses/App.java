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
		MarkX mx = new MarkX(0, 0);
		MarkX mx2 = new MarkX(0, 1);
		MarkX mx3 = new MarkX(0, 2);
		checker.setMark(mx);
		checker.setMark(mx2);
		checker.setMark(mx3);
		System.out.println(checker.check());
		
		System.out.println(mx.equals(MarkO.class));

	}
}
