package kr.dv.test;

import kr.dv.test.n.Add;
import kr.dv.test.n.mul;
import kr.dv.test.obg.Person;

public class Main {
	/*
	
	//Main <-> main
	//heap , stack , static(������)
	
	// Person
	
	public static void main(String[] args) {
		
		
		Person person = new Person("��ȣ��");
		Person person2 = new Person("��ȣ��");
		//5 == 6 ==> false
		//5 > 6 -> false
		//4 > 3 -> true
		
		System.out.println(person.equalsNam(person2));
		}
		*/
	public static void main(String[] args) {
		
	Calc cal = new Add();
	System.out.println(cal.calc(10,20));
	}

}
