package ComparatorInterface;
import java.util.Comparator;
public class SortByEname implements Comparator 
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e1.ename.compareTo(e2.ename);
	}

}
