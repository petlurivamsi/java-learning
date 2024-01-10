package javaconcepts.superKeywordEx1;

public class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name+" "+this.age+" in Person class";
    }
}
