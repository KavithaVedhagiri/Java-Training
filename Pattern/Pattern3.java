class Pattern3{
public static void main(String args[]){
         Sixteen(5);
         Seventeen(5);
		 Eighteen();
		 nineteen();
		 twenty();
}
		private static void twenty() {
		// TODO Auto-generated method stub
		for(int row = 1;row<6;row++) {
			for(int col = 0;col<row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	private static void nineteen() {
		// TODO Auto-generated method stub
		for (int row = 0;row<5;row++) {
			for(int col = row;col<5;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	private static void Eighteen() {
		// TODO Auto-generated method stub
		for (int row = 1;row<=5;row++) {
			for (int col = 1;col<=5;col++) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}
	}
	private static void Seventeen(int n) {
		// TODO Auto-generated method stub
		for (int row =0;row<2*n;row++){
			 int colsInRow = row>n?2*n-row:row;
			 int noOfSpaces = n-colsInRow;
			 for (int space = 0;space<noOfSpaces;space++) {
				 System.out.print(" ");
			 }
			 for(int col=0;col<colsInRow;col++) {
				 System.out.print("* ");
			 }
			 System.out.println();
			}
		}
	
	private static void Sixteen(int n) {
		// TODO Auto-generated method stub
		for (int row =0;row<2*n;row++) {
		 int colsInRow = row>n?2*n-row:row;
		 for(int col=0;col<colsInRow;col++) {
			 System.out.print("*");
		 }
		 System.out.println();
		}
	}
}
