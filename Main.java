public class Main
{
    public static int findSubstring(String S1 , String S2)
    {
        return S2.indexOf(S1);
    }
    public static void main(String[] args)
    {
        String S1 = "for";
        String S2 = "geeksandforgeeks";
        System.out.println(findSubstring(S1,S2));
    }
}