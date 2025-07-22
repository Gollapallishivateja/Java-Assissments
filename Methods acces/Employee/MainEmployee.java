ppackage com.elc;

public class MainEmployee {
	public static void main(String args[])
	{
		Employee E = new Employee();
	    E.employee("shiva",23,21,40000);
	   
		System.out.println(E.display());
		 System.out.println(E.salary());
		    System.out.println(E.checking());
		    System.out.println(E.voting() );
		
	}

} 

