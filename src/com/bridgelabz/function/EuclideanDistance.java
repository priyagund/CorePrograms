package com.bridgelabz.function;

public class EuclideanDistance 
{
	
   public static void main(String[] args) 
   {
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	
	EuclideanDistance ed=new EuclideanDistance();
	ed.calDistance(x,y);
   }
   
   public static void  calDistance(int x,int y)
   {
	   double Distance;
	   Distance=(Math.pow(x, 2)+Math.pow(y, 2));
	    
	   System.out.println("distance of point("+x+", "+y+")from origin (0,0)is" +Math.sqrt(Distance));
	   
   }
 
}
