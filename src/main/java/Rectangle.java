public class Rectangle {
	
	private int width;
	private int length;
	
	 public Rectangle (int width, int length)
	 {
		 this.width = width;
	     this.length = length;
	 }
	 
	 public void draw()
	 {
		 for (int i = 0; i < length ; i++)
		 {
			 for (int j =0; j< width ; j++)
			 {
				 System.out.print("*");
			 }
			 
			 System.out.println("");
		 }
		 System.out.println("");
	 }
	 
	 public int calcArea()
	 {
		return width * length ;
	 }
	 
	 public int calcPerimeter()
	 {
		 return (2*width)+(2*length);
	 }
	 
	 public void scale(int factor)
	 {
		 this.width *= factor;
		 this.length *= factor;
		 
	 }
	 
	 
	 public String toString() 
	 {
         return "width: : " + width + "\n" + "length: " + length ;
	 }
	 
}
