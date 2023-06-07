class Employee{
	private String name;
	private String id;
	private int age;
	private String dateOfBirth;
	private String bloodGroup;
	private String salary;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getDateOfBirth(){
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth=dateOfBirth;
	}
	public String getBloodGroup(){
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup){
		this.bloodGroup=bloodGroup;
	}
	public String getSalary(){
		return salary;
	}
	public void setSalary(String salary){
		this.salary=salary;
	}
	public Employee(){
		
	}
	
	public void showDetails(){
		System.out.println();
		System.out.println("ID: "+this.getId());
		System.out.println("Name: "+this.getName());
		System.out.println("Age: "+this.getAge());
		System.out.println("Date of Birth: "+this.getDateOfBirth());
		System.out.println("Blood Group: "+this.getBloodGroup());
		
	}
}