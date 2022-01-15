package chapter15.generics;

interface  GenericGetter<T extends GenericType<T>> {
    T get();
}
//
//interface  Getter extends GenericGetter<Getter>{}
//
//public class GenericsAdnReturnTypes{
//    void test(Getter g){
//        Getter result=g.get();
//        GenericGetter gg=g.get();
//    }
//}