package br.com.nakatani;

public class MultiplyForTwo extends Observer{

	   public MultiplyForTwo(Subject subject){
	      
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Multiply for two: " + ( subject.getState() * 2 ) ); 
	   }
	}