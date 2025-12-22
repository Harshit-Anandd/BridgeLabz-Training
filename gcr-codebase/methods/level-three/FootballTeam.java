public class FootballTeam {

    // Method to generate random heights between 150 and 250 cms
    public int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            // Formula: Math.random() * (max - min + 1) + min
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    // Method to find the sum of all elements
    public int sumHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public double findMean(int sum, int count) {
        return (double) sum / count;
    }

    // Method to find the shortest height
    public int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) min = height;
        }
        return min;
    }

    // Method to find the tallest height
    public int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) max = height;
        }
        return max;
    }

    public static void main(String[] args) {
        FootballTeam stats = new FootballTeam();

        // Create array of size 11
        int[] teamHeights = stats.generateHeights(11);

        // Display generated heights
        System.out.print("Player Heights: ");
        for (int h : teamHeights) System.out.print(h + " ");
        System.out.println();

        // Calculate statistics
        int sum = stats.sumHeights(teamHeights);
        double mean = stats.findMean(sum, teamHeights.length);
        int shortest = stats.findShortest(teamHeights);
        int tallest = stats.findTallest(teamHeights);

        // Display results
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cms");
        System.out.println("Shortest Height: " + shortest + " cms");
        System.out.println("Tallest Height: " + tallest + " cms");
    }
}