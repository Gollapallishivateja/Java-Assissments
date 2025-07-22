package com.ELCe;

public class ReturnRectangle {
	int length;
	int breath;
	public  void Values(int l, int b)
	{
		
		length=l;
		breath=b;
	}
	public String Areas()
	{
		int A=2*(length+breath);
//		System.out.println(A);
		return "the area="+A;
		
	}
	
	public String display() {
		Areas();
		return "lenght="+length+"\nbreath ="+breath+"\n"+Areas();
		
		
	}

}
