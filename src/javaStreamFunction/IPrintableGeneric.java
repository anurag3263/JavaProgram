package javaStreamFunction;

@FunctionalInterface
public interface IPrintableGeneric<T> { // at the time of implementation define the type

	abstract public void print(T t); // Accept one parameters and return nothing

}
