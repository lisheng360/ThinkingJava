package chapter15.generics;

class Subtype extends BasicHolder<Subtype>{}
public class CRGWithBasicHolder {
    public static void main(String[] args) {
        Subtype st1=new Subtype(),
                st2=new Subtype();
        st1.set(st2);
        Subtype st3=st1.get();
        System.out.println(st3==st2);
        st1.f();
    }
}
