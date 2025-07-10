public class Collage{
static String collageName="Nnrg";
String studentName="Shivateja";
static int noOfEmployess=20;
String classLeader="Shiva";
int classroomNumber=12;
public static void main(String args[])
{
System.out.println(collageName);
System.out.println(noOfEmployess);
System.out.println("..........Access by class................");
System.out.println(Collage.collageName);
System.out.println(Collage.noOfEmployess);
System.out.println("..........Access by reference................");
Collage obj=new Collage();
System.out.println(obj.studentName);
System.out.println(obj.classLeader);
System.out.println(obj.classroomNumber);


}
}



