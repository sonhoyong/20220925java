package kr.dv.test.obg;

public class Person {
      // public Person(매개변수) <-- 생성자 생략
	
	//String name;
	//int age;
	//static String name; //static 붙이면 Person 멤버 x  -> Person 파일 안에 있는 name이라는 변수
	
	//멤버변수에 접근, 수정하는 방법
	//getter settar 를 통해 관리(멥버 함수)
	public String name;  
	public int age;
	
	
	//반드시 이름값이 필요한 생성자
	//지역변수 -> 우선순위가 가장 높다.
	public Person(String name) {
		this.name = name;
	}
	
    public Person() {
    	System.out.println("생성되었습니다");
    }
    //public - 전체
    //private - 클래스 내
    //default - 패키지 내에
    //protected - 상속 클래스 내에    
    //접근지시자 (static) 리턴타입 이름 (매게변수){코드 ;} - 함수{매서드}
    public String getName() {
    	return name;
    }
    
    public boolean equals(Object obj) {
    	
    	//Person, int , long , double , string ...etc ~> object
    	//객체의 타입을 알아내야함 . object , class , 객체 , instance
    	int a = (int) 5.2;
    	double b = a;
    	if(obj instanceof Person) {
             return equalsName((Person)obj);  
    	} else if (obj instanceof String) {
    		return name == (String) obj;
    	}
    	return false;
    }
    
    //두 Person 이 이름이  같으면 true 다르면 false 를 반환(boolean[true/false] )
    public boolean equalsName(Person other) {
    	return this.name == other.name;
    }
    
    //세 명의 Person 이름이 같으면true 하나라도 다르면 false
    public boolean equalsName(Person other, Person other2) {
    	return this.name == other.name 
    			&& other.name == other2.name;
    }
}
