package laba2;

import java.util.Scanner;
import java.util.Random;

public class Run {

	public static int rand_value() {
		Random rand = new Random();
		return rand.nextInt(3);
	}

	public static void hello(Temperament first, Temperament second,
			Replica phrase_first, Replica phrase_second) {
		phrase_first = new Welcome(0, first.analyzing() - 1, rand_value());
		phrase_first.say();
		second.changeStatement(first.analyzing());
		phrase_second = new Welcome(0, second.analyzing() - 1, rand_value());
		phrase_second.say();
		first.changeStatement(second.analyzing());
	}

	public static void question_answer(Temperament first, Temperament second,
			Replica phrase_first, Replica phrase_second) {
		phrase_first = new Question(2, first.analyzing() - 1, rand_value());
		phrase_first.say();
		second.changeStatement(first.analyzing());
		phrase_second = new Answer(3, second.analyzing() - 1, rand_value());
		phrase_second.say();
		first.changeStatement(second.analyzing());
	}

	public static void phrase(Temperament first, Temperament second,
			Replica phrase_first, Replica phrase_second) {
		phrase_first = new Phrase(1, first.analyzing() - 1, rand_value());
		phrase_first.say();
		second.changeStatement(first.analyzing());
		phrase_second = new Phrase(1, second.analyzing() - 1, rand_value());
		phrase_second.say();
		first.changeStatement(second.analyzing());
	}

	public static void main(String[] args) throws InterruptedException {
		int sanguine[] = { 4, 3, 3, 2, 3, 3 };
		int choleric[] = { 4, 3, 3, 2, 4, 4 };
		int melancholiac[] = { 2, 2, 4, 4, 3, 2 };
		int phlegmatic[] = { 2, 2, 2, 2, 2, 2 };
		int happy[] = { 10, -10, 5, -5 };
		int sad[] = { -10, 10, -5, 5 };
		int kind[] = { 5, -5, 10, -10 };
		int ang[] = { -5, 5, -10, 10 };
		Temperament first = null, second = null;
		boolean ch = true;
		Scanner inp = new Scanner(System.in);
		int i, j;
		if (ch == true)
			System.out.println("Какого человека вы хотите создать?");
		else
			System.out.println("А второго какого хотите?");
		System.out.println("1 - Cангвиника");
		System.out.println("2 - Холерика");
		System.out.println("3 - Меланхолика");
		System.out.println("4 - Флегматика");
		System.out.println("(Ввести число от 1 до 4)");
		i = inp.nextInt();
		System.out.println("Настрой какой хотите?");
		System.out.println("1 - Веселый");
		System.out.println("2 - Грустный");
		System.out.println("3 - Добрый");
		System.out.println("4 - Злой");
		System.out.println("(Ввести число от 1 до 4)");
		j = inp.nextInt();
		switch (i) {
		case 1: {
			switch (j) {
			case 1: {
				first = new Sanguine(sanguine, happy);
			}
				break;
			case 2: {
				first = new Sanguine(sanguine, sad);
			}
				break;
			case 3: {
				first = new Sanguine(sanguine, kind);
			}
				break;
			case 4: {
				first = new Sanguine(sanguine, ang);
			}
				break;
			}
		}
			break;
		case 2: {
			switch (j) {
			case 1: {
				first = new Choleric(choleric, happy);
			}
				break;
			case 2: {
				first = new Choleric(choleric, sad);
			}
				break;
			case 3: {
				first = new Choleric(choleric, kind);
			}
				break;
			case 4: {
				first = new Choleric(choleric, ang);
			}
				break;
			}
		}
			break;
		case 3: {
			switch (j) {
			case 1: {
				first = new Melancholiac(melancholiac, happy);
			}
				break;
			case 2: {
				first = new Melancholiac(melancholiac, sad);
			}
				break;
			case 3: {
				first = new Melancholiac(melancholiac, kind);
			}
				break;
			case 4: {
				first = new Melancholiac(melancholiac, ang);
			}
				break;
			}
		}
			break;
		case 4: {
			switch (j) {
			case 1: {
				first = new Phlegmatic(phlegmatic, happy);
			}
				break;
			case 2: {
				first = new Phlegmatic(phlegmatic, sad);
			}
				break;
			case 3: {
				first = new Phlegmatic(phlegmatic, kind);
			}
				break;
			case 4: {
				first = new Phlegmatic(phlegmatic, ang);
			}
				break;
			}
		}
			break;
		}

		ch = false;
		if (ch == true)
			System.out.println("Какого человека вы хотите создать?");
		else
			System.out.println("А второго какого хотите?");
		System.out.println("1 - Cангвиника");
		System.out.println("2 - Холерика");
		System.out.println("3 - Меланхолика");
		System.out.println("4 - Флегматика");
		System.out.println("(Ввести число от 1 до 4)");
		i = inp.nextInt();
		System.out.println("Настрой какой хотите?");
		System.out.println("1 - Веселый");
		System.out.println("2 - Грустный");
		System.out.println("3 - Добрый");
		System.out.println("4 - Злой");
		System.out.println("(Ввести число от 1 до 4)");
		j = inp.nextInt();
		int[] mood= null;
		switch(j){
		case 1: mood=happy;
		case 2: mood=sad;
		case 3: mood=kind;
		case 4: mood=ang;
		}
		
		switch (i) {
			case 1: {second = new Sanguine(sanguine, mood);} break;
			case 2: {second = new Sanguine(sanguine, mood);} break;
			case 3: {second = new Sanguine(sanguine, mood);} break;
			case 4: {second = new Sanguine(sanguine, mood);} break;
		}
		
		Replica phrase_first = null, phrase_second = null;

		hello(first, second, phrase_first, phrase_second);

		while (first.find_max()[1] < 20 && second.find_max()[1] < 20) {
			phrase(first, second, phrase_first, phrase_second);
			question_answer(first, second, phrase_first, phrase_second);
			phrase(first, second, phrase_first, phrase_second);
			// Thread.sleep(5000);
		}
		int val = 0;
		if (first.find_max()[1] > second.find_max()[1])
			val = first.find_max()[0];
		else
			val = second.find_max()[0];
		switch (val) {
		case -1:
			System.out
					.println("Неясно в итоге чем все кончилось.. Будем считать, что все хорошо)");
			break;
		case 0:
			System.out
					.println("В конце концов первый был настолько счастлив, что не выдержал и заявил:");
			break;
		case 1:
			System.out
					.println("В конце концов первый ужасно расстроился, и произес:");
			break;
		case 2:
			System.out
					.println("В конце концов первый так расчувствовался, что не удержался и как скажет:");
			break;
		case 3:
			System.out
					.println("В конце концов первый был ужасно зол. Подведя черту, сквозь зубы он проскрежетал:");
			break;
		case 4:
			System.out
					.println("В конце концов второй был настолько счастлив, что не выдержал и заявил:");
			break;
		case 5:
			System.out
					.println("В конце концов второй ужасно расстроился, и произес:");
			break;
		case 6:
			System.out
					.println("В конце концов второй так расчувствовался, что не удержался и как скажет:");
			break;
		case 7:
			System.out
					.println("В конце концов второй был ужасно зол. Подведя черту, сквозь зубы он проскрежетал:");
			break;
		}
		if (first.find_max()[1] < second.find_max()[1]) {
			phrase_second = new Finale(4, second.analyzing() - 1, rand_value());
			phrase_second.say();
		} else {
			phrase_first = new Finale(4, first.analyzing() - 1, rand_value());
			phrase_first.say();
		}
	}
}
