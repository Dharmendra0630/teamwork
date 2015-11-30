package comparable;
import java.util.Comparator;
public class MyComparable implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getAge()-o1.getAge();
	}

}
