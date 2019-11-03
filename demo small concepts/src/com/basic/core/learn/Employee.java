class Employee{
    int id;
    String name;
    float salary;
    static int count;
    
    static{
        System.out.println("inside static block");
       count=1;
    }
    public static void objectCreate(){
        count++;
       //id=102;
    }
    public void set(int id,String n,float s){
        id=id;
        name=n;
        salary=s;
        //count=0;
        display();
        dispObjects();
    }
    public void display(){
         System.out.println("id:  "+id+" name: "+name+" salary: "+salary);
    }
    public static void dispObjects(){
        System.out.println("count= "+count);
      //  //display();
    }
    
     public static void main(String [] args){
     System.out.println("inside the main function");
     Employee e1 = new Employee();
     Employee.objectCreate();
     Employee e2 = new Employee();
     Employee.objectCreate();
     Employee e3 = new Employee();
     Employee.objectCreate();
     display();
     dispObjects();
     //e2.dispObjects();
     //e3.dispObjects();
    }
}