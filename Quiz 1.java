// Name = osama seid
 //id= ru 2911/13



package labquiz;
 // Q1: inteface inherit multiple interface
interface AnimalEat {
	void eat();
   }
interface AnimalTravel {
	void travel();
}
class Animal implements AnimalEat, AnimalTravel {
	public void eat(){
		System.out.println("Animal is eating");
	}
	public void travel(){
		System.out.println("Animal is travelling");
	}
}
/* Q2 : Creating an instance of a java interface by itself is impossible,
        its a must to always create an instance of some class that implements the interface,
        and reference that instance as an instance of the interface.
 */
   // example for Q2:-
public interface A
{

}
public class B implements A
{
}
/* Q3 : A class can extend a class and can implement
        any number of interfaces simultaneously.
 */
class one {
	public void methodOne ()
	{

		// some functionality
	}

}
// example of a class implementing any number of interfaces simultaneously. still Q3
 interface apply {
	void methodApply ();
}
class abroad {

	public void methodAbroad ()
	{
	}

}
// class which extends the class abroad
// ad implements the interface apply
class fly extends abroad implements apply{
	public void memthodApply()
	{
		// implementation of the method

	}

}
/* Q4 : class can inherit an abstact class and implement it all abstact
methods; */
abstract class registration {

	abstract public void askName();

	abstract public void askIdno ();

	abstract public void askDepartment ();
}
// extending Abstract class and implement it abstact method;
public void askName(){System.out.println ("what is your name?");}

public void askIDNO (){System.out.println("what is your ID number?");}

public void askDepartment (){System.out.println("what is your field of study?");}

// Q5 : Interfaces can not have constructors.

class Two extends one {

	public class quiz {
		public static void main(String[] args) {
			Animal a = new animal();
			a.eat();
			a.travel();
		}

		//******** for Q2 is below code *************
		A test = new B();
		A test = new A(); //wont compile.
        // ******** for Q3 is the code below ************
		Two t = new Two ();

		//calls the method one of the above class
		t.methodOne ();
	}
}