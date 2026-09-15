class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[101];              

        for (int i = 0; i < logs.length; i++) {
            year[logs[i][0] - 1950]++;          
            year[logs[i][1] - 1950]--;          
        }

        int population = 0;
        int maxpopulation = 0;
        int answer = 1950;

        for (int i = 0; i < 101; i++) {         
            population += year[i];              
            if (population > maxpopulation) {   
                maxpopulation = population;
                answer = 1950 + i;
            }
        }
        return answer;
    }
}