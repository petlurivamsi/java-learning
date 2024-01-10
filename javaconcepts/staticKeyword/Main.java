package javaconcepts.staticKeyword;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Vamsi");
        Friend friend2 = new Friend("Micky Mouse");
        Friend friend3 = new Friend("Squidword");
        // System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
    }
}
