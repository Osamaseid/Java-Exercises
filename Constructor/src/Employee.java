
public class Employee{

    String name;
    String id;
    double salary;
   Employee(){

    System.out.println("default constructor");
    this.name=null;
    this.id=null;
    this.salary=0.0;
   }

   Employee(String name, String id){
     
    System.out.println("constructor with two parameter");
     this.name= null;
     this.id=null;
     this.salary=0.0;
   }
   Employee(String n,String id, double a ){
      this.name=null;
      this.id= null;
      this.salary=5000;
   }
 public static void main(String[] args) {
    Employee e1=new Employee();
     System.out.println("name="+e1.name);
     System.out.println("name="+e1.id);
     System.out.println("salary"+e1.salary);
    Employee e2=new Employee();
     System.out.println("name="+e2.name);
     System.out.println("name="+e2.id);
     System.out.println("salary"+e2.salary);
    Employee e3=new Employee();
     System.out.println("name="+e3.name);
     System.out.println("name="+e3.id);
     System.out.println("salary"+e3.salary);



  } 
    
  } 

