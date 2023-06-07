class Staff{
	public Employee s1;
	public Employee s2;
	
	public Staff(){
		
		this.addStaff();
		this.showStaff();
	}
	
	
	public void addStaff(){
		s1=new Employee();
		s2=new Employee();
	
	
	s1.setName("Rahim");
	s1.setId("S-001");
	s1.setAge(27);
	s1.setDateOfBirth("05-07-2002");
	s1.setBloodGroup("B+");
	s1.setSalary("2500 Taka");
	
	s2.setName("Karim");
	s2.setId("S-002");
	s2.setAge(29);
	s2.setDateOfBirth("02/08/2000");
	s2.setBloodGroup("O+");
	s2.setSalary("3500 Taka");
	}
	
	public void showStaff(){
		s1.showDetails();
		System.out.println("Salary: "+this.s1.getSalary());
		s2.showDetails();
		System.out.println("Salary: "+this.s2.getSalary());
	}
}