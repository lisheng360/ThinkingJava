package chapter15.generics;

/**
 * 自限定
 * 保障类型参数必须与正在被定义的类相同
 * @param <T>
 */
class SelfBounded<T extends  SelfBounded<T>> {
    T elemnet;
    SelfBounded<T> set(T arg){
        elemnet=arg;
        return this;
    }
    T get(){return elemnet;}
}
class  A extends SelfBounded<A>{}

class B extends SelfBounded<A>{}

class C extends SelfBounded<C>{
    C setAndGet(C arg){
        set(arg);
        return get();
    }
}
class D{}
//class  E extends  SelfBounded<D>{}//抛异常

//非强制传入泛型
class F extends SelfBounded{}

public class SelfBounding{
    public static void main(String[] args) {
        A a=new A();
        a.set(new A());
        a=a.set(new A()).get();
        a=a.get();
        C c=new C();
        c=c.setAndGet(new C());
        F f=new F();
    }
}
