package PetShop;

public class Dog extends Pets implements PetDetails {
	private String bread;
	private int age;

	public Dog(String color, String type, int bprice, String bread, int age) {
		super(color, type, bprice);
		this.bread = bread;
		this.age = age;
	}
	





	String getBread() {
		return bread;
	}






	void setBread(String bread) {
		this.bread = bread;
	}






	int getAge() {
		return age;
	}






	void setAge(int age) {
		this.age = age;
	}






	@Override
	public int calculatetotalprice() {
		int fprice = (int)(this.getBprice() * 1.2 + 500000);
		return fprice;
		// TODO Auto-generated method stub
		
		
	}

}
