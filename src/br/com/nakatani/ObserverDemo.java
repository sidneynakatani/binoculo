package br.com.nakatani;

public class ObserverDemo {
	
	   public static void main(String[] args) {
	      Subject subject = new Subject();

	      new MultiplyForOne(subject);
	      new MultiplyForTwo(subject);
	      new MultiplyForThree(subject);

	      System.out.println("Multiply for 3");	
	      subject.setState(3);
	    
	   }
	}
