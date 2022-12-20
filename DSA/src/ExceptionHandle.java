
public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 23;
		try {
			int i = a / 0;
			System.out.println("This is after the exception statemenr");
		}
		catch(Exception e) {
			System.out.println("Exception : " + e.getLocalizedMessage());
		}
		
		
		System.out.println("And Still this is Exicuting.......");
			

	}

}
