package function;

public class Pateints {

	public static void main(String[] args) {

		Hospital hst1=new Hospital();
		hst1.hospitalName="Nobel";
		hst1.patientType="Bone injury";
		hst1.speciality="Orthopedic";
		
		hst1.doctorsName= "Dr. Sharma";
		hst1.numOfBed =100;
		hst1.numOfDoctors=10;
		hst1.treatment();
		
		hst1.capacity();
		
		Hospital hst2=new Hospital();
		hst2.hospitalName="Columbia Asia";
		hst2.patientType="Cancer";
		hst2.speciality="Oncologist";
		hst2.doctorsName= "Dr. Batra";
		hst2.numOfBed =50;
		hst2.numOfDoctors=15;
		hst2.treatment();
		hst2.capacity();
		
		Hospital hst3= new Hospital("Tooth Ache","Manohar","Dentist",1000,100,"city Hospital");
		hst3.treatment();
		hst3.capacity();
		

	}

}
