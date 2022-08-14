package com.company.dsa.pactice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created using IntelliJ IDEA. Author:  abhijeet, Date:    30/01/22, Time:    7:21 PM
 */
public class Anagram {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        List<String> dictionary = Arrays.asList("heater", "cold", "clod", "reheat", "docl");
        List<String> query = Arrays.asList("codl", "heater", "abcd");
        System.out.println(anagram.stringAnagram(dictionary, query));
    }

    private List<Integer> stringAnagram(List<String> dictionaryList, List<String> queryList) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> dictMap = new HashMap<>();
        dictionaryList.forEach(dict -> {
            char tempArray[] = dict.toCharArray();
            Arrays.sort(tempArray);
            String sortedDict = new String(tempArray);
            if (dictMap.containsKey(sortedDict)) {
                dictMap.put(sortedDict, dictMap.get(sortedDict) + 1);
            } else {
                dictMap.put(sortedDict, 1);
            }
        });
        queryList.forEach(query -> {
            char tempArray[] = query.toCharArray();
            Arrays.sort(tempArray);
            String sortedQuery = new String(tempArray);
            int count = 0;
            if (dictMap.containsKey(sortedQuery)) {
                count = dictMap.get(sortedQuery);
            }
            answer.add(count);
        });
        return answer;
    }
}