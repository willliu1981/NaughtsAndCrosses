package idv.kwl.naughts.and.crosses;

import java.util.Scanner;

import idv.kwl.naughts.and.crosses.draw.DrawWell;
import idv.kwl.naughts.and.crosses.draw.Parse;
import idv.kwl.naughts.and.crosses.model.Checker;
import idv.kwl.naughts.and.crosses.model.MarkO;
import idv.kwl.naughts.and.crosses.model.MarkX;
import idv.kwl.naughts.and.crosses.model.Point;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Checker checker = Checker.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("place mark 'X' or 'O' in number 1 to 9,\n"
				+ "1 is (1,1) and 9 is(3,3)...etc\n"
				+ "\n\ngame start:\n");

		DrawWell.drawWell(checker.getMarks());
		while (true) {
			//set Xs...
			System.out.print("\nplace mark X: ");
			int in = sc.nextInt();
			Point p = Parse.parse(in);
			checker.setMark(new MarkX(p));
			boolean res = checker.check();
			DrawWell.drawWell(checker.getMarks());

			if (res) {
				System.out.println("mark Xs win!");
				System.exit(0);
			}

			//set Os...
			System.out.print("\nplace mark O: ");
			in = sc.nextInt();
			p = Parse.parse(in);
			checker.setMark(new MarkO(p));
			res = checker.check();
			DrawWell.drawWell(checker.getMarks());
			
			if (res) {
				System.out.println("mark Os win!");
				System.exit(0);
			}
		}
	}
}
