class Officer{
	public Employee o1;
	public Employee o2;
	
	public Officer(){
		this.addOfficer();
		this.showOfficer();
	}
	public void addOfficer(){
		o1=new Employee();
		o2=new Employee();
		
		o1.setName("Muaz");
		o1.setId("O-001");
		o1.setAge(22);
		o1.setDateOfBirth("05/08/1999");
		o1.setBloodGroup("A+");
		o1.setSalary("28000 Taka");
		
		o2.setName("Tanvir");
		o2.setId("O-002");
		o2.setAge(24);
		o2.setDateOfBirth("05/08/1996");
		o2.setBloodGroup("A-");
		o2.setSalary("250000 Taka");
	}
	public void showOfficer(){
		o1.showDetails();
		System.out.println("Salary: "+this.o1.getSalary());
		
		o2.showDetails();
		System.out.println("Salary: "+this.o2.getSalary());
	}
}