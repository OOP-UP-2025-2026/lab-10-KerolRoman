package ua.opnu;


import java.util.*;
import java.util.stream.Collectors;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public List<Integer> doubling(List<Integer> nums) {

        return nums.stream().map(x -> x * 2)
                .collect(Collectors.toList());
    }

    public List<Integer> square(List<Integer> nums) {

        return nums.stream().map(x -> x * x)
                .collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream().map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(x -> x >= 0)
                .collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(x -> x % 10 != 9)
                .collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }

    public List<String> refinedStrings(List<String> strings) {

        return strings.stream().distinct().sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .collect(Collectors.toList());
    }

    public List<String> flatten(List<String> strings) {
        return strings.stream().flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());
    }

}