public class At{
    public static void main(String[] args){
        String S1 = "java and javascript and java";
        String S2 = "hello";
        if(S1.contains("java")){
            System.out.println("S1 ke andar java hai");
        }
        if(S1.endsWith("java")){
            System.out.println("s1 java ke last me hai");
        }
        System.out.println(S1.indexOf("java"));
        System.out.println(S1.lastIndexOf("java"));
        System.out.println(S1.indexOf("gshfhfk"));
        System.out.println("s2 ke 4 me hai : " + S2.substring(3));
        System.out.println("s2 ke 4 me hai : " + S2.substring(0,3));
        
    }
}