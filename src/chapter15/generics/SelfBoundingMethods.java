package chapter15.generics;

/**
 * 自限定用于泛型方法
 */
public class SelfBoundingMethods {
    static <T extends  SelfBounded<T>> T f(T arg){
        return arg.set(arg).get();
    }

    public static void main(String[] args) {
        A a=f(new A());
        //C3 c3=f(new C3());无法实现，C3未继承SelfBounded<>
    }
}
class C3{}
