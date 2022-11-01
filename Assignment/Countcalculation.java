class Countcalculation{
public static void main(String args[]){
Countcalculation coun = new Countcalculation();
coun.dosai();
}
public void dosai(){ 
int dosai = 8;
int count = 1;
   while(count<=3){
    dosai = dosai+dosai/2;
    count++;
}
System.out.println("Total Number of dosai"+" "+dosai);
}
}
