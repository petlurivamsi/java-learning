package AnonymousInnerClass;

public class Main {
   public static void main(String[] args) {
    Greeting g = new Greeting(){
        @Override
        public void welcome(){
            System.out.println("Yo bro");
        }
    };
    Greeting greet = new Greeting();
    greet.welcome();
    g.welcome();
   } 
}
