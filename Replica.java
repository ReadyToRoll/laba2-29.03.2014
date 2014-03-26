package laba2;

import java.util.Random;

class Welcome implements Replica {
	final static String happy[] = { " - ��������! ", " - ������, ������! ",
			" - ��� � ��� ���� ������! ", " - ������! " };
	final static String sad[] = { " - ������...", " - ��������..", " - ���..",
			" - ������.." };
	final static String kind[] = {
			" - ������� ������� ������..� ���� ����� �������... ������������, �� ��������)",
			" - ������-������!", " - ������������! ", " - ����� ����!" };
	final static String anger[] = { " - �� ������� �� ������!",
			" - ������ �� ������, ���� ������", " - ����� �� ���..!",
			" - ������ �� ��� �� ������.." };

	public int rand_value() {
		Random rand = new Random();
		return rand.nextInt(4);
	}

	public void say(int type) {
		Replica temp = new Welcome();
		switch (type) {
		case -1:
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()] + "(����)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()] + "(�������)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()] + "(� �������)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()] + "(�� �������)");
			break;
		}
	}
}

class Phrase implements Replica {
	final static String happy[] = { " - �  � ��� � �������� ���!)",
			" - ���������������, �� �������� �� �����) ",
			" - ���� �����!... ��, �� ����� - ����� ",
			" - � � ���� ����� ��������!!" };
	final static String sad[] = {
			" - ������ ���, �� � ������� �������",
			" - �, � ����� ������� � ���� �������",
			" - �������.. ��� ����� �������",
			" - ��� ������� ���� ���.. �� ����� ������� ���������, � �� ������ ���� ������� �� �� ���� ����������� ��� ��� ��� ����� ����� ������������" };
	final static String kind[] = {
			" - � �����, �����, �����, � ����� �� �������",
			" - � ��� ���������� �� ������. ��� ������ ������� ��� ������ ������)",
			" - ���������� ����, �����! �� ������!)",
			" - � ������� ���� ����! � ������ �������� ���" };
	final static String anger[] = { "- ��� �� �� ���� ��� ������",
			"- ��� ��� ������ ���� �������!",
			"- ����� ������ ��� ���� � ����������",
			"- ��� � ���� ������� �� ���� ��������" };

	public int rand_value() {
		Random rand = new Random();
		return rand.nextInt(4);
	}

	public void say(int type) {
		Replica temp = new Phrase();
		switch (type) {
		case -1:
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()] + "(����)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()] + "(�������)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()] + "(� �������)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()] + "(�� �������)");
			break;
		}
	}
}

class Question implements Replica {
	final static String happy[] = {
			" - � ������� ������� �/�! ������ �� ���� ��������?)",
			" - � ������� �������� � �����, ������ ������ �������?) ",
			"� �� ������� �����?) ", "�����! � �� ���� �� �����?" };
	final static String sad[] = { " - ���� ��� ������..? ������� �����..",
			" - � ����� ������� ������,�?",
			" - �����, ���� � �� �����? ..����� ������?�?",
			" - ��� ����� ���������� � �����?" };
	final static String kind[] = { " - �������, ��� ������ �������?",
			"��� ���, ������ �����?",
			" - ��� ��� �������� ���������� �������?",
			" - ���������, ���������, ��� ��?.." };
	final static String anger[] = { " - ���� ��� �� ������� ���� �����?",
			" - ����� ������ ���?", " - ������ ��������? ",
			" - � �� ����� �� ����..? ��� ������ ����." };

	public int rand_value() {
		Random rand = new Random();
		return rand.nextInt(4);
	}

	public void say(int type) {
		Replica temp = new Question();
		switch (type) {
		case -1:
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()] + "(����)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()] + "(�������)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()] + "(� �������)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()] + "(�� �������)");
			break;
		}
	}

}

class Answer implements Replica {
	final static String happy[] = { "- �������� ����!)", "- Let's go ",
			"- �� ��������� ����! ", " - ����� � ��������� ����������) " };
	final static String sad[] = { "- �� ����� �� �������...",
			"- ���� ��.., � �� ����� ��� ������� �� ������",
			"- ��... �����-������ ", "- �� ������ ��� ��� ���������? " };
	final static String kind[] = {
			"- � ������ ����, ����!",
			"- ���� ��� �� ����..? ������� ����! ",
			"- �� ��� �� ��� ���� � ����� ����? � � �����) ",
			"- � ������ ����� ���������, ��� ������ �� ���� � ����� ��������.. � �� ��� ��� ������ ����� ���� 5 ��� ����� ������ ���� ����������.. �� � �� ����� ����, ��������" };
	final static String anger[] = {
			"- � ���� ������� ������.. �� �� ����� �� �� � ������ ���������!",
			"- ��� �� ����� �������?", "- ����� ��, �������",
			"- �� �� �� �� ������� ��� ����� ����������?" };

	public int rand_value() {
		Random rand = new Random();
		return rand.nextInt(4);
	}

	public void say(int type) {
		Replica temp = new Answer();
		switch (type) {
		case -1:
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()] + "(����)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()] + "(�������)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()] + "(� �������)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()] + "(�� �������)");
			break;
		}
	}
}

class Finale implements Replica {
	final static String happy[] = {
			" - �����������!!!",
			" - �  ����� �� ��������! ",
			" - � ������! ��� ������� ������� �� �����..)) ���-���-��� ",
			" - � ������ �����!!  ���, � �� ������, �� ������,���, � �� �������, �� ����, ���, ����� �������� - ����� �����, ����� ��������" };
	final static String sad[] = { " - � ���� �������� ����",
			" - � � ��� ��, ����� �����..?",
			" - �����, ������� ����� �����? � ���� �������� ���� �����",
			" - � ������-�� �����..." };
	final static String kind[] = { " - �� �������, �������, ��� ���� ����",
			" - �... ����� ������� �� ���..?;)  ", " - ��� � ���� �������!!! ",
			" - �����, ����� ����, �������" };
	final static String anger[] = { " - �� � ���� ������ ������!",
			" - ��� �� ����!", " - ������ ���� � ���, ��������",
			" - � �� ��� ����, �����!" };

	public int rand_value() {
		Random rand = new Random();
		return rand.nextInt(4);
	}

	public void say(int type) {
		Replica temp = new Finale();
		switch (type) {
		case -1:
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()] + "(����)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()] + "(�������)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()] + "(� �������)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()] + "(�� �������)");
			break;
		}
	}
}

// 0������� 1������ 2������� 3������ 4�����

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
