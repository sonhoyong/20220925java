package kr.dv.test.obg;

public class Person {
      // public Person(�Ű�����) <-- ������ ����
	
	//String name;
	//int age;
	//static String name; //static ���̸� Person ��� x  -> Person ���� �ȿ� �ִ� name�̶�� ����
	
	//��������� ����, �����ϴ� ���
	//getter settar �� ���� ����(��� �Լ�)
	public String name;  
	public int age;
	
	
	//�ݵ�� �̸����� �ʿ��� ������
	//�������� -> �켱������ ���� ����.
	public Person(String name) {
		this.name = name;
	}
	
    public Person() {
    	System.out.println("�����Ǿ����ϴ�");
    }
    //public - ��ü
    //private - Ŭ���� ��
    //default - ��Ű�� ����
    //protected - ��� Ŭ���� ����    
    //���������� (static) ����Ÿ�� �̸� (�ŰԺ���){�ڵ� ;} - �Լ�{�ż���}
    public String getName() {
    	return name;
    }
    
    public boolean equals(Object obj) {
    	
    	//Person, int , long , double , string ...etc ~> object
    	//��ü�� Ÿ���� �˾Ƴ����� . object , class , ��ü , instance
    	int a = (int) 5.2;
    	double b = a;
    	if(obj instanceof Person) {
             return equalsName((Person)obj);  
    	} else if (obj instanceof String) {
    		return name == (String) obj;
    	}
    	return false;
    }
    
    //�� Person �� �̸���  ������ true �ٸ��� false �� ��ȯ(boolean[true/false] )
    public boolean equalsName(Person other) {
    	return this.name == other.name;
    }
    
    //�� ���� Person �̸��� ������true �ϳ��� �ٸ��� false
    public boolean equalsName(Person other, Person other2) {
    	return this.name == other.name 
    			&& other.name == other2.name;
    }
}
