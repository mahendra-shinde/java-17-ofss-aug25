# Java Collection Framework: Banking Domain Examples

## 1. Introduction
The Java Collection Framework provides a set of interfaces and classes to store and manipulate groups of data. It is widely used in real-world applications, including banking systems for managing accounts, transactions, and customers.

## 2. Collection Interfaces

### List
- An ordered collection (sequence) that allows duplicate elements.
- Elements can be accessed by their integer index (position in the list).

### Set
- A collection that does not allow duplicate elements.
- No guarantee of order (except for some implementations).

## 3. Implementations

### ArrayList
- Resizable array implementation of the List interface.
- Fast random access, slower insertions/removals in the middle.
- **Example (Banking Domain):**
	```java
	import java.util.*;
	class Account {
		String accountNumber;
		double balance;
		Account(String acc, double bal) { accountNumber = acc; balance = bal; }
		public String toString() { return accountNumber + ": " + balance; }
	}
	List<Account> accounts = new ArrayList<>();
	accounts.add(new Account("1001", 5000));
	accounts.add(new Account("1002", 7000));
	System.out.println(accounts);
	```

### LinkedList
- Doubly-linked list implementation of the List interface.
- Good for frequent insertions/removals.
- **Example (Banking Domain):**
	```java
	List<Account> transactionHistory = new LinkedList<>();
	transactionHistory.add(new Account("1001", 2000));
	transactionHistory.add(new Account("1001", 2500));
	System.out.println(transactionHistory);
	```

### HashSet
- Implements the Set interface, backed by a hash table.
- No duplicate elements, no guaranteed order.
- **Example (Banking Domain):**
	```java
	Set<String> customerIds = new HashSet<>();
	customerIds.add("C001");
	customerIds.add("C002");
	customerIds.add("C001"); // Duplicate, will not be added
	System.out.println(customerIds);
	```

### SortedSet (TreeSet)
- A Set that maintains elements in a sorted order.
- Implemented by TreeSet.
- **Example (Banking Domain):**
	```java
	import java.util.*;
	SortedSet<Double> balances = new TreeSet<>();
	balances.add(5000.0);
	balances.add(2000.0);
	balances.add(7000.0);
	System.out.println(balances); // Output: [2000.0, 5000.0, 7000.0]
	```

---

## 4. Generic Collections vs Raw Collections

- **Generic Collections**: Type-safe, prevent runtime ClassCastException, and provide compile-time checking.
	```java
	List<Account> accounts = new ArrayList<>(); // Only Account objects allowed
	accounts.add(new Account("1003", 9000));
	```
- **Raw Collections**: No type safety, can store any Object, may cause runtime errors.
	```java
	List rawList = new ArrayList();
	rawList.add(new Account("1004", 8000));
	rawList.add("Not an account"); // Allowed, but dangerous
	```

---

## 5. Sorting Collections

- Collections can be sorted using `Collections.sort()` for lists or by using `TreeSet` for sets.
- Custom sorting can be done by implementing `Comparable` or providing a `Comparator`.
- **Example: Sorting Accounts by Balance**
	```java
	import java.util.*;
	class Account implements Comparable<Account> {
		String accountNumber;
		double balance;
		Account(String acc, double bal) { accountNumber = acc; balance = bal; }
		public int compareTo(Account other) {
			return Double.compare(this.balance, other.balance);
		}
		public String toString() { return accountNumber + ": " + balance; }
	}
	List<Account> accounts = new ArrayList<>();
	accounts.add(new Account("1001", 5000));
	accounts.add(new Account("1002", 7000));
	accounts.add(new Account("1003", 3000));
	Collections.sort(accounts); // Sort by balance
	System.out.println(accounts);
	```

## 6. Map Type Collections

The `Map` interface represents a collection that maps keys to values. It is not a true collection, but is part of the Java Collections Framework. Maps are useful in banking for associating account numbers with account details, customer IDs with customer information, etc.

### HashMap
- Stores key-value pairs with no guaranteed order.
- Keys must be unique; values can be duplicated.
- **Example (Banking Domain):**
	```java
	import java.util.*;
	class Account {
		String accountNumber;
		double balance;
		Account(String acc, double bal) { accountNumber = acc; balance = bal; }
		public String toString() { return accountNumber + ": " + balance; }
	}
	Map<String, Account> accountMap = new HashMap<>();
	accountMap.put("1001", new Account("1001", 5000));
	accountMap.put("1002", new Account("1002", 7000));
	System.out.println(accountMap.get("1001")); // Output: 1001: 5000.0
	```

### TreeMap
- Stores key-value pairs sorted by keys.
- Useful for sorted account listings by account number.
- **Example (Banking Domain):**
	```java
	Map<String, Account> sortedAccounts = new TreeMap<>();
	sortedAccounts.put("1003", new Account("1003", 3000));
	sortedAccounts.put("1001", new Account("1001", 9000));
	sortedAccounts.put("1002", new Account("1002", 4000));
	System.out.println(sortedAccounts);
	// Output: {1001=1001: 9000.0, 1002=1002: 4000.0, 1003=1003: 3000.0}
	```

---

Maps are essential for fast lookups and associations in banking applications, such as finding an account by its number or storing customer information by customer ID.

## 7. Summary Table

| Interface   | Implementation | Allows Duplicates | Maintains Order      | Example Use         |
|-------------|----------------|-------------------|----------------------|-------------------------------|
| List        | ArrayList      | Yes               | Yes                 | List of accounts              |
| List        | LinkedList     | Yes               | Yes                 | Transaction history           |
| Set         | HashSet        | No                | No                  | Unique customer IDs           |
| SortedSet   | TreeSet        | No                | Yes (sorted)        | Sorted account balances       |
| Map         | HashMap        | Keys: No, Values: Yes | No               | Account number to account info|

