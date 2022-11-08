class Strongnumber{
public static void main(String args[]){
int originalNum,rem,fact,strong=1,sum=0;
       int num = 145;
        originalNum=num;
        while (num>0)//145>0  14>0 1>0
        {
              rem=num%10;
            fact=1;
            for(strong=1;strong<=rem;strong++){
                fact*=strong;//fact=fact*i
            }
            sum+=fact;
            num=num/10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is STRONG NUMBER");
        } else {
            System.out.println(originalNum + " is not a STRONG NUMBER");
        }
    }
}
 
