public class SharpTriangle {
    public SharpTriangle(int count){
        for (int i = 0; i <= count; i++)
        {
           String branch = "*".repeat(i);
           System.out.println(padLeft(branch,count) + "*" + branch);
        }
    }
    public static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }
}
