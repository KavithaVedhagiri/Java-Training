class Training
{
public static void main(String[] args)
{
Training train = new Training();
train.name("Devesh");
train.name("Devesh","Akshinth");
}
void name(String firstname,String lastname)//Parameter Passing
{
System.out.println(firstname+" "+lastname);
}
void name(String firstname)//Parameter Passing
{
System.out.println(firstname);
}
}
