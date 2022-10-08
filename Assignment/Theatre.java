class Theatre{
public static void main(String[] ticket_pricr)
{
Theatre raja = new Theatre();
int balance_amount = raja.bookTicket(200);
System.out.println("After booking ticket balance"+" "+balance_amount);
}
int bookTicket(int ticket_booking)
{
int ticket_price = 120;
int balance_amount = ticket_booking - ticket_price;
System.out.println("balance"+" "+ balance_amount);
return balance_amount;

}
}
