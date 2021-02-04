package com.java.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
        Optional<Character> opCh=getNonRepeatedCharacterOpt("SASAS");
        if(opCh.isPresent())
            System.out.println("Non repeated character is :"+opCh.toString());
        else
        {
            System.out.println("No non repeated character found in String");
        }
    }

    public static Optional<Character> getNonRepeatedCharacterOpt(String str) {
        Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length() - 1; i++) {
            Character c = str.charAt(i);
            if (!countCharacters.containsKey(c)) {
                countCharacters.put(c, 1);
            } else {
                countCharacters.put(c, countCharacters.get(c) + 1);
            }
        }
        // As LinkedHashMap maintains insertion order, first character with
        // count 1 should return first non repeated character
        for (Map.Entry<Character, Integer> e : countCharacters.entrySet()) {
            if (e.getValue() == 1)
                return Optional.of(e.getKey());

        }
        return Optional.ofNullable(null);

    }
}
