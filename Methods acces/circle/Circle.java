package com.elcc;

public class Circle {
 double radius;
 public void values(int n)
 {
	 radius=n;
 }
 public String  Area() {
	 double a=3.14*radius*radius;
	 return "the area of circle :"+a;
	
 }
 public String circumference() {
	 double c=2*3.14*radius;
	 return "\nthe circumference of circle :"+c;
 }
 public String display()
 { 
return Area()+"\n"+circumference();
 }
}
