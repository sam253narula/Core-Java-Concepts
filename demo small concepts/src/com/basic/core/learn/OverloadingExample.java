
//write a program to overload add method which adds 2 integers, 2 floats,2 strings
class OverloadingExample{
    public static int add(int a, int b){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }
    public String add(String a, String b){
        return a+" "+b;
    }
    public static void main(String[] args){
        int result = add(2,3);
        System.out.println("Result is: "+result);
        OverloadingExample oe = new OverloadingExample();
        String concat = oe.add("Hello","Java");
        System.out.println("Resultant String is: " +concat);
        float results = oe.add(2.11f,5.9876f);
        System.out.println("results"+results);
    }
}