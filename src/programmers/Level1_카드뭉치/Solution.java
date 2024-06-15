package programmers.Level1_카드뭉치;

import java.util.ArrayDeque;
import java.util.List;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        ArrayDeque<String> card1Queue = new ArrayDeque<>(List.of(cards1));
        ArrayDeque<String> card2Queue = new ArrayDeque<>(List.of(cards2));
        ArrayDeque<String> goalQueue = new ArrayDeque<>(List.of(goal));

        while (!goalQueue.isEmpty()) {

            if (!card1Queue.isEmpty() && card1Queue.peekFirst().equals(goalQueue.peekFirst())) {
                card1Queue.pollFirst();
                goalQueue.pollFirst();
            }
            else if (!card2Queue.isEmpty() && card2Queue.peekFirst().equals(goalQueue.peekFirst())) {
                card2Queue.pollFirst();
                goalQueue.pollFirst();
            }
            else {
                break;
            }
        }

        return goalQueue.isEmpty() ? "yes" : "no";
    }
}
