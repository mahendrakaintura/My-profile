public class Search {
    
    public static boolean check(String name) {
       
        return name.matches(".*[abcdefghi].*[0-9].*7.*");
    }

    public static void main(String[] args) {
        
        String S1 = "a1234567";

        if (check(S1)) {
            System.out.println("S1 me 'a' aur '7' hai");
        } else {
            System.out.println("S1 me required pattern nahi hai");
        }
    }
}
