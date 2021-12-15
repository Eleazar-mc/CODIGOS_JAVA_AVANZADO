package e_wildcards;

import java.util.*;

public class Wilcard1<W, T> {
    //void f(List<T> v) {}
    //void f(List<W> v) {}

    void f1(List<T> v) {}
    void f2(List<W> v) {}
}