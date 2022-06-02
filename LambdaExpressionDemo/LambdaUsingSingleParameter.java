package LambdaExpressionDemo;
interface Sayable {
    public String say(String name,String working);
}
public class LambdaUsingSingleParameter {
    public static void main(String[] args) {
        Sayable s1=(name,working)->{
            return "Hello, " + name + " It is " + working + ", Firm";
        };
        System.out.println(s1.say("Fuel Pune, ","Java Training"));

        Sayable s2=(name,working)->{
            return "Hello, "+ name+ ", It is offered" + working;
        };
        System.out.println(s2.say("Deogiri college ","B.Tech"));
    }
}
