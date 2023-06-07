public class Bookshop{
	String name;
	TextBook textBook[100];
	StroyBook storyBook[100];
	
	BookShop()
	BookShop(String name){
		this.name=name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
}