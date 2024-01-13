package Generics.GenericClass;

public class Main {
    public static void main(String[] args) {
        MyGenericClass<Integer,Integer> myInt = new MyGenericClass<Integer,Integer>(1,9);
       System.out.println(myInt.returnValue());
        // MyDoubleClass myDouble = new MyDoubleClass(1);
        // MyCharClass myChar = new MyCharClass(1);
        // MyStringClass myStr = new MyStringClass(1);
    }
}
