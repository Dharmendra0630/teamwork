package comparable;
import java.util.Arrays;
public class Execute{
public static void main(String[] args) {
		ComExample c[]=new ComExample[3];
		c[0]=new ComExample(333,"vinod","tivari");
		c[1]=new ComExample(303,"hemant","tivari");
		c[2]=new ComExample(233,"naveen","tivari");

	Arrays.sort(c);

	for(ComExample e:c){
		System.out.println(e.toString());
	}
	
}
}