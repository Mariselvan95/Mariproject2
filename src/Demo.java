import java.util.ArrayList;
import java.util.List;

public class Demo {
	int i;
public static void main(String[] args)
{
	int i;
	List<Integer> li=new ArrayList<Integer>();
	li.add(1);
	li.add(2);
	li.add(3);
	li.add(4);
	li.add(2);
	li.add(5);
	li.add(6);
	li.add(2);
	li.add(7);
	li.add(2);
	System.out.println(li);
	
	for(i=0;i<li.size();i++)
	{
		if(li.get(i)==2)
	{
	System.out.println("index of 2 is " +i);
	li.set(i,20);

		}
		else
		{
			continue;
		}
	}
		
		System.out.println("Array List after Replacement= "+li);

}

}
