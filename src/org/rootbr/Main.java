package org.rootbr;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    // What data type (or types) will allow the following code snippet to compile? (Choose all that apply)
    byte x = 5;
    byte y = 10;

    int zi = x + y;
    long zl = x + y;
    // boolean zbool = x + y; // приведение работет по встречающемуся типу double - long - int
    double zd = x + y;
    // short zs = x + y; // по умолчанию к int
    // byte zbyte = x + y;
    x += y; // правда оператор *= /= += -= сразу к тиму слева приводят


    // Which of the answer choices are valid given the following declaration?
    Map<String, Double> map = new HashMap<>();
    map.put("pi", 3.14159);
    //map.put("e", 2L);
    map.put("log(1)", new Double(0.0));
    //map.put('x', new Double(123.4));
    // None of the above
  }
}
