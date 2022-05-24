package JAVA;

class Pattern {
	int i, j;
	int n = 6;

	public void square() {
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		}
	
	
	public void tringle1()
	{
		for(i=1;i<n;i++) {
			
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void tringle2()
	{
		for(int i=0;i<n;i++)
	      {
	          for(int k=i;k<n;k++)
	          System.out.print("  ");
	 
	          // We run loop till j = 2*i to print odd no. of stars.
	          for(int j=0;j<=2*i;j++)
	          {
	            // We print '*' for each row.
	            System.out.print("* ");
	          }
	 
	          System.out.println();
	      }
	}
}

public class StarCode {
	public static void main(String[] args) {
		Pattern pattern = new Pattern();
		pattern.square();
		
		System.out.println("---------------------------------------------");
		pattern.tringle1();
		
		System.out.println("---------------------------------------------");
		pattern.tringle2();
		
	}
}
