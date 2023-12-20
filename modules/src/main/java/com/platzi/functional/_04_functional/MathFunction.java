package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunction {
    public static void main(String[] args) {
        Function<Integer,Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };


        Function<Integer,Boolean> odd = x -> x%2 ==1;
        System.out.println(odd.apply(2));
        Predicate<Integer> even = x -> x%2==0;
        System.out.println(even.test(2));
//        System.out.println(square.apply(5));


    }


}
