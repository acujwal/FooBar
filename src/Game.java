
public class Game {

	 public static void main(String[] args) {
	       
	        fooBar(50);

	    }

	    private static void fooBar(int num)
	    {
	        for (int i = 1; i <= num; i++)
	        {
	            if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 5 & 7
	                System.out.println("Foo Bar");
	            else if ((i % 3) == 0) // Is it a multiple of 3
	                System.out.println("Foo");
	            else if ((i % 5) == 0) // Is it a multiple of 5
	                System.out.println("Bar");
	            else
	                System.out.println(i); // Not a multiple of 5 or 7
	        }
	    }
	}

