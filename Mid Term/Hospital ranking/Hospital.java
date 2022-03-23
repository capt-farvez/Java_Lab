package lab;

public class Hospital {
	private String name;
	private String speciality;
	private String address;
	private double rank;
	private int noOfUserRanked;
	
	public Hospital(String name, String speciality, String address, double rank, int noOfUserRanked) {
		this.name = name;
		this.speciality = speciality;
		this.address = address;
		this.rank = rank;
		this.noOfUserRanked = noOfUserRanked;
	}
	
	public double updateRank(double ran) {
		noOfUserRanked++;
		this.rank = ((rank*(noOfUserRanked-1))+ran)/noOfUserRanked;
		return rank;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}

	public int getNoOfUserRanked() {
		return noOfUserRanked;
	}

	public void setNoOfUserRanked(int noOfUserRanked) {
		this.noOfUserRanked = noOfUserRanked;
	}

	public String toString() {
		return String.format("\nHOSPITAL NAME- %s, \nHOSPITAL SPECIALITY- %s, \nHOSPITAL RANKING- %s,rank- %.2f, \nNUMBER OF USER RANKED THIS HOSPITAL- %d", name, speciality,address,rank,noOfUserRanked);
	}
	
	public void display() {
		System.out.println(this);
	}

}
