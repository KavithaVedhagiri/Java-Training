class Pattern2{
public static void main(String args[]){
        EleventhOne();
		TwelethOne();
		Thirteen();
		Fourteen();
		Fifteen();
}
private static void Fifteen() {
		// TODO Auto-generated method stub

for (int row = 1;row<=8;row++){
for(int col = 1;col<=5;col++){
	if(col==1) {
        System.out.print("* ");
        }
	else if(row+col==6||row-col==3) {
		System.out.print("* ");
	}
	else {
        System.out.print(" ");

	}
       }
        System.out.println(" ");
        {
           
        }
        }
	}
	private static void Fourteen() {
		// TODO Auto-generated method stub
		for (int row=5;row>=1;row--) {
			for(int col=row;col<=5;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	private static void Thirteen() {
		// TODO Auto-generated method stub
		for (int row=1;row<=5;row++) {
			for (int colum =1;colum<=5-row;colum++) {
				
				System.out.print(" ");
			}
			for (int colum =1;colum<=row;colum++) {
				System.out.print(row+"");
			}
			System.out.println();
		}
	}
	private static void TwelethOne() {
		// TODO Auto-generated method stub
		for (int row=1;row<=5;row++) {
			for (int colum =1;colum<=5-row;colum++) {
				
				System.out.print(" "+" ");
			}
			for(int colum = row;colum>=1;colum--) {
				System.out.print(colum +" ");
			}
			System.out.println();
		}
	}

	private static void EleventhOne() {
		// TODO Auto-generated method stub
		for (int row=1;row<=5;row++) {
			for (int colum =1;colum<=5-row;colum++) {
				
				System.out.print(" "+" ");
			}
			for(int colum = 1;colum<=row;colum++) {
				System.out.print(colum +" ");
			}
			System.out.println();
		}
	}
}
