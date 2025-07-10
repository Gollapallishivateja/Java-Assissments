class StudentInfromation
{
String studentName="shivateja";
int rollNo=505;
static String branch="CSE";
static String collageName="nnrg";
static String leader="shiva";
int marks=870;
public static void main(String args[])
{
System.out.println("-------------Static variable by direct access ------------");
System.out.println("my branch is="+branch);
System.out.println("my colage name is="+ collageName);
System.out.println( "my class leader is="+leader);
System.out.println("-------------Static variable access by class ------------");
System.out.println("my branch is="+StudentInfromation.branch);
System.out.println("my colage name is="+ StudentInfromation.collageName);
System.out.println("my class leader is="+StudentInfromation.leader);
System.out.println("-------------NON Static variable access by References ------------");
StudentInfromation obj=new StudentInfromation();
System.out.println("my rollno is="+obj.rollNo);
System.out.println("my name is="+obj.studentName);
System.out.println("my marks are="+obj.marks);
}
}