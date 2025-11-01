import java.util.*;

public class TextFormate3 {

    static boolean isEmailOrUrl(String word) {
        return word.contains("@") || word.startsWith("http://") || word.startsWith("https://");
    }

    static boolean isBullet(String word) {
        if (word.equals("*") || word.equals("-")) return true;
        return word.matches("\\d+[\\.|\\)]");
    }

    static List<String> splitWords(String line) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (char c : line.toCharArray()) {
            if (Character.isWhitespace(c)) {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }
        if (word.length() > 0) words.add(word.toString());
        return words;
    }

    static void printFormatted(List<String> words, int evenWidth, int oddWidth, boolean hyphen, List<String> result) {
        StringBuilder currentLine = new StringBuilder();
        int lineIndex = 0;
        int i = 0;

        while (i < words.size()) {
            String w = words.get(i);
            int width = (lineIndex % 2 == 0 ? evenWidth : oddWidth);

            // Handle bullets
            if (isBullet(w)) {
                if (currentLine.length() > 0) {
                    result.add(currentLine.toString());
                    currentLine.setLength(0);
                    lineIndex++;
                }
                currentLine.append(w).append(" ");
                i++;
                continue;
            }

            // Handle emails/URLs — never split
            if (isEmailOrUrl(w)) {
                if (currentLine.length() > 0 && currentLine.length() + 1 + w.length() > width) {
                    result.add(currentLine.toString());
                    currentLine.setLength(0);
                    lineIndex++;
                }
                if (currentLine.length() > 0) currentLine.append(" ");
                currentLine.append(w);
                i++;
                continue;
            }

            int available = width - currentLine.length() - (currentLine.length() == 0 ? 0 : 1);

            // Fits normally
            if (w.length() <= available) {
                if (currentLine.length() > 0) currentLine.append(" ");
                currentLine.append(w);
                i++;
                continue;
            }

            // Hyphenation for long words
            if (hyphen && w.length() > width) {
                if (available > 1) {
                    int cut = Math.max(1, available - 1);
                    String part1 = w.substring(0, cut) + "-";
                    String part2 = w.substring(cut);
                    if (currentLine.length() > 0) currentLine.append(" ");
                    currentLine.append(part1);
                    result.add(currentLine.toString());
                    currentLine.setLength(0);
                    lineIndex++;
                    words.add(i + 1, part2);
                    i++;
                    continue;
                } else {
                    if (currentLine.length() > 0) {
                        result.add(currentLine.toString());
                        currentLine.setLength(0);
                        lineIndex++;
                    } else {
                        int cut = width - 1;
                        String part1 = w.substring(0, cut) + "-";
                        String part2 = w.substring(cut);
                        result.add(part1);
                        lineIndex++;
                        words.add(i + 1, part2);
                        i++;
                    }
                    continue;
                }
            }

            // If no hyphenation possible, move word to next line
            if (currentLine.length() > 0) {
                result.add(currentLine.toString());
                currentLine.setLength(0);
                lineIndex++;
            } else {
                currentLine.append(w);
                i++;
            }
        }

        if (currentLine.length() > 0) result.add(currentLine.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        List<String> inputLines = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            inputLines.add(sc.nextLine());
        }

        String cmd = sc.nextLine();

        int evenWidth = 75, oddWidth = 75;
        boolean hyphen = false;

        List<String> cmdWords = splitWords(cmd);
        for (int i = 0; i < cmdWords.size(); i++) {
            String c = cmdWords.get(i);
            if (c.equals("-w") && i + 1 < cmdWords.size()) {
                evenWidth = oddWidth = Integer.parseInt(cmdWords.get(++i));
            } else if (c.equals("-w-e") && i + 1 < cmdWords.size()) {
                evenWidth = Integer.parseInt(cmdWords.get(++i));
            } else if (c.equals("-w-o") && i + 1 < cmdWords.size()) {
                oddWidth = Integer.parseInt(cmdWords.get(++i));
            } else if (c.equals("h")) {
                hyphen = true;
            }
        }

        // Paragraph handling
        List<List<String>> paragraphs = new ArrayList<>();
        List<String> currentParagraph = new ArrayList<>();

        for (String line : inputLines) {
            if (line.trim().isEmpty()) {
                if (!currentParagraph.isEmpty()) {
                    paragraphs.add(new ArrayList<>(currentParagraph));
                    currentParagraph.clear();
                }
            } else {
                currentParagraph.addAll(splitWords(line));
            }
        }

        if (!currentParagraph.isEmpty()) paragraphs.add(currentParagraph);

        List<String> finalOutput = new ArrayList<>();
        for (int p = 0; p < paragraphs.size(); p++) {
            List<String> formatted = new ArrayList<>();
            printFormatted(paragraphs.get(p), evenWidth, oddWidth, hyphen, formatted);
            finalOutput.addAll(formatted);
            if (p != paragraphs.size() - 1) finalOutput.add("");
        }

        for (int i = 0; i < finalOutput.size(); i++) {
            System.out.print(finalOutput.get(i));
            if (i != finalOutput.size() - 1) System.out.println();
        }
    }
}
