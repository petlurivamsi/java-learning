package Generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'a','e','i','o','u'};
        String[] strArray = {"Vamsi","Sravya","Mummy","Daddy"};
        displayArray(intArray);
        System.out.println(getFirstEl(intArray));
        System.out.println(getFirstEl(doubleArray));
        System.out.println(getFirstEl(charArray));
        System.out.println(getFirstEl(strArray));
        // displayArray(doubleArray);
      
    }
    public static <Thing> void displayArray(Thing[] array){
        for(Thing element: array){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirstEl(Thing[] array){
            return array[0];
    }

   }
