public class Start{
	public static void main(String[]args){
	StoryBook s1=new StoryBook();
	StoryBook s2=new StoryBook("54-448","Bangladesh","Shimul",258,20,"Perfect");
	TextBook t1=new TextBook();
	TextBook t2=new TextBook("65-87-9","Hindi","Zamil Uddin",553.95,17,3);

		s1.setIsbn("45-98-1");
		s1.setBookTitle("Shopno Nil");
		s1.setAuthorName("Maliha");
		s1.setPrice(305);
		s1.setAvailableQuantity(6);
		s1.setCategory("Not Good");
		

		System.out.println("Before Add Book:");
		s1.showStoryDetails();
		System.out.println("After Add Book:");
		s1.addQuantity(34);
		s1.showStoryDetails();
		System.out.println("After Sell Book:");
		s1.sellQuantity(21);
		s1.showStoryDetails();
		
		System.out.println("Before Add Book:");
		s2.showStoryDetails();
		System.out.println("After Add Book:");
		s2.addQuantity(24);
		s2.showStoryDetails();
		System.out.println("After Sell Book:");
		s2.sellQuantity(15);
		s2.showStoryDetails();

		
		
		t1.setIsbn("52-98-54");
		t1.setBookTitle("African Story");
		t1.setAuthorName("Jhon");
		t1.setPrice(458.65);
		t1.setAvailableQuantity(54);
		t1.setStandard(5);
		
		
		System.out.println("Before Add Book:");
		t1.showTextDetails();
		System.out.println("After Add Book:");
		t1.addQuantity(85);
		t1.showTextDetails();
		System.out.println("After Sell Book:");
		t1.sellQuantity(51);
		t1.showTextDetails();
		
		System.out.println("Before Add Book:");
		t2.showTextDetails();
		System.out.println("After Add Book:");
		t2.addQuantity(71);
		t2.showTextDetails();
		System.out.println("After Sell Book:");
		t2.sellQuantity(25);
		t2.showTextDetails();
}
}