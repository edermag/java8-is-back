package br.com.yaw;

/**
 * Exemplo de interface funcional, define apenas um método abstrato.
 * 
 * @author eder.magalhaes
 * Código usado na palestra Java 8 - Java Is Back
 */
@FunctionalInterface
public interface Action<T, R> {

	R execute(T t);

}
