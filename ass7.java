//Parent Class
class ComputerProfessional{
	protected String EName,Prospect;
	protected float DutyHours;
	
	ComputerProfessional(String a,float b,String d){
		EName=a;
		Prospect=d;
		DutyHours=b;
	}
	void Display(){
		System.out.println(" The Details Are : ");
		System.out.println(" Employee Name : "+ EName);
		System.out.println(" Prospect Level : "+ Prospect);
		System.out.println(" DutyHours : "+ DutyHours);
	}
	
}
//Child Class
class Developer extends ComputerProfessional{
	protected float StudyHours;
	
	Developer(String a,float b,String d,float e){
		super(a,b,d);
		this.StudyHours=e;
	}
	
	void Display(){
		super.Display();
		System.out.println(" Daily StudyHours : "+StudyHours);
	}
}
class NetworkAdmin extends ComputerProfessional{
	protected float PracticeHours;
	
	NetworkAdmin(String a,float b,String d,float f){
		super(a,b,d);
		this.PracticeHours=f;
	}
	void Display(){
		super.Display();
		System.out.println(" Daily StudyHours : "+PracticeHours);
	}
}
class DataOperator extends ComputerProfessional{
	protected float TypingSpeed;
	
	DataOperator(String a,float b,String d,float t){
		super(a,b,d);
		this.TypingSpeed=t;
	}
	void Display(){
		super.Display();
		System.out.println(" Typing Speed : "+TypingSpeed);
	}
}
//Sub-Child Class
class JavaProfessional extends Developer{
	protected String ProficiencyLevel;
	
	JavaProfessional(String a,float b,String d,float e,String p){
		super(a,b,d,e);
		this.ProficiencyLevel=p;
	}
	void Display(){
		super.Display();
		System.out.println(" Proficiency Level : "+ ProficiencyLevel);
	}
}
class PythonProfessional extends Developer{
	protected String ProficiencyLevel;
	
	PythonProfessional(String a,float b,String d,float e,String p){
		super(a,b,d,e);
		this.ProficiencyLevel=p;
	}
	void Display(){
		super.Display();
		System.out.println(" Proficiency Level : "+ ProficiencyLevel);
	}
}

public class ass5 {
	public static void main(String[] args) {
		System.out.println("\n** For Network Admin ** ");
		NetworkAdmin n1 = new NetworkAdmin("ABC",7,"Fair",4);
		n1.Display();
		
		System.out.println("\n** For Data Operator **");
		DataOperator d1 = new DataOperator("EFG",9,"Good",2);
		d1.Display();
		
		System.out.println("\n** For Java Professional ** ");
		JavaProfessional j1=new JavaProfessional("MNO",12,"Good",5,"Intermediate");
		j1.Display();
		
		System.out.println("\n** For Python Professional **");
		PythonProfessional p1=new PythonProfessional("XYZ",15,"Excellent",6,"Pro");
		p1.Display();
		
		

	}

}