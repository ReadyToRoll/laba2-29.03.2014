package temperament;

interface Welcome {
	 final static String sentence_happy[] = { " - ��������! ", " - ������, ������! ", " - ��� � ��� ���� ������! ", " - ������! " };
	  final static String sentence_sad[] = { " - ������...", " - ��������..", " - ���..", " - ������.." };
	  final static String sentence_kind[] = { " - ������� ������� ������..� ���� ����� �������... ������������, �� ��������)", " - ������-������!"," - ������������! ", " - ����� ����!" };
	  final static String sentence_anger[] = { " - �� ������� �� ������!", " - ������ �� ������, ���� ������"," - ����� �� ���..!", " - ������ �� ��� �� ������.." };
}

interface Phrase {
		final static String sentence_happy[] = { " - �  � ��� � �������� ���!)", " - ���������������, �� �������� �� �����) ", " - ���� �����!... ��, �� ����� - ����� ", " - � � ���� ����� ��������!!" };
		final static String sentence_sad[] = { " - ������ ���, �� � ������� �������", " - �, � ����� ������� � ���� �������", " - �������.. ��� ����� �������", " - ��� ������� ���� ���.. �� ����� ������� ���������, � �� ������ ���� ������� �� �� ���� ����������� ��� ��� ��� ����� ����� ������������" };
		final static String sentence_kind[] = { " - � �����, �����, �����, � ����� �� �������", " - � ��� ���������� �� ������. ��� ������ ������� ��� ������ ������)", " - ���������� ����, �����! �� ������!)", " - � ������� ���� ����! � ������ �������� ���"};
		final static String sentence_anger[] = { "- ��� �� �� ���� ��� ������", "- ��� ��� ������ ���� �������!","- ����� ������ ��� ���� � ����������", "- ��� � ���� ������� �� ���� ��������"};
		
}

interface Quation {
	 final static String sentence_happy[] = { " - � ������� ������� �/�! ������ �� ���� ��������?)", " - � ������� �������� � �����, ������ ������ �������?) ", "� �� ������� �����?) ", "�����! � �� ���� �� �����?" };
	   final static String sentence_sad[] = { " - ���� ��� ������..? ������� �����..", " - � ����� ������� ������,�?", " - �����, ���� � �� �����? ..����� ������?�?", " - ��� ����� ���������� � �����?" };
	   final static String sentence_kind[] = { " - �������, ��� ������ �������?", "��� ���, ������ �����?"," - ��� ��� �������� ���������� �������?", " - ���������, ���������, ��� ��?.." };
	   final static String sentence_anger[] = { " - ���� ��� �� ������� ���� �����?", " - ����� ������ ���?"," - ������ ��������? ", " - � �� ����� �� ����..? ��� ������ ����."};
}

interface Answer {
	    final static String sentence_happy[] = { "- �������� ����!)", "- Let's go ", "- �� ��������� ����! ", " - ����� � ��������� ����������) " };
	    final static String sentence_sad[] = { "- �� ����� �� �������...", "- ���� ��.., � �� ����� ��� ������� �� ������", "- ��... �����-������ ", "- �� ������ ��� ��� ���������? " };
	    final static String sentence_kind[] = { "- � ������ ����, ����!", "- ���� ��� �� ����..? ������� ����! ","- �� ��� �� ��� ���� � ����� ����? � � �����) ", "- � ������ ����� ���������, ��� ������ �� ���� � ����� ��������.. � �� ��� ��� ������ ����� ���� 5 ��� ����� ������ ���� ����������.. �� � �� ����� ����, ��������" };
	    final static String sentence_anger[] = { "- � ���� ������� ������.. �� �� ����� �� �� � ������ ���������!", "- ��� �� ����� �������?","- ����� ��, �������", "- �� �� �� �� ������� ��� ����� ����������?"};
}

interface Finale {
		   final static String sentence_happy[] = { " - �����������!!!", " - �  ����� �� ��������! ", " - � ������! ��� ������� ������� �� �����..)) ���-���-��� ", " - � ������ �����!!  ���, � �� ������, �� ������,���, � �� �������, �� ����, ���, ����� �������� - ����� �����, ����� ��������" };
		   final static String sentence_sad[] = { " - � ���� �������� ����", " - � � ��� ��, ����� �����..?", " - �����, ������� ����� �����? � ���� �������� ���� �����", " - � ������-�� �����..." };
		   final static String sentence_kind[] = { " - �� �������, �������, ��� ���� ����", " - �... ����� ������� �� ���..?;)  "," - ��� � ���� �������!!! ", " - �����, ����� ����, �������" };
		   final static String sentence_anger[] = { " - �� � ���� ������ ������!", " - ��� �� ����!"," - ������ ���� � ���, ��������", " - � �� ��� ����, �����!"};
}

// 0������� 1������ 2������� 3������ 4�����

public class Replica implements Welcome, Phrase, Quation, Answer, Finale {
	String welcome,phrase,quation,answer,finale;
	Replica(int i,int j)
	{
		switch(i)
		{
		case 0:
			welcome=Welcome.sentence_happy[j];
			break;
		case 1:
			welcome=Welcome.sentence_sad[j];
			break;
		case 2:
			welcome=Welcome.sentence_kind[j];
			break;
		case 3:
			welcome=Welcome.sentence_anger[j];
			break;
		}
		switch(i)
		{
		case 0:
			phrase=Phrase.sentence_happy[j];
			break;
		case 1:
			phrase=Phrase.sentence_sad[j];
			break;
		case 2:
			phrase=Phrase.sentence_kind[j];
			break;
		case 3:
			phrase=Phrase.sentence_anger[j];
			break;
		}
		switch(i)
		{
		case 0:
			quation=Quation.sentence_happy[j];
			break;
		case 1:
			quation=Quation.sentence_sad[j];
			break;
		case 2:
			quation=Quation.sentence_kind[j];
			break;
		case 3:
			quation=Quation.sentence_anger[j];
			break;
		}
		switch(i)
		{
		case 0:
			answer=Answer.sentence_happy[j];
			break;
		case 1:
			answer=Answer.sentence_sad[j];
			break;
		case 2:
			answer=Answer.sentence_kind[j];
			break;
		case 3:
			answer=Answer.sentence_anger[j];
			break;
		}
		switch(i)
		{
		case 0:
			finale=Finale.sentence_happy[j];
			break;
		case 1:
			finale=Finale.sentence_sad[j];
			break;
		case 2:
			finale=Finale.sentence_kind[j];
			break;
		case 3:
			finale=Finale.sentence_anger[j];
			break;
		}
	}
	
	/*public void sayPhrase(int type) {
		System.out.println(Phrase.sentence[type - 1]);
	}

	public void sayQuation(int type) {
		System.out.println(Quation.sentence[type - 1]);
	}

	public void sayAnswer(int type) {
		System.out.println(Answer.sentence[type - 1]);
	}

	public void sayFinale(int type) {
		System.out.println(Finale.sentence[type - 1]);
	}*/

}
