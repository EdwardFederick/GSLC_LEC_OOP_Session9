package PetShop;

public class Fish extends Pets implements PetDetails {
	private String waterType,size;

	public Fish(String color, String type, int bprice, String waterType, String size) {
		super(color, type, bprice);
		this.waterType = waterType;
		this.size = size;
	}





	String getWaterType() {
		return waterType;
	}





	void setWaterType(String waterType) {
		this.waterType = waterType;
	}





	String getSize() {
		return size;
	}





	void setSize(String size) {
		this.size = size;
	}





	@Override
	public int calculatetotalprice() {
		int fprice = (int)(this.getBprice() * 1.1 + 50000);
		return fprice;
		// TODO Auto-generated method stub
		
	}

}
