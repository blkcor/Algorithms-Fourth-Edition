>**This repository is used to describe some code solutions for the book <<Algorithms>> by Robert Sedgewick and Kevin Wayne.**

# 1、chapter 1
`Mainly introduce some pre-knowledge about Java Library`
- Type Transform API
```java
//Integer
/*
 transform String to Integer
 */
Integer.parseInt("123");
Integer.valueOf("123");
/*
 transform Integer to String
 */
Integer.toString(123);

//Double
/*
 transform String to Double
 */
Double.parseDouble("123.456");
Double.valueOf("123.456");
/*
 transform Double to String
 */
Double.toString(123.456);
```
- Two kinds of Standard Stdin
```java
//Scanner
Scanner scanner = new Scanner(System.in);
String str = scanner.nextLine();
int num = scanner.nextInt();
//BufferedReader
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str = br.readLine();
```