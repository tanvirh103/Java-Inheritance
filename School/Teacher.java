class Teacher{
	public People t1;
	public People t2;
	public People t3;
	public People t4;
	
	public void addTeacher(){
		t1=new People("Teacher","Hamid","1854-2",45,"06","015348974","05-08-1990","AB+","100000");
		t2=new People("Teacher","Khan","2158-3",50,"08","017458689","25-12-1965","AB-","1280000");
		t3=new People();
		t4=new People();
		
		
		t3.setRole("Teacher");
		t3.setName("Haq");
		t3.setId("1569-2");
		t3.setAge(40);
		t3.setRoll("16");
		t3.setPhone("015341369");
		t3.setDateOfBirth("02-08-2001");
		t3.setBloodGroup("AB-");
		t3.setSalary("85000");
		
		t4.setRole("Teacher");
		t4.setName("Ahmed");
		t4.setId("1783-1");
		t4.setAge(35);
		t4.setRoll("01");
		t4.setPhone("017465599");
		t4.setDateOfBirth("02-08-1980");
		t4.setBloodGroup("A-");
		t4.setSalary("55000");
	}
	public void showTeacher(){
		t1.showDetails();
		System.out.println("Monthly Salary: "+this.t1.getSalary());
		
		t2.showDetails();
		System.out.println("Monthly Salary: "+this.t2.getSalary());
		
		t3.showDetails();
		System.out.println("Monthly Salary: "+this.t3.getSalary());
		
		t4.showDetails();
		System.out.println("Monthly Salary: "+this.t4.getSalary());
	}
	public Teacher(){
		this.addTeacher();
		this.showTeacher();
		
	}
}