public class Main {
	public static void main(String[] args) {
		
       BankAccount acct1 = new BankAccount(1000 , -1000 , "Lisa");
       System.out.println(acct1);
        
       BankAccount acct2 = new BankAccount(1000 , -1000 , "Bob");
       System.out.println(acct2);
       
       boolean success = acct1.transfer(acct2, 500);
       System.out.println("transfer success = " + success + "\n");
       System.out.println(acct1);
       System.out.println(acct2);
       
       boolean success2 = acct1.transfer(acct2, 1600);
       System.out.println("transfer success = " + success2 + "\n");
       System.out.println(acct1);
       System.out.println(acct2);
       
       System.out.println("");
       
       Rectangle rec1 = new Rectangle(2,5);
       Rectangle rec2 = new Rectangle(4,3);
        
       System.out.println(rec1.toString());
       rec1.draw();
        
       System.out.println(rec2.toString());
       rec2.draw();
        
       rec1.scale(2);
        
       int total_area = rec1.calcArea() + rec2.calcArea();
       System.out.println("Sum of areas: " + total_area);
        
       int total_peri = rec1.calcPerimeter() + rec2.calcPerimeter();
       System.out.println("Sum of perimeters: " + total_peri);
        
    }

}
