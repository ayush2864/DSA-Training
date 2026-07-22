class Solution {
    public String predictPartyVictory(String senate) {

        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        int n = senate.length();

        // Store positions of each party
        for (int i = 0; i < n; i++) {

            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }

        // Continue until one party is empty
        while (!radiant.isEmpty() && !dire.isEmpty()) {

            int r = radiant.poll();
            int d = dire.poll();

            if (r < d) {
                // Radiant acts first
                radiant.offer(r + n);
            } else {
                // Dire acts first
                dire.offer(d + n);
            }
        }

        if (radiant.isEmpty()) {
            return "Dire";
        }

        return "Radiant";
    }
}