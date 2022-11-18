public class Pattern {

	public static void main(String[] args) {
		FirstOne();
		SecoundOne();
		ThirdOne();
		FourthOne();
		FifthOne();
}
     public static void FifthOne() {
		// TODO Auto-generated method stub
		for(int row = 5;row>=1;row--) {
			for(int colum = row;colum>=1;colum--) {
				System.out.print(colum+" ");
			}
			System.out.println();
		}
	}
	public static void FourthOne() {
		// TODO Auto-generated method stub
		for (int row=1;row<=5;row++) {
			for (int colum =row;colum<=5;colum++) {
				 System.out.print(colum +" ");
			}
			System.out.println();
		}
	}
	
	 public static void ThirdOne() {
		// TODO Auto-generated method stub
		for (int row=1;row<=5;row++) {
			for (int colum =1;colum<=6-row;colum++) {
				
				System.out.print(row*colum +" ");
			}
			System.out.println();
		}
	}

		
	public static void SecoundOne() {
		// TODO Auto-generated method stub
		for (int row=1;row<=5;row++) {
			for (int colum =5;colum>=row;colum--) {
				
				System.out.print(row +" ");
			}
			System.out.println();
		}
	}
		

	
	 public static void FirstOne() {
		// TODO Auto-generated method stub
		for (int row=5;row>=1;row--) {
			for (int colum =1;colum<=row;colum++) {
				
				System.out.print(colum +" ");
			}
			System.out.println();
		}
	}
}
	
