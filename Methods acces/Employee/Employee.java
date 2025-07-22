package com.elc;

public class Employee {
	String name;
	int id;
	double age;
	double salary;
	public void employee( String n, int i,int a,int s) 
	{
		 
		name=n;
		id=i;
		age=a;
     	salary=s;
	}
	
	public String salary()	
	{
		double yearSalary=salary*12;
		return "yearsalary="+yearSalary;
		
	}
 
	 public String checking() 
	 {
		 String che=(age>=18)?"ELIGIBLE FOR VOTE":"NOT ELIGIBLE VOTE";
		 return che;
	 }
	 public String voting() 
	 {
		 String che=(age>=35)?" THE MAN CROSSED 35 AGE ":"NOT CROSSED 35 AGE";
		 return che;
	 }
	 public String display()
	 {
		 
//		System.out.println("name"+name);
//		System.out.println("id"+id);
//		System.out.println("age"+age);
//		System.out.println("salary"+salary);
		 salary();
		checking();
		voting();
		return "The employee name is :"+name+"\n Employee id is:"+id+" \n Age of the employee "+age+ "\nsalary of Employee"+salary;
	 }
	 
	 

}
