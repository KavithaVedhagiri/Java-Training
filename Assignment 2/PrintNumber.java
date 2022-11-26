//Print numbers which have 5 in them from 1 to 100. 
//Eg. 5 15 25 35 45 50 51 52 53 54 55 56 56 57 58 59 65 75 85 95
class PrintNumber{
	public static void main(String[] args) {
int num = 1;
		while(num<=100) {
			if(num%10==5||num/10==5) 
				System.out.println(num);
				num++;
			}
}

}
