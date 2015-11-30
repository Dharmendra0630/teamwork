package comparable;
public class ComExample implements Comparable<ComExample>{
private int rno;
private String name;
private String surname;
ComExample(int rno,String name,String surname){
	this.rno=rno;
	this.name=name;
	this.surname=surname;
}
public String toString(){
	return rno+" "+name+" "+surname;
}
@Override
public int compareTo(ComExample o) {
	return this.name.compareTo(o.name);
}

	
}