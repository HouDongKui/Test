package ceshi;

public class d {
	public static int ss() {
		try {
			System.out.println("2");
			//int a=1/0;
			return 1;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("error");
		}finally {
			System.out.println("end");
			
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		int i=ss();
		System.out.println(i);
	}
	

}
