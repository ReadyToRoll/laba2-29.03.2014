package temperament;

import java.util.Scanner;
import java.util.Random;

public class Human {
	int [] temperament;
	float [] statement;
	int choice;
	Human(int i, int j)
	{
		switch(i)
		{
		case 1:
			Temperament temp=new Sanguine();
			temperament=temp.getTemperament();
			break;
		case 2:
			Temperament temp1=new Choleric();
			temperament=temp1.getTemperament();
			break;
		case 3:
			Temperament temp2=new Melancholiac();
			temperament=temp2.getTemperament();
			break;
		case 4:
			Temperament temp3=new Phlegmatic();
			temperament=temp3.getTemperament();
			break;
		}
		Statement temporary=new Statement(j);
		statement=temporary.stat;
		choice=i;
	}
	
	public int rand_value()
	{
		Random rand = new Random();
		return rand.nextInt(4);
	}
	
	public static Human input(boolean ch,Scanner inp) {
		int i,j;
		if(ch==true)
			System.out.println("������ �������� �� ������ �������?");
		else
			System.out.println("� ������� ������ ������?");
		System.out.println("1 - C���������");
		System.out.println("2 - ��������");
		System.out.println("3 - �����������");
		System.out.println("4 - ����������");
		System.out.println("(������ ����� �� 1 �� 4)");
		i=inp.nextInt();
		System.out.println("������� ����� ������?");
		System.out.println("1 - �������");
		System.out.println("2 - ��������");
		System.out.println("3 - ������");
		System.out.println("4 - ����");
		System.out.println("(������ ����� �� 1 �� 4)");
		j=inp.nextInt();
		Human temp=new Human(i,j);
		return temp;
	}
	
	public int analyzing(Human temp)
	{
		float i,j;
		boolean kind = false, happy = false;
		if(temp.statement[0]+temp.temperament[1]>temp.statement[1]+temp.temperament[2])
		{
			i=temp.statement[0]+temp.temperament[1];
			happy=true;
		}
		else
			if(temp.statement[0]+temp.temperament[1]<temp.statement[1]+temp.temperament[2])
			{
				i=temp.statement[1]+temp.temperament[2];
				happy=false;
			}
			else
				i=1;
		
		if(temp.statement[2]+(temp.temperament[1]+temp.temperament[1])/2>temp.statement[3]+temp.temperament[0])
		{
			j=temp.statement[2]+(temp.temperament[1]+temp.temperament[1])/2;
			kind=true;
		}
		else
			if(temp.statement[2]+(temp.temperament[1]+temp.temperament[1])/2<temp.statement[3]+temp.temperament[0])
			{
				j=temp.statement[3]+temp.temperament[0];
				kind=false;
			}
			else
				j=1;
		if(i>j&&happy==true)
			return 1;
		if(i>j&&happy==false)
			return 2;
		if(i<j&&kind==true)
			return 3;
		if(i<j&&kind==false)
			return 4;
		if(happy==false&&kind==false)
			return 0;
		return -1;
	}
	
	public static void say_welcome(int type, Replica happy[],Replica sad[],Replica kind[],Replica anger[]) {
		Human temp=new Human(1,2);
		switch(type)
		{
		case -1:
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()].welcome+"(����)");
		break;
		case 2:
			System.out.println(sad[temp.rand_value()].welcome+"(�������)");
		break;
		case 3:
			System.out.println(kind[temp.rand_value()].welcome+"(� �������)");
		break;
		case 4:
			System.out.println(anger[temp.rand_value()].welcome+"(�� �������)");
		break;
		}
	}
	
	
	public static void say_phrase(int type, Replica happy[],Replica sad[],Replica kind[],Replica anger[]) {
		Human temp=new Human(1,2);
		switch(type)
		{
		case -1:
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()].phrase+"(����)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()].phrase+"(�������)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()].phrase+"(� �������)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()].phrase+"(�� �������)");
			break;
		}
	}
	
	
	public static void say_quation(int type, Replica happy[],Replica sad[],Replica kind[],Replica anger[]) {
		Human temp=new Human(1,2);
		switch(type)
		{
		case -1:
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()].quation+"(����)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()].quation+"(�������)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()].quation+"(� �������)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()].quation+"(�� �������)");
			break;
		}
	}
	
	
	public static void say_answer(int type, Replica happy[],Replica sad[],Replica kind[],Replica anger[]) {
		Human temp=new Human(1,2);
		switch(type)
		{
		case -1:
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()].answer+"(����)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()].answer+"(�������)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()].answer+"(� �������)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()].answer+"(�� �������)");
			break;
		}
	}
	
	
	public static void say_finale(int type, Replica happy[],Replica sad[],Replica kind[],Replica anger[]) {
		Human temp=new Human(1,2);
		switch(type)
		{
		case -1:
			System.out.println("-'�������� �������..'");
			break;
		case 0:
			System.out.println("-'�������� �������..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()].finale);
			break;
		case 2:
			System.out.println(sad[temp.rand_value()].finale);
			break;
		case 3:
			System.out.println(kind[temp.rand_value()].finale);
			break;
		case 4:
			System.out.println(anger[temp.rand_value()].finale);
			break;
		}
	}
	public void changeStatement(Human man, int type) {
		double k=0.5;
		switch (type) { // ����� ����� �������� ��������� ������ � ��������� ��
						// ��������� �������
		case 1: {
			man.statement[0] += (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]+5) / 3.0*k;
			man.statement[1] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]+5) / 3.0*k;
			man.statement[2] += (man.temperament[0] + man.temperament[1]
					+ man.temperament[4] + man.temperament[5]) / 4.0*k;
			man.statement[3] -= (man.temperament[0] + man.temperament[3]
					+ man.temperament[4] + man.temperament[5]) / 4.0*k;
			break;
			}
		case 2: {
			man.statement[0] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]+5) / 3.0*k;
			man.statement[1] += (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]+5) / 3.0*k;
			man.statement[2] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4] + man.temperament[5]) / 4.0*k;
			man.statement[3] += (man.temperament[0] + man.temperament[3]
					+ man.temperament[4] + man.temperament[5]) / 4.0*k;
			break;
			}
		case 3: {
			man.statement[0] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]) / 3.0*k;
			man.statement[1] += (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]) / 3.0*k;
			man.statement[2] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4] + man.temperament[5]+5) / 4.0*k;
			man.statement[3] += (man.temperament[0] + man.temperament[3]
					+ man.temperament[4] + man.temperament[5]+5) / 4.0*k;
			break;
			}
		case 4: {
			man.statement[0] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]) / 3.0*k;
			man.statement[1] += (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]) / 3.0*k;
			man.statement[2] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4] + man.temperament[5]+5) / 4.0*k;
			man.statement[3] += (man.temperament[0] + man.temperament[3]
					+ man.temperament[4] + man.temperament[5]+5) / 4.0*k;
			break;
			}
		}
	}
	
	public void hello(int type_phrase, Human first, Human second, Replica happy[],Replica sad[],Replica kind[],Replica anger[])
	{
		type_phrase=analyzing(first);
	    System.out.println("������ �������:");
	    say_welcome(type_phrase,happy,sad,kind,anger);
	    changeStatement(second,type_phrase);
	    type_phrase=analyzing(second);
	    System.out.println("� ������ ���:");
	    say_welcome(type_phrase,happy,sad,kind,anger);
	    changeStatement(first,type_phrase);
	}
	
	public void question_answer(int type_phrase, Human first, Human second, Replica happy[],Replica sad[],Replica kind[],Replica anger[])
	{
		type_phrase=analyzing(first);
	    System.out.println("������ �������:");
	    say_quation(type_phrase,happy,sad,kind,anger);
	    changeStatement(second,type_phrase);
	    type_phrase=analyzing(second);
	    System.out.println("� ������ ���:");
	    say_answer(type_phrase,happy,sad,kind,anger);
	    changeStatement(first,type_phrase);
	}

	public void phrase(int type_phrase, Human first, Human second, Replica happy[],Replica sad[],Replica kind[],Replica anger[])
	{
		type_phrase=analyzing(first);
	    System.out.println("������ �������:");
	    say_phrase(type_phrase,happy,sad,kind,anger);
	    changeStatement(second,type_phrase);
	    type_phrase=analyzing(second);
	    System.out.println("� ������ ���:");
	    say_phrase(type_phrase,happy,sad,kind,anger);
	    changeStatement(first,type_phrase);
	}
	
	
	public static void main(String[] args) throws InterruptedException  {
		int n=10;
	Human first, second;
	Human temp=new Human(1,2);
	boolean ch=true;
	Scanner inp = new Scanner(System.in);
	first=input(ch,inp);
	ch=false;
	second=input(ch,inp);
	 for(int i=0; i<6; i++)
		 System.out.print(first.temperament[i]);
	 System.out.println();
	 for(int i=0; i<6; i++)
		 System.out.print(second.temperament[i]);
	Replica happy[];
	happy = new Replica[n];
    for(int i=0; i<4; i++)
        happy[i]=new Replica(0,i);
    Replica sad[];
	sad = new Replica[n];
    for(int i=0; i<4; i++)
        sad[i]=new Replica(1,i);
    Replica kind[];
    kind = new Replica[n];
    for(int i=0; i<4; i++)
    	kind[i]=new Replica(2,i);
    Replica anger[];
    anger = new Replica[n];
    for(int i=0; i<4; i++)
    	anger[i]=new Replica(3,i);
    int type_phrase=0;
    temp.hello(type_phrase, first, second,happy,sad,kind,anger);    
    while(first.statement[0]<20&&first.statement[1]<20&&first.statement[2]<20&&first.statement[3]<20||
    		second.statement[0]<20&&second.statement[1]<20&&second.statement[2]<20&&second.statement[3]<20)
    {
    	temp.question_answer(type_phrase, first, second, happy, sad, kind, anger);
        temp.phrase(type_phrase, first, second, happy, sad, kind, anger);
        temp.phrase(type_phrase, first, second, happy, sad, kind, anger);
        temp.phrase(type_phrase, first, second, happy, sad, kind, anger);
        //Thread.sleep(5000);
    }
    int check=-1;
    if(first.statement[0]>20)
    	check=0;
    if(first.statement[1]>20)
    	check=1;
    if(first.statement[2]>20)
    	check=2;
    if(first.statement[3]>20)
       	check=3;
    if(second.statement[0]>20)
    	check=4;
    if(second.statement[1]>20)
    	check=5;
    if(second.statement[2]>20)
    	check=6;
    if(second.statement[3]>20)
       	check=7;
    switch(check)
    {
	    case -1:
	    	System.out.println("������ � ����� ��� ��� ���������.. ����� �������, ��� ��� ������)");
	    	break;
	    case 0:
	    	System.out.println("� ����� ������ ������ ��� ��������� ��������, ��� �� �������� � ������:");
	    	say_finale(1,happy,sad,kind,anger);
	    	break;
	    case 1:
	    	System.out.println("� ����� ������ ������ ������ �����������, � �������:");
	    	say_finale(2,happy,sad,kind,anger);
	    	break;
	    case 2:
	    	System.out.println("� ����� ������ ������ ��� ���������������, ��� �� ��������� � ��� ������:");
	    	say_finale(3,happy,sad,kind,anger);
	    	break;
	    case 3:
	    	System.out.println("� ����� ������ ������ ��� ������ ���. ������� �����, ������ ���� �� ������������:");
	    	say_finale(4,happy,sad,kind,anger);
	    	break;
	    case 4:
	    	System.out.println("� ����� ������ ������ ��� ��������� ��������, ��� �� �������� � ������:");
	    	say_finale(1,happy,sad,kind,anger);
	    	break;
	    case 5:
	    	System.out.println("� ����� ������ ������ ������ �����������, � �������:");
	    	say_finale(2,happy,sad,kind,anger);
	    	break;
	    case 6:
	    	System.out.println("� ����� ������ ������ ��� ���������������, ��� �� ��������� � ��� ������:");
	    	say_finale(3,happy,sad,kind,anger);
	    	break;
	    case 7:
	    	System.out.println("� ����� ������ ������ ��� ������ ���. ������� �����, ������ ���� �� ������������:");
	    	say_finale(4,happy,sad,kind,anger);
	    	break;
    	}
	}
}
