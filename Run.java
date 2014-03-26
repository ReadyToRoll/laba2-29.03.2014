package laba2;

import java.util.Scanner;
import java.util.Random;

public class Run {

	public static void hello(int type_phrase, Replica welcome,
			Temperament first, Temperament second) {
		type_phrase = first.analyzing();
		System.out.println("Первый говорит:");
		welcome.say(type_phrase);
		second.changeStatement(type_phrase);
		type_phrase = second.analyzing();
		System.out.println("А второй ему:");
		welcome.say(type_phrase);
		first.changeStatement(type_phrase);
	}

	public static void question_answer(int type_phrase, Replica question,
			Replica answer, Temperament first, Temperament second) {
		type_phrase = first.analyzing();
		System.out.println("Первый говорит:");
		question.say(type_phrase);
		second.changeStatement(type_phrase);
		type_phrase = second.analyzing();
		System.out.println("А второй ему:");
		answer.say(type_phrase);
		first.changeStatement(type_phrase);
	}

	public static void phrase(int type_phrase, Replica phrase,
			Temperament first, Temperament second) {
		type_phrase = first.analyzing();
		System.out.println("Первый говорит:");
		phrase.say(type_phrase);
		second.changeStatement(type_phrase);
		type_phrase = second.analyzing();
		System.out.println("А второй ему:");
		phrase.say(type_phrase);
		first.changeStatement(type_phrase);
	}

	public static void main(String[] args) throws InterruptedException {
		int sanguine[] = { 4, 3, 3, 2, 3, 3 };
		int choleric[] = { 4, 3, 3, 2, 4, 4 };
		int melancholiac[] = { 2, 2, 4, 4, 3, 2 };
		int phlegmatic[] = { 2, 2, 2, 2, 2, 2 };
		int happy[] = { 10, -10, 5, -5 };
		int kind[] = { -10, 10, -5, 5 };
		int sad[] = { 5, -5, 10, -10 };
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
		switch (i) {
		case 1: {
			switch (j) {
			case 1: {
				second = new Sanguine(sanguine, happy);
			}
				break;
			case 2: {
				second = new Sanguine(sanguine, sad);
			}
				break;
			case 3: {
				second = new Sanguine(sanguine, kind);
			}
				break;
			case 4: {
				second = new Sanguine(sanguine, ang);
			}
				break;
			}
		}
			break;
		case 2: {
			switch (j) {
			case 1: {
				second = new Choleric(choleric, happy);
			}
				break;
			case 2: {
				second = new Choleric(choleric, sad);
			}
				break;
			case 3: {
				second = new Choleric(choleric, kind);
			}
				break;
			case 4: {
				second = new Choleric(choleric, ang);
			}
				break;
			}
		}
			break;
		case 3: {
			switch (j) {
			case 1: {
				second = new Melancholiac(melancholiac, happy);
			}
				break;
			case 2: {
				second = new Melancholiac(melancholiac, sad);
			}
				break;
			case 3: {
				second = new Melancholiac(melancholiac, kind);
			}
				break;
			case 4: {
				second = new Melancholiac(melancholiac, ang);
			}
				break;
			}
		}
			break;
		case 4: {
			switch (j) {
			case 1: {
				second = new Phlegmatic(phlegmatic, happy);
			}
				break;
			case 2: {
				second = new Phlegmatic(phlegmatic, sad);
			}
				break;
			case 3: {
				second = new Phlegmatic(phlegmatic, kind);
			}
				break;
			case 4: {
				second = new Phlegmatic(phlegmatic, ang);
			}
				break;
			}
		}
			break;
		}
		Replica welcome = null, phrase = null, question = null, answer = null, finale = null;
		welcome = new Welcome();
		phrase = new Phrase();
		question = new Question();
		answer = new Answer();
		finale = new Finale();
		int type_phrase = 1;
		welcome.say(type_phrase);

		while (first.find_max()[1] < 20 && second.find_max()[1] < 20) {
			phrase(type_phrase, phrase, first, second);
			question_answer(type_phrase, question, answer, first, second);
			phrase(type_phrase, phrase, first, second);
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
			finale.say(1);
			break;
		case 1:
			System.out
					.println("В конце концов первый ужасно расстроился, и произес:");
			finale.say(2);
			break;
		case 2:
			System.out
					.println("В конце концов первый так расчувствовался, что не удержался и как скажет:");
			finale.say(3);
			break;
		case 3:
			System.out
					.println("В конце концов первый был ужасно зол. Подведя черту, сквозь зубы он проскрежетал:");
			finale.say(4);
			break;
		case 4:
			System.out
					.println("В конце концов второй был настолько счастлив, что не выдержал и заявил:");
			finale.say(1);
			break;
		case 5:
			System.out
					.println("В конце концов второй ужасно расстроился, и произес:");
			finale.say(2);
			break;
		case 6:
			System.out
					.println("В конце концов второй так расчувствовался, что не удержался и как скажет:");
			finale.say(3);
			break;
		case 7:
			System.out
					.println("В конце концов второй был ужасно зол. Подведя черту, сквозь зубы он проскрежетал:");
			finale.say(4);
			break;
		}
	}
}
