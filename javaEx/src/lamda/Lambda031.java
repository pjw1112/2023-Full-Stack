package lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda031 {
	public static void main(String[] args) {

		System.out.println(" 1. Consumer<T> 받는 용도 - accept ");
		// void java.util.function.Consumer.accept(T t)
		Consumer<String> consumer = t -> System.out.println("hello " + t);
		consumer.accept("jin woo");
		consumer.accept("hi");
		System.out.println();

		System.out.println(" 2. Supplier<T> 제공 용도 - get ");
		// T java.util.function.Supplier.get()
		Supplier<String> supplier = () -> "hello :D";
		System.out.println(supplier.get());
		System.out.println();

		System.out.println(" 3. Predicate<T> 판단 용도 - test ( true / false ) ");
		// boolean java.util.function.Predicate.test(T t)
		Predicate<Integer> predicate = t -> t > 0;
		System.out.println(predicate.test(-1));
		System.out.println();

		System.out.println(" 4. Function<T,R> 처리 용도 - apply #  ");
		// R java.util.function.Function.apply(T t)
		Function<String, Integer> function = t -> t.length();
		System.out.println(function.apply("안녕하세요"));

		System.out.println(" 5. Operator<T> 연산 용도 - apply  ");
		// int java.util.function.IntBinaryOperator.applyAsInt(int left, int right)
		IntBinaryOperator operator = (left, right) -> left > right ? left : right;
		System.out.println(operator.applyAsInt(10, 11));

	}
}

/*
 * 1. Consumer<T> 받는 용도 - accept 2. Supplier<T> 제공 용도 - get 3. Predicate<T> 판단
 * 용도 - test ( true / false ) 4. Function<T,R> 처리 용도 - apply # 5. Operator<T> 연산
 * 용도 - apply
 */
