package laba2;

import java.util.Random;

class Welcome implements Replica {
	final static String happy[] = { " - Приветик! ", " - Привет, солнце! ",
			" - Как я рад тебя видеть! ", " - Аллоха! " };
	final static String sad[] = { " - привет...", " - Здрастье..", " - Хай..",
			" - Дарова.." };
	final static String kind[] = {
			" - Какооой сегодня дееень..я вижу вновь теебяяя... Здравствуйте, мы начинаем)",
			" - Привет-привет!", " - Здароооовааа! ", " - Бобра тебе!" };
	final static String anger[] = { " - Ну неужели ты пришел!",
			" - Откуда ты взялся, черт возьми", " - Опять ты тут..!",
			" - Никуда от вас не деться.." };

	public int rand_value() {
		Random rand = new Random();
		return rand.nextInt(4);
	}

	public void say(int type) {
		Replica temp = new Welcome();
		switch (type) {
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()] + "(сияя)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()] + "(грустно)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()] + "(с улыбкой)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()] + "(со злостью)");
			break;
		}
	}
}

class Phrase implements Replica {
	final static String happy[] = { " - А  у нас в квартире газ!)",
			" - Оооооберниииись, ты красивее со спины) ",
			" - Щаас скажу!... ой, не скажу - забыл ",
			" - А у меня дочка родилась!!" };
	final static String sad[] = {
			" - Поверь мне, не в пирогах счастье",
			" - О, я самый больной в мире человек",
			" - Женщины.. она такие женщины",
			" - Как безумен этот мир.. на земле столько красивого, а мы тратим кучу времени на то чтоб виртуальный мир был как можно более реалистичным" };
	final static String kind[] = {
			" - Я тучка, тучка, тучка, я вовсе не медведь",
			" - С ума поодиночке не сходят. Это только гриппом все вместе болеют)",
			" - Поздравляю тебя, Шарик! ты балбес!)",
			" - Я мужчина хоть куда! в полном расцвете сил" };
	final static String anger[] = { "- Как же ты меня уже задрал",
			"- Сил нет больше тебя терпеть!",
			"- Давай говори что надо и проваливай",
			"- Нет у меня времени на твои глупости" };

	public int rand_value() {
		Random rand = new Random();
		return rand.nextInt(4);
	}

	public void say(int type) {
		Replica temp = new Phrase();
		switch (type) {
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()] + "(сияя)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()] + "(грустно)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()] + "(с улыбкой)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()] + "(со злостью)");
			break;
		}
	}
}

class Question implements Replica {
	final static String happy[] = {
			" - Я получил сегодня з/п! подешь со мной отмечать?)",
			" - Я сегодня выступаю в школе, будешь вторым клоуном?) ",
			"А ты сегодня бухал?) ", "Гаити! а вы были на Гаити?" };
	final static String sad[] = { " - Есть что поесть..? кууушат ахота..",
			" - А давай бояться вместе,а?",
			" - Малыш, ведь я же лучше? ..лучше собаки?а?",
			" - Или может обратиться к врачу?" };
	final static String kind[] = { " - Говорят, вас счатья привало?",
			"это что, сказка такая?",
			" - Там еще осталось немножечко варенья?",
			" - Чебурашка, Чебурашка, где ты?.." };
	final static String anger[] = { " - Тебе еще не надоело чушь нести?",
			" - Может хватит уже?", " - Совсем придурок? ",
			" - А не пойти бы тебе..? сам знаешь куда." };

	public int rand_value() {
		Random rand = new Random();
		return rand.nextInt(4);
	}

	public void say(int type) {
		Replica temp = new Question();
		switch (type) {
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()] + "(сияя)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()] + "(грустно)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()] + "(с улыбкой)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()] + "(со злостью)");
			break;
		}
	}

}

class Answer implements Replica {
	final static String happy[] = { "- Отличная идея!)", "- Let's go ",
			"- Ты черотвски прав! ", " - Лучше и придумать невозможно) " };
	final static String sad[] = { "- Ну может не сегодня...",
			"- вряд ли.., я не лежал еще сегодня на диване",
			"- ну... когда-нибудь ", "- ты уверен что это неоходимо? " };
	final static String kind[] = {
			"- я помогу тебе, друг!",
			"- быть или не быть..? пожалуй быть! ",
			"- ну как же без меня в таком деле? я с тобой) ",
			"- я обещал своей черепашке, что больше не буду с тобой общаться.. и то что она умерла ВСЕГО ЛИШЬ 5 лет назад должно меня остановить.. но я не брошу тебя, товарищщ" };
	final static String anger[] = {
			"- Я тебя конечно удивлю.. но не пошел бы ты с такими вопросами!",
			"- Что за тупые вопросы?", "- Пошел ты, ублюдок",
			"- Да ты ли не охренел мне такое предлагать?" };

	public int rand_value() {
		Random rand = new Random();
		return rand.nextInt(4);
	}

	public void say(int type) {
		Replica temp = new Answer();
		switch (type) {
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()] + "(сияя)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()] + "(грустно)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()] + "(с улыбкой)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()] + "(со злостью)");
			break;
		}
	}
}

class Finale implements Replica {
	final static String happy[] = {
			" - Обнимааашки!!!",
			" - А  пошли на карусели! ",
			" - А теперь! все танцуют босиком на песке..)) тыц-тыц-тыц ",
			" - А сейчас песня!!  Ага, а мы гуляем, мы крутые,Ага, а мы хорошие, не злые, Ага, когда проснёмся - будет вечер, Будут выходные" };
	final static String sad[] = { " - Я хочу остаться один",
			" - А в чем он, смысл жизни..?",
			" - Дождь, сегодня будет дождь? Я хочу спрятать свои слезы",
			" - А птичку-то жалко..." };
	final static String kind[] = { " - До скорого, братюнь, мне пора идти",
			" - А... может сегодня ко мне..?;)  ", " - Дай я тебя поцелую!!! ",
			" - Добра, Бобра тебе, человек" };
	final static String anger[] = { " - Да я тебя сейчас ушатаю!",
			" - Шоп ты сдох!", " - Гореть тебе в аду, придурок",
			" - А ну иди сюда, козел!" };

	public int rand_value() {
		Random rand = new Random();
		return rand.nextInt(4);
	}

	public void say(int type) {
		Replica temp = new Finale();
		switch (type) {
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()] + "(сияя)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()] + "(грустно)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()] + "(с улыбкой)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()] + "(со злостью)");
			break;
		}
	}
}

// 0радость 1грусть 2доброта 3злость 4голод

public interface Replica {
	public int rand_value();

	void say(int type);
	// implements Welcome, Phrase, Quation, Answer, Finale {
	// String welcome,phrase,quation,answer,finale;
	/*
	 * Replica(int i,int j) { switch(i) { case 0: welcome=Welcome.happy[j];
	 * break; case 1: welcome=Welcome.sad[j]; break; case 2:
	 * welcome=Welcome.kind[j]; break; case 3: welcome=Welcome.anger[j]; break;
	 * } switch(i) { case 0: phrase=Phrase.happy[j]; break; case 1:
	 * phrase=Phrase.sad[j]; break; case 2: phrase=Phrase.kind[j]; break; case
	 * 3: phrase=Phrase.anger[j]; break; } switch(i) { case 0:
	 * quation=Quation.happy[j]; break; case 1: quation=Quation.sad[j]; break;
	 * case 2: quation=Quation.kind[j]; break; case 3: quation=Quation.anger[j];
	 * break; } switch(i) { case 0: answer=Answer.happy[j]; break; case 1:
	 * answer=Answer.sad[j]; break; case 2: answer=Answer.kind[j]; break; case
	 * 3: answer=Answer.anger[j]; break; } switch(i) { case 0:
	 * finale=Finale.happy[j]; break; case 1: finale=Finale.sad[j]; break; case
	 * 2: finale=Finale.kind[j]; break; case 3: finale=Finale.anger[j]; break; }
	 * }
	 */
	/*
	 * public void sayPhrase(int type) { System.out.println(Phrase.sentence[type
	 * - 1]); }
	 * 
	 * public void sayQuation(int type) {
	 * System.out.println(Quation.sentence[type - 1]); }
	 * 
	 * public void sayAnswer(int type) { System.out.println(Answer.sentence[type
	 * - 1]); }
	 * 
	 * public void sayFinale(int type) { System.out.println(Finale.sentence[type
	 * - 1]); }
	 */

}
