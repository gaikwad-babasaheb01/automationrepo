package function;

public class Hospital 
{

	public String patientType;
	public String doctorsName;
	public String speciality;
	public int numOfBed;
	public int numOfDoctors;
	public String hospitalName;
	public void treatment()
	{
		System.out.println("Patients with the "+patientType+" will be send to the "+speciality+"  doctor "+doctorsName);
	}
	public void capacity()
	{
		System.out.println(hospitalName+" hospital has " +numOfBed+" beds and " +numOfDoctors+" doctors ");
	}
	// Default constructor
	public Hospital()
	{
		
	}
	//Parameterise constructor
	public Hospital(String patientType,String doctorsName,String speciality,int numOfBed, int numOfDoctors,String hospitalName)
	{
		this.patientType=patientType;
		this.doctorsName=doctorsName;
		this.speciality=speciality;
		this.numOfBed=numOfBed;
		this.numOfDoctors=numOfDoctors;
		this.hospitalName=hospitalName;
	}
}


