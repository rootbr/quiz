package org.rootbr;

import java.util.stream.Stream;

public class Quiz {
  public static void main(String[] args) {
    Stream.of("Java", "Kotlin", "Scala", "Groovy")
        .map(it -> "I like " + it)
        .peek(System.out::println)
        .filter(it -> false) // чтобы перебрать все элементы
        .findAny()
        .orElse(null);

    Integer[][] Integer[][] = {{{{0}}}};
    System.out.println(Integer.getClass().getName());
    System.out.println(Integer.class.getName());
    // [[[[Ljava.lang.Integer;
    // java.lang.Integer
  }
}
