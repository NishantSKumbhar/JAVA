import java.util.*;


class NumberFound{
	public static void main(String args[]){
		System.out.println("Enter the Count of Numbers : ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		System.out.println("Enter the Marks -> ");
		int[] marks = new int[count];
		for(int i = 0; i < count; i++){
			marks[i] = sc.nextInt();
		}

		System.out.println("Enter the Number to Find : ");
		int num = sc.nextInt();
		int flag = 0;
		for(int i = 0; i < count; i++){
			if(marks[i] == num){
				System.out.println("Index : " + i);
				flag = 1;
				break;
			}
		}

		if(flag == 0){
			System.out.println("Not Found !");
		}
	}
}