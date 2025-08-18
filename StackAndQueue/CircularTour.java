package StackAndQueue;

public class CircularTour {
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;

        int totalSurplus = 0;     
        int currentSurplus = 0;   
        int start = 0;            

        for (int i = 0; i < n; i++) {
            int gain = petrol[i] - distance[i]; 

            totalSurplus += gain;    
            currentSurplus += gain;  
            if (currentSurplus < 0) {
                start = i + 1; 
                currentSurplus = 0;  
            }
        }
        return totalSurplus >= 0 ? start : -1;
    }
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex = findStartingPoint(petrol, distance);
        System.out.println("Starting point index: " + startIndex); // Output: 1
    }
}


