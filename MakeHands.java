import java.util.*;
import java.util.Deque;
import java.util.ArrayDeque;

class Card {
    int value;
    int suit;
    
    Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }
}

public class Make {
    public static int getValue(String s) {
        if (s.equals("A")) return 1;
        if (s.equals("J")) return 11;
        if (s.equals("Q")) return 12;
        if (s.equals("K")) return 13;
        return Integer.parseInt(s);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        List<Card> p1 = new ArrayList<>();
        List<Card> p2 = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            String c1 = scanner.next();
            int s1 = scanner.nextInt();
            String c2 = scanner.next();
            int s2 = scanner.nextInt();
            p1.add(new Card(getValue(c1), s1));
            p2.add(new Card(getValue(c2), s2));
        }
        
        int[] suitOrder = new int[4];
        for (int i = 0; i < 4; ++i) {
            suitOrder[i] = scanner.nextInt();
        }
        
        Map<Integer, Integer> priority = new HashMap<>();
        for (int i = 0; i < 4; ++i) {
            priority.put(suitOrder[i], 4 - i);
        }
        
        // Rearrange function as a method
        rearrange(p1, priority);
        rearrange(p2, priority);
        
        Deque<Card> deck1 = new ArrayDeque<>(p1);
        Deque<Card> deck2 = new ArrayDeque<>(p2);
        List<Card> hand = new ArrayList<>();
        boolean turn = false; // false - Vaishnavi, true - Suraj
        
        while (!deck1.isEmpty() || !deck2.isEmpty()) {
            if (!turn) { // Vaishnavi
                if (deck1.isEmpty()) break;
                Card c = deck1.pollFirst();
                if (!hand.isEmpty()) {
                    Card top = hand.get(hand.size() - 1);
                    if (c.value == top.value && priority.get(c.suit) > priority.get(top.suit)) {
                        hand.add(c);
                        rearrange(hand, priority);
                        for (Card x : hand) {
                            deck1.addLast(x);
                        }
                        hand.clear();
                        turn = false;
                        continue;
                    }
                }
                hand.add(c);
                turn = true;
            } else { // Suraj
                if (deck2.isEmpty()) break;
                Card c = deck2.pollFirst();
                if (!hand.isEmpty()) {
                    Card top = hand.get(hand.size() - 1);
                    if (c.value == top.value && priority.get(c.suit) > priority.get(top.suit)) {
                        hand.add(c);
                        rearrange(hand, priority);
                        for (Card x : hand) {
                            deck2.addLast(x);
                        }
                        hand.clear();
                        turn = true;
                        continue;
                    }
                }
                hand.add(c);
                turn = false;
            }
        }
        
        if (deck1.isEmpty() && deck2.isEmpty()) {
            System.out.print("TIE");
        } else if (!deck1.isEmpty()) {
            System.out.print("WINNER");
        } else {
            System.out.print("LOSER");
        }
        
        scanner.close();
    }
    
    private static void rearrange(List<Card> deck, Map<Integer, Integer> priority) {
        Collections.sort(deck, new Comparator<Card>() {
            @Override
            public int compare(Card a, Card b) {
                if (a.value != b.value) {
                    return Integer.compare(a.value, b.value);
                }
                return Integer.compare(priority.get(a.suit), priority.get(b.suit));
            }
        });
    }
}