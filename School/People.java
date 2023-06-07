class People{
	private String name;
	private String role;
	private String id;
	private int age;
	private String roll;
	private String phone;
	private String dateOfBirth;
	private String bloodGroup;
	private String salary;
	
	
	public String getRole(){
		return role;
	}
	public void setRole(String role){
		this.role=role;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
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
	public String getRoll(){
		return roll;
	}
	public void setRoll(String roll){
		this.roll=roll;
	}
	public String getPhone(){
		return phone;
	}
	public void setPhone(String phone){
		this.phone=phone;
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
	
	public People(){
		
		
	}
	public People(String role,String name,String id,int age,String roll,String phone,String dateOfBirth,String bloodGroup,String salary){
		this.role=role;
		this.name=name;
		this.id=id;
		this.age=age;
		this.roll=roll;
		this.phone=phone;
		this.dateOfBirth=dateOfBirth;
		this.bloodGroup=bloodGroup;
		this.salary=salary;
	}
	
	public void showDetails(){
		System.out.println();
		System.out.println("Role in school:" +this.getRole());
		System.out.println("Name: "+this.getName());
		System.out.println("Id: "+this.getId());
		System.out.println("Age: "+this.getAge());
		System.out.println("Roll: "+this.getRoll());
		System.out.println("Phone Number: "+this.getPhone());
		System.out.println("Birthday: "+this.getDateOfBirth());
		System.out.println("Blood Group: "+this.getBloodGroup());
	}
	
}