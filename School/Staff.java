 class Staff{
	
	public Staff(){
		this.addStaff();
		this.showStaff();
	}
	
		public People s1;
		public People s2;
		public People s3;
		public People s4;
		
		public void addStaff(){ 
		s1=new People("Staff","Tanvir","001",25,"005","01534103985","05-07-2002","B+","25000");
		s2=new People("Staff","Hasan","0065",26,"007","0155345503985","05-07-2102","B-","27000");
		s3=new People();
		s4=new People();
		
		
		s3.setRole("staff");
		s3.setName("Bishu");
		s3.setId("0056");
		s3.setAge(35);
		s3.setRoll("26");
		s3.setPhone("025341369");
		s3.setDateOfBirth("02-08-1990");
		s3.setBloodGroup("A-");
		s3.setSalary("3500");
		
		s4.setRole("staff");
		s4.setName("Babu");
		s4.setId("1616");
		s4.setAge(27);
		s4.setRoll("23");
		s4.setPhone("0189dv1369");
		s4.setDateOfBirth("15-07-1969");
		s4.setBloodGroup("B-");
		s4.setSalary("50052");
		}
		
		public void showStaff(){
		s1.showDetails();
		System.out.println("Salary:"+this.s1.getSalary());
		
		s2.showDetails();
		System.out.println("Salary:"+this.s2.getSalary());
		
		s3.showDetails();
		System.out.println("Salary:"+this.s3.getSalary());
		
		s4.showDetails();
		System.out.println("Salary:"+this.s4.getSalary());
		}
	
}
	
