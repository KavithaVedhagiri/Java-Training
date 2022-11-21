class Pattern1{
	public static void main(String[] args) {

        SixthOne();
		Seventh();
		EighthOne();
		NinethOne();
		TenthOne();
}
private static void TenthOne() {
		// TODO Auto-generated method stub
		for (int row=1;row<=5;row++) {
			for (int colum =1;colum<=5-row;colum++) {
				
				System.out.print(colum +" ");
			}
			for(int colum = 1;colum<=row;colum++) {
				System.out.print(colum +" ");
			}
			System.out.println();
		}
	}
	private static void NinethOne() {
		// TODO Auto-generated method stub
		for (int row=1;row<=5;row++) {
			for (int colum =1;colum<=5-row;colum++) {
				
				System.out.print(colum +" ");
			}
			for(int colum = 1;colum<=row;colum++) {
				System.out.print(1 +" ");
			}
			System.out.println();
		}
	}
	
	private static void EighthOne() {
		// TODO Auto-generated method stub
		for (int row=1;row<=5;row++) {
			for (int colum =1;colum<=5-row;colum++) {
				
				System.out.print(colum +" ");
			}
			for(int colum = 1;colum<=5;colum++) {
				System.out.print(1 +" ");
			}
			System.out.println();
		}
	}
	
	private static void Seventh() {
		// TODO Auto-generated method stub
				for (int row=1;row<=5;row++) {
					for (int colum =1;colum<=5-row;colum++) {
						
						System.out.print(colum +" ");
					}
					System.out.println();
				}
			}

	private static void SixthOne() {
		// TODO Auto-generated method stub
		  for (int row=5;row>=1;row--) {
			  for (int colum = row;colum>=1;colum--) {
					System.out.print(row+" ");
			  }
			  System.out.println();
		  }
	}
}
