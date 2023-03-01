package in.co.collectionInterface;

public class Employee_ToString {

	public String name=null;
	public String address=null;
	
	public Employee_ToString() {}
	
	public Employee_ToString(String name,String address){
		this.name=name;
		this.address=address;
	}

	
	  @Override public String toString() { return name+ " " +address; }

	public boolean equals(Employee_ToString obj) {
		if(this.name==obj.name && this.address==obj.address) {
			return true;
		}else {
			return false;
		}
		
	}
	 
	  
	
	
	
}
