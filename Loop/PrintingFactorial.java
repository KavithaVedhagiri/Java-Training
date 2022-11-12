class PrintingFactorial{
public static void main(String args[]){
int num=5,no=num;
while(no>0){
int fact = 1;
		while(num>0){
		fact = fact*num;
		num--;
		}
		System.out.println(fact);
		no--;
		num = no;
		}
		}
		}
