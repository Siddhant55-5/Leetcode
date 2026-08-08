class Solution {
    public int totalFruit(int[] fruits) {

        // HashMap stores:
        // fruit type -> number of times it appears in current window
        HashMap<Integer, Integer> map = new HashMap<>();

        // Left pointer of sliding window
        int left = 0;

        // Stores the maximum length found
        int max = 0;

        // Right pointer expands the window
        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit to the map
            // If fruit already exists, increase its count
            // If it doesn't exist, start its count from 0 and add 1
            map.put(
                fruits[right],
                map.getOrDefault(fruits[right], 0) + 1
            );

            // We can have only 2 different types of fruits
            // If we have more than 2, shrink the window
            while (map.size() > 2) {

                // Decrease the count of the fruit at left
                map.put(
                    fruits[left],
                    map.get(fruits[left]) - 1
                );

                // If this fruit's count becomes 0,
                // remove the fruit type from the map
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                // Move left pointer forward
                left++;
            }

            // Calculate current window length
            // right - left + 1
            int length = right - left + 1;

            // Keep the maximum length
            max = Math.max(max, length);
        }

        // Return the longest valid window
        return max;
    }
}