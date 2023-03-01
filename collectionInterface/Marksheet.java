package in.co.collectionInterface;

public class Marksheet implements Comparable<Marksheet>{

	public String rollNo;
	public String name;
	public int marks;
	
	public Marksheet(String rollNo,String name,int marks) {
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	public int compareTo(Marksheet m) {
		return rollNo.compareTo(m.rollNo);}
	public String toString() {
		
		return rollNo+ ","+name+","+marks;
	}
	
}
