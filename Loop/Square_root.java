class Square_root{
public static void main(String args[]){
int no = 100,div = 2;
while(div<=no/2)
		{
		    if(no/div == div)
		    {
		    System.out.println(div + " is the square root"); 
		    break; 
		    }
		div = div+1; 
		}
		
	}

}

