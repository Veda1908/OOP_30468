package java_Generics;

import java.util.*;
import java.util.function.*;

public class CricketTeam {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(45, 60, 30, 85, 55);

        Predicate<Integer> isAboveFifty = score -> score > 50;

        System.out.println("Scores Above 50:");
        scores.stream()
              .filter(isAboveFifty)
              .forEach(score -> System.out.println("Score: " + score));
    }
}