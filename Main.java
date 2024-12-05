public class Main{
    public static void main(String[]args){
        String S1 = "javascrpt";
        String S2 = "Java";
        String S3 = "java";
        String s4 = "";
        if(S1.equals("javascript")){
            System.out.println("S1 ke andar javascript word hai");
            
        }
        else{
            System.out.println("usko anar kuch aur word hai");
        }
        if (S2.equals(S3)){
            System.out.println("s2:s3------> equal");
        }
        else
        {
            System.out.println("S2:S3-----> not equal");
        }
        if(S2.equalsIgnoreCase(S3)){
            System.out.println("same if letter not distinguised");
        }
        if(s4.isEmpty())
        {
            System.out.println("s4 ke andar kuch nahi hai");
        }
        System.out.println("S1 ke andar ka word ka length hai " + S1.length());
    }
}