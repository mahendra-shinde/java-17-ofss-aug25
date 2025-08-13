# Lambda Expressions and Method References

## What are Lambda Expressions?

Lambda expressions are a feature in Java (introduced in Java 8) that allow you to write anonymous functions (functions without a name) in a concise way. They are mainly used to provide implementations for functional interfaces (interfaces with a single abstract method).

**Syntax:**
```java
(parameters) -> expression
// or
(parameters) -> { statements }
```

## Why use Lambdas?
- To write cleaner, more readable code
- To pass behavior as a parameter (functional programming)
- To simplify code that uses interfaces like Runnable, Comparator, etc.

## Example: Using Lambda with Banking Domain (Account)

Suppose you have an `Account` class and want to filter accounts based on some criteria (e.g., balance).

```java
import java.util.*;
import com.mahendra.bank.Account;

List<Account> accounts = ...; // Assume this is populated

// Find all accounts with balance > 10,000 using lambda
accounts.stream()
	.filter(acc -> acc.getBalance() > 10000)
	.forEach(acc -> System.out.println(acc.getHolderName()));
```

---

## Functional Interface Example

Suppose you want to define a way to calculate interest for different account types:

```java
@FunctionalInterface
interface InterestCalculator {
	double calculate(double principal, double rate, int months);
}

// Using Lambda
InterestCalculator simpleInterest = (p, r, m) -> p * r * m / 1200;
System.out.println(simpleInterest.calculate(10000, 7.5, 12));
```

---

## Method References

Method references are a shorthand notation of lambdas to call a method directly.

**Syntax:**
- `ClassName::staticMethod`
- `object::instanceMethod`
- `ClassName::new` (constructor reference)

### Example: Printing Account Holders

```java
accounts.forEach(System.out::println); // prints Account objects (toString)
accounts.forEach(acc -> System.out.println(acc.getHolderName())); // using lambda
accounts.forEach(Account::getHolderName); // method reference (won't print, but returns name)
```

### Example: Sorting Accounts by Balance

```java
accounts.sort(Comparator.comparing(Account::getBalance));
```

---

## More Banking Examples

### Transferring Money with Lambda

Suppose you want to perform an action after a transaction:

```java
interface TransactionAction {
	void execute(Account from, Account to, double amount);
}

// Lambda to print a message after transfer
TransactionAction notify = (from, to, amt) ->
	System.out.println("Transferred " + amt + " from " + from.getHolderName() + " to " + to.getHolderName());

// Usage in code
notify.execute(acc1, acc2, 5000);
```

---

## Summary Table

| Feature            | Lambda Example                        | Method Reference Example         |
|--------------------|---------------------------------------|----------------------------------|
| Runnable           | `() -> System.out.println("Hi")`      | `System.out::println`            |
| Comparator         | `(a, b) -> a.getBalance()-b.getBalance()` | `Account::getBalance`           |
| Custom Interface   | `(a, b, c) -> ...`                    | `ClassName::methodName`          |

---

## Practice Exercise

1. Write a lambda to find all accounts with balance less than 5000.
2. Use a method reference to print all account numbers.
3. Create a functional interface to calculate annual interest and implement it using a lambda.

---

**References:**
- [Java Lambda Expressions (Oracle)](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)
- [Method References (Oracle)](https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html)

