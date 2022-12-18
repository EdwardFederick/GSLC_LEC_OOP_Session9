package PetShop;

public class Pets {
	private String Color,Type;
	private int Bprice;

	

	public Pets(String color, String type, int bprice) {
		super();
		Color = color;
		Type = type;
		Bprice = bprice;
	}

	String getColor() {
		return Color;
	}

	void setColor(String color) {
		Color = color;
	}

	String getType() {
		return Type;
	}

	void setType(String type) {
		Type = type;
	}

	int getBprice() {
		return Bprice;
	}

	void setBprice(int bprice) {
		Bprice = bprice;
	}
	

}
