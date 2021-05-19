import java.util.StringTokenizer;
public class _19stringtokenizer {
    static String str = "hello java programmers";// static variable outside main method
    public static void main(String[] args) {
        
        StringTokenizer st = new StringTokenizer(str," ");//separted by space 
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.print(token + "\n");
        }
    }
}
