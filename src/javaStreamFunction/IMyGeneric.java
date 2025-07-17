package javaStreamFunction;

public interface IMyGeneric <T,U,R> {// at the time of implementation define the type of parameters and return type
  
	public abstract R print(T t, U u);
}
