package LambdaExpressionDemo;

interface StingFunction{
    String run(String s);
}
public class LambdaWithString {
    public static void main(String[] args) {
        StingFunction ex =(s) -> s + "!";
        StingFunction ex1=(s) -> s + "?";
        PrintFormatted("Hello", ex);
        PrintFormatted("Hello", ex1);
    }
    public static void PrintFormatted(String ex,StingFunction format) {
        String result = format.run(ex);
        System.out.println(result);
    }
}
