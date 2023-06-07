class Student{
	public Student(){
		this.addStudent();
		this.showStudent();
	}
	
	public People st1;
	public People st2;
	public People st3;
	public People st4;
	
	public void addStudent(){
		st1=new People("Student","Tamal","21-44626-1",20,"16","01746852","05-09-2001","A+","2200");
		st2=new People("Student","Kakon","21-45644-1",19,"18","015467899","08-12-1999","O-","2500");
		st3=new People();
		st4=new People();
		
		st3.setRole("Student");
		st3.setName("Mishu");
		st3.setId("21-4568-1");
		st3.setAge(21);
		st3.setRoll("26");
		st3.setPhone("02215341369");
		st3.setDateOfBirth("02-08-2001");
		st3.setBloodGroup("A-");
		st3.setSalary("2500");
		
		st4.setRole("Studnet");
		st4.setName("Shehab");
		st4.setId("20-19875-2");
		st4.setAge(20);
		st4.setRoll("30");
		st4.setPhone("01891369");
		st4.setDateOfBirth("15-07-1901");
		st4.setBloodGroup("A+");
		st4.setSalary("500");
	}
	
	
	public void showStudent(){
		st1.showDetails();
		System.out.println("Monthly Fee: "+this.st1.getSalary());
		
		st2.showDetails();
		System.out.println("Monthly Fee: "+this.st2.getSalary());
		
		st3.showDetails();
		System.out.println("Monthly Fee: "+this.st3.getSalary());
		
		st4.showDetails();
		System.out.println("Monthly Fee: "+this.st4.getSalary());
	}
	
	 
	

	
}