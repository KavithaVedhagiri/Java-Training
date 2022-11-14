class FindPower2{
public static void main(String args[]){
int row,colum,n;

for(row=1;row<=4;row++)
{
n=1;
 for(colum=1;colum<=row;colum++)
{
   n=n*row;
}
System.out.println(n);
}
}
}

