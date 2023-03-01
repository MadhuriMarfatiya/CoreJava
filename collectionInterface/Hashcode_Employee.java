package in.co.collectionInterface;

public class Hashcode_Employee {
	
	public String name=null;
	public String address=null;
	
	public Hashcode_Employee(String name,String address) {
		this.name=name;
		this.address=address;
	}



	@Override
	public String toString() {
		return name+ " "+address;
		
	}

	
	public boolean equals(Hashcode_Employee obj) {
	if(this.name==obj.name && this.address==obj.address) {
		return true;
	}else {
		return false;
		}
	
	}	
	

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
