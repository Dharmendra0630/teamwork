package comparable;
import java.util.TreeSet;
public class CompableStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setAge(12);
		s1.setName("hemant");
		Student s2=new Student();
		s2.setAge(22);
		s2.setName("sonu");
		Student s3=new Student();
		s3.setAge(11);
		s3.setName("annu");
		TreeSet st=new TreeSet(new MyComparable());
		st.add(s1);
		st.add(s2);
		st.add(s3);
		System.out.println(st);
		
	}

}
