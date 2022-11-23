import java.util.*;


class StringUse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		// String name = sc.next();
		// System.out.println("HI ," + name);

		// System.out.println("777777777777777777");
		String fullName = sc.nextLine();
		System.out.println("HI ," + fullName);
		String name = "my name is khan";
		System.out.println(name.length());

		for(int i = 0; i < name.length(); i++){
			System.out.println(name.charAt(i));
		}

		String name3 = "Blue";
		String name4 = "Sky";

		if(name3.compareTo(name4) == 0){
			System.out.println("Strings are Equal !");
		}else{
			System.out.println("Not Equal.");
		}
		
		String newName = name.substring(1, 5);
		System.out.println(newName);

		// Strings are Immutable i.e can not change

	}
}