package com.pramod.algorithm.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class RankTeamsbyVotes {
    public static void main(String args[]) {
        String []votes = {"ABC","ACB","ABC","ACB","ACB"};
        String str  = new RankTeamsbyVotes().rankTeams(votes);
        System.out.print(str);
    }

    public String rankTeams(String[] votes) {

        int len = votes[0].length();

        Map<Character,  int[]> map = new HashMap<>();

        for(String str : votes){
            for(int i = 0; i < len; i++){
                char c = str.charAt(i);
              map.putIfAbsent(c, new int[len]);
              map.get(c)[i]++ ;
            }
        }

        List<Character> list = map.keySet().stream().collect(Collectors.toList());

        Collections.sort(list, (a, b) -> {
            for(int i = 0; i < len; i++){
                if(map.get(a)[i] != map.get(b)[i]){
                    return map.get(b)[i] - map.get(a)[i];
                }
            }
            return a - b;
        });
        return  list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

    }

}
