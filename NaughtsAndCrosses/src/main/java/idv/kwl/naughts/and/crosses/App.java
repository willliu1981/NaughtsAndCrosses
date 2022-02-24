package idv.kwl.naughts.and.crosses;

import java.util.HashSet;
import java.util.Set;

import idv.kwl.naughts.and.crosses.model.Mark;
import idv.kwl.naughts.and.crosses.model.MarkX;
import idv.kwl.naughts.and.crosses.model.NA;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		NA na = new NA(1, 1);
		MarkX mx = new MarkX(1, 1);
		MarkX mx2 = new MarkX(1, 1);

		System.out.println(na.getClass());
		System.out.println(mx.getClass());
		System.out.println(na.equals(mx));
		System.out.println(mx2.equals(mx));
		
		Set<Mark> sets=new HashSet<>();
		sets.add(na);
		sets.add(mx);
		
		System.out.println(sets);

	}
}
