package br.com.nakatani;

public class MultiplyForOne extends Observer{

	   public MultiplyForOne(Subject subject){
	      
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Multiply for one: " + ( subject.getState() * 1 ) ); 
	   }
	}
