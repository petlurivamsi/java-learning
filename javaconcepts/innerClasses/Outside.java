package innerClasses;

public class Outside {
    String x = "Hello ";
    public class Inside{
        String y="World";
        public void greet(){
            System.out.println(x+y);
        }
    }

}
