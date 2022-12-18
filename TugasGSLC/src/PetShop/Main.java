package PetShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Pets> PetList = new ArrayList <>();
	

	public Main() {
		// TODO Auto-generated constructor stub
		int choose = 0 ;
		do {
			System.out.println("Amsal Pet Shop");
			System.out.println("====================");
			System.out.println("1.View Menu");
			System.out.println("2.Add Pets");
			System.out.println("3.Buy Pets");
			System.out.println("4.Exit");
			System.out.println("===================");
			
			choose = scan.nextInt();
			scan.nextLine();
			switch(choose) {
			case 1:
				viewPets();
				break;
			case 2:
				AddP();
				break;
			case 3:
				Buy();
				break;
			}
			
				
		}while(choose != 4);
	}
	public void viewPets() {
		if(PetList.isEmpty()) {
			System.out.println("No Data!!");
		}
		else {
			int counter = 0;
			System.out.println("Amsal Pet Shops");
			System.out.println("-------------------------------");
			for(Pets p : PetList) {
				counter++;
				if (p instanceof Dog) {
					System.out.println("No " + counter );
					System.out.println("Pet Type      : Dog" );
					System.out.println("Pet Color     : " + p.getColor());
					System.out.println("Dog Bread     : " + ((Dog)p).getBread());
					System.out.println("Dog Age       : " + ((Dog)p).getAge());
				}
				else if (p instanceof Cat) {
					System.out.println("No " + counter );
					System.out.println("Pet Type      : Cat" );
					System.out.println("Pet Color     : " + p.getColor());
					System.out.println("Cat Fur       : " + ((Cat)p).getFur());
					System.out.println("Cat Age       : " + ((Cat)p).getAge());
				}
				else if (p instanceof Fish) {
					System.out.println("No " + counter );
					System.out.println("Pet Type      : Fish" );
					System.out.println("Pet Color     : " + p.getColor());
					System.out.println("Water Type    : " + ((Fish)p).getWaterType());
					System.out.println("Fish Size     : " + ((Fish)p).getSize());
				}
				else{
					System.out.println("No " + counter );
					System.out.println("Pet Type      : Hamsters" );
					System.out.println("Pet Color     : " + p.getColor());
					System.out.println("Hamsters Size : " + ((Hamsters)p).getSize());
					System.out.println("Hamster Weight: " + ((Hamsters)p).getWeight());
				}
				System.out.println("----------------------------");
			}
		}
		
	}
	public void AddP() {
		String type,color,bread,fur,waterType,size;
		int Bprice,age,weight;
		do {
			System.out.println("Input Pet Type [Dog|Cats|Fish|Hamsters]: ");
			type = scan.nextLine();
		}while(!(type.equals("Dog")||type.equals("Cats")|| type.equals("Fish")|| type.equals("Hamsters")));
		do {
			System.out.println("Input Pet Color                        : ");
			color = scan.nextLine();
		}while(color.length() < 1);
		do {
			System.out.println("Base Price                             : ");
			Bprice = scan.nextInt();
			scan.nextLine();
		}while(Bprice < 10000000 || Bprice > 50000000);
		if(type.contains("Dog")) {
			do {
			System.out.println("Dogs Bread                             :");
			bread = scan.nextLine();
			}while(!(bread.equals("Tackle")||bread.equals("Pitbull")||bread.equals("Golden")));
			System.out.println("Dogs Age                               :");
			age = scan.nextInt();
			scan.nextLine();
			Dog D = new Dog(color,type,Bprice,bread,age);
			PetList.add(D);
		}
		else if(type.contains("Cat")){
			do {
				System.out.println("Cats Fur[Furry|Bald]               :");
				fur = scan.nextLine();
			}while(!(fur.equals("Furry")|| fur.equals("Bald")));
			System.out.println("Cats Age                               :");
			age = scan.nextInt();
			scan.nextLine();
			Cat C = new Cat(color,type,Bprice,fur,age);
			PetList.add(C);
		}
		else if(type.contains("Fish")) {
			do {
				System.out.println("Fish Water Type                    :");
				waterType = scan.nextLine();
			}while(!(waterType.equals("Salt")||waterType.equals("Fresh")));
			do {
				System.out.println("Fish Size                          :");
				size = scan.nextLine();
			}while(!(size.equals("Regular")||size.equals("Big")|| size.equals("Small")));
			Fish F = new Fish(color,type,Bprice,waterType,size);
			PetList.add(F);
		}
		else {
			do {
				System.out.println("Hamsters Size                          :   ");
				size = scan.nextLine();
			}while(!(size.equals("Regular")||size.equals("Big")|| size.equals("Small")));
			System.out.println("Hamster Weight                        :");
			weight = scan.nextInt();
			scan.nextLine();
			Hamsters H = new Hamsters(color,type,Bprice,size,weight);
			PetList.add(H);
		}
	}
	public void Buy() {
		if(PetList.isEmpty()) {
			System.out.println("No Data!!");
		}
		else {
			int counter = 0;
			System.out.println("Amsal Pet Shops");
			System.out.println("-------------------------------");
			for(Pets p : PetList) {
				counter++;
				if (p instanceof Dog) {
					System.out.println("No " + counter );
					System.out.println("Pet Type      : Dog" );
					System.out.println("Pet Color     : " + p.getColor());
					System.out.println("Dog Bread     : " + ((Dog)p).getBread());
					System.out.println("Dog Age       : " + ((Dog)p).getAge());
					System.out.println("Price         : " + (((Dog)p).calculatetotalprice()));
					p.setBprice((((Dog)p).calculatetotalprice()));
				}
				else if (p instanceof Cat) {
					System.out.println("No " + counter );
					System.out.println("Pet Type      : Cat" );
					System.out.println("Pet Color     : " + p.getColor());
					System.out.println("Cat Fur       : " + ((Cat)p).getFur());
					System.out.println("Cat Age       : " + ((Cat)p).getAge());
					System.out.println("Price         : " + (((Cat)p).calculatetotalprice()));
					p.setBprice((((Cat)p).calculatetotalprice()));
				}
				else if (p instanceof Fish) {
					System.out.println("No " + counter );
					System.out.println("Pet Type      : Fish" );
					System.out.println("Pet Color     : " + p.getColor());
					System.out.println("Water Type    : " + ((Fish)p).getWaterType());
					System.out.println("Fish Size     : " + ((Fish)p).getSize());
					System.out.println("Price         : " + (((Fish)p).calculatetotalprice()));
					p.setBprice((((Fish)p).calculatetotalprice()));
				}
				else{
					System.out.println("No " + counter );
					System.out.println("Pet Type      : Hamsters" );
					System.out.println("Pet Color     : " + p.getColor());
					System.out.println("Hamsters Size : " + ((Hamsters)p).getSize());
					System.out.println("Hamster Weight: " + ((Hamsters)p).getWeight());
					System.out.println("Price         : " + (((Hamsters)p).calculatetotalprice()));
					p.setBprice((((Hamsters)p).calculatetotalprice()));
				}
				System.out.println("----------------------------");
			}
		}
		int choose = 0;
		do {
		System.out.printf("Choose Pet[1-%d]:",PetList.size());
		choose = scan.nextInt();
		scan.nextLine();
		}while(choose<1 || choose>PetList.size());
		choose--;
		Pets P = PetList.get(choose);
		if (P instanceof Dog) {
			System.out.println("Pet Type      : Dog" );
			System.out.println("Pet Color     : " + P.getColor());
			System.out.println("Dog Bread     : " + ((Dog)P).getBread());
			System.out.println("Dog Age       : " + ((Dog)P).getAge());
			System.out.println("Price         : " + P.getBprice());
		}
		else if (P instanceof Cat) {
			System.out.println("Pet Type      : Cat" );
			System.out.println("Pet Color     : " + P.getColor());
			System.out.println("Cat Fur       : " + ((Cat)P).getFur());
			System.out.println("Cat Age       : " + ((Cat)P).getAge());
			System.out.println("Price         : " + P.getBprice());
		}
		else if (P instanceof Fish) {
			System.out.println("Pet Type      : Fish" );
			System.out.println("Pet Color     : " + P.getColor());
			System.out.println("Water Type    : " + ((Fish)P).getWaterType());
			System.out.println("Fish Size     : " + ((Fish)P).getSize());
			System.out.println("Price         : " + P.getBprice());
		}
		else{
			System.out.println("Pet Type      : Hamsters" );
			System.out.println("Pet Color     : " + P.getColor());
			System.out.println("Hamsters Size : " + ((Hamsters)P).getSize());
			System.out.println("Hamster Weight: " + ((Hamsters)P).getWeight());
			System.out.println("Price         : " + P.getBprice());
		}
		int pay = 0;
		do {
			System.out.print("Payment : ");
			pay = scan.nextInt();
			scan.nextLine();
		}while(pay < P.getBprice());
		int change = 0;
		if(pay> P.getBprice()) {
			change = pay - P.getBprice();
		}
		System.out.println("Change : " + change);
		PetList.remove(choose);
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
