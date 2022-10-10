class Training2
{
public static void main(String[] args)
{
Training2 train = new Training2();
train.name("Devesh");
train.name("Devesh","Akshinth");
train.name("Devesh","Akshinth", 0.3f);
}
void name(String firstname,String lastname,float age)//Parameter Passing
{
System.out.println(firstname+" "+lastname+" "+age);
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
