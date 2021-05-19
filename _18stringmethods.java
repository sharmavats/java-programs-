import jdk.internal.jshell.tool.resources.l10n;

public class _18stringmethods {
    public static void main(String[] args) {
        String website = "programming leetcode.com";
        System.out.print("\n String is " + website);
        System.out.print("\n length of String is :" + website.length());
        System.out.print("\n String to lowercase :" + website.toLowerCase());
        System.out.print("\n String to upper case :" + website.toUpperCase());
        System.out.print("\n String character at index 4 :" + website.charAt(4));
        System.out.print("\n index of g after index 5 :" + website.indexOf('g', 5));
        System.out.print("\n substring from index 10  :" + website.substring(10));
        System.out.print("\n subtring from oth to 10th index :" + website.substring(0, 10));
        System.out.print("\n string after replacing l with c : " + website.replace('l', 'c'));
    }
}
