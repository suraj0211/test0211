package hieraricakl_inheritance;

public class sub_class_02 extends super_class 
{
	public static void m2()
	{int star=1;
	int space=4;
		for(int a=1;a<=4;a++)
		{
			for(int b=1;b<=star;b++) 
			{
				System.out.print("*");
			}
			for(int c=1;c<=space;c++)
			{
				System.out.print(" ");
			}
			System.out.println("");
			star++;
			space--;
		}
		
	}

}
