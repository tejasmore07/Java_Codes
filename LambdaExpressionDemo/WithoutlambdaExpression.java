package LambdaExpressionDemo;

interface Drawable1{
    public void draw();
}

public class WithoutlambdaExpression implements Drawable {

    public void draw() {
        int width = 10;
        System.out.println("Drawing:" + width);
    }
}
class Abc {

    public static void main(String[] args) {

        WithoutlambdaExpression d = new WithoutlambdaExpression();

        d.draw();
    }
}
