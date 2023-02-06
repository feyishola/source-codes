public class person{
	protected String name;
	public person(String name){
		this.name = name;
	}
		public String toString(){
			return "NAME:"+name;
		}

}


public class Employee extends person{
	protected int id;
	protected double payrate;
		public Employee(int id, double payrate){
			super(name);
			this.id = id;
			this.payrate = payrate;
		}
	public double pay(){
		return payrate;
	}
	public String toString(){
		return super.toString()+"ID:"+id;
	}
}


public class faculty extends Employee{
		protected String officehours;
		protected String teachingcourses[String course,(int coursecode, String coursetitle)];
			public faculty(String officehours,String teachingcourses[String course,int coursecode,String coursetitle]){
			this.officehours = officehours;
			this.teachingcourses = [course,(coursecode,coursetitle)];
		}
		public String toString(){
			return officehours+teachingcourses;
		}			
	
}


public class TestPersons{
	public static void main(Strings[]args){
		public void printPerson(Person p){
			System.out.println(p);
		}
		
		TestPersons personobj = new TestPersons(person FEYISHOLA);
		//person personobj = new person(String FEYISHOLA);
		TestPersons Employeeobj = new TestPersons(person p18pscs7016,person 120000);
		//person  Employeeobj = new Employee(int 7016,double 8000.0);
		TestPersons facultyobj = new TestPersons(person physical science);
		//person  facultyobj = new faculty(String tweleve hours,String obejectoriented[String cosc762, String oop]);
		
		System.out.println("person: " +personobj.printPerson(Person p));
		System.out.println("employee: " +Employeeobj.printPerson(Person p));
		System.out.println("faculty: " +facultyobj.printPerson(Person p));
	}
	
	
	
	
	
	
	
	
}









