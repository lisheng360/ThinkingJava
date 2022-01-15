package chapter15.generics;

/**
 * 协变参数类型
 */

class Base{}
class Derived extends Base{}
interface OrdinaryGetter{
    Base get();
}
//接口继承接口
interface DerivedGetter extends OrdinaryGetter{
    @Override
    Derived get();//不加Override报错
}
public class CovariantReturnTypes {
    void test(DerivedGetter d){
        Derived d2=d.get();
    }
}
