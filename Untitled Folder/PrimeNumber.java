class PrimeNumber{
public static void main(String args[]){
int number = 2;
int number1 = 10;
int row,colum;
for(row=2;row<=10;row++){ 
for(colum=2;colum<=row;colum++)
{
if(row%colum==0)
break;
}
if(row==colum)
System.out.println(colum);
}
}
}


