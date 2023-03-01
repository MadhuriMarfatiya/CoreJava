package in.co.collectionInterface;

import java.util.Comparator;

public class Comparator_Employee implements Comparable<Comparator_Employee> {
public String name=null;
public String address=null;
public String dateOfBirth=null;

public Comparator_Employee(String name,String address,String DateOfBirth) {
	this.name=name;
	this.address=address;
	this.dateOfBirth=dateOfBirth;
}

@Override
public String toString() {
	return name + " "+address +" "+dateOfBirth;
}




@Override
public int compareTo(Comparator_Employee o) {
	if(this.name==o.name && this.address==o.address) {
	return this.name.compareTo(o.address);
	}
	else {
	return this.name.compareTo(o.name);
}}


public boolean equals(Comparator_Employee obj) {
	if(this.name==obj.name && this.address==obj.address && this.dateOfBirth==obj.dateOfBirth) {
		return true;
	}else {
		return false;
	}
}
}
