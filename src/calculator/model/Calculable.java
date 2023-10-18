package calculator.model;

public interface Calculable<T> {
    T summary(T t, T y);
    T subtraction(T t, T y);
    T multiplication(T t, T y);
    T division(T t, T y);
}