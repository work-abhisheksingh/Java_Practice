public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();

        if (s.length() < 10) {
            return result;
        }

        Map<String, Integer> sequenceCounts = new HashMap<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String sequence = s.substring(i, i + 10);
            sequenceCounts.put(sequence, sequenceCounts.getOrDefault(sequence, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : sequenceCounts.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
