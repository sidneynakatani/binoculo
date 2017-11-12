package br.com.nakatani;

public class MultiplyForThree extends Observer{

	   public MultiplyForThree(Subject subject){
	      
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Multiply for three: " + ( subject.getState() * 3 ) ); 
	   }
	}