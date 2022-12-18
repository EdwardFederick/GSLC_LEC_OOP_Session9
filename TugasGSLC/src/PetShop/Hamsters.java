package PetShop;

public class Hamsters extends Pets implements PetDetails{
	private String size;
	private int weight;


	public Hamsters(String color, String type, int bprice, String size, int weight) {
		super(color, type, bprice);
		this.size = size;
		this.weight = weight;
	}


	String getSize() {
		return size;
	}


	void setSize(String size) {
		this.size = size;
	}


	int getWeight() {
		return weight;
	}


	void setWeight(int weight) {
		this.weight = weight;
	}


	@Override
	public int calculatetotalprice() {
		int fprice = (int)(this.getBprice() * 1.7 + 300000);
		return fprice;
		// TODO Auto-generated method stub
		
	}

}
