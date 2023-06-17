class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        int[] count = new int[2]; // count[0] for Radiant, count[1] for Dire
        int[] ban = new int[2]; // ban[0] for Radiant, ban[1] for Dire
        for (char c : senate.toCharArray()) {
            if (c == 'R') count[0]++;
            else count[1]++;
        }
        while (count[0] > 0 && count[1] > 0) {
            for (int i = 0; i < n; i++) {
                char c = senate.charAt(i);
                if (c == 'R') {
                    if (ban[0] > 0) {
                        ban[0]--;
                        count[0]--;
                    } else {
                        ban[1]++;
                    }
                } else {
                    if (ban[1] > 0) {
                        ban[1]--;
                        count[1]--;
                    } else {
                        ban[0]++;
                    }
                }
            }
        }
        return count[0] > 0 ? "Radiant" : "Dire";
    }
}
