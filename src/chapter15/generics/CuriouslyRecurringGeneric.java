package chapter15.generics;

class GenericType<T>{}

/**
 * 古怪的循环
 */
public class CuriouslyRecurringGeneric extends GenericType<CuriouslyRecurringGeneric> {
}
