package PetShop;

public class Cat extends Pets implements PetDetails{
	private String fur;
	private int age;

	public Cat(String color, String type, int bprice, String fur, int age) {
		super(color, type, bprice);
		this.fur = fur;
		this.age = age;
	}






	String getFur() {
		return fur;
	}






	void setFur(String fur) {
		this.fur = fur;
	}






	int getAge() {
		return age;
	}






	void setAge(int age) {
		this.age = age;
	}






	@Override
	public int calculatetotalprice() {
		int fprice = (int)(this.getBprice() * 1.5 + 250000);
		return fprice;
		// TODO Auto-generated method stub
		
	}

}
