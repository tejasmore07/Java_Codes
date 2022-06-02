package LambdaExpressionDemo;
interface Drawable{
    public void draw();
}

public class WithLambdaExpression {
    public static void main(String[] args) {

        // with lambda
        Drawable d2 = ()-> {
            int w = 10;
            System.out.println("Drawing:"+w);
         };
        d2.draw();

    }
}
