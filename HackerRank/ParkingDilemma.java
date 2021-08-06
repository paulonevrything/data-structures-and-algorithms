package HackerRank;

import java.util.*;

public class ParkingDilemma {

    public static long carParkingRoof(List<Long> cars, int k) {

        /*
         * Sort cars
         * 
         * from each element in cars, while the remaining elements are less than or equal to k,
         * 
         * count the next k-1 elements
         * 
         * subtract the current element from the element at the end of the count
         * 
         * keep tabs on your answer if it is less than the previous answer when the loop
         * is done, return the answer
         * 
         */

        Collections.sort(cars);

        long minimumRoofLength = Long.MAX_VALUE;

        for (int i = 0; i < cars.size(); i++) {

            if ((cars.size() - i) < k) {

                break;
            }

            long roofEnd = cars.get(i + 2);
            long roofLength = roofEnd - cars.get(i) + 1;

            if(minimumRoofLength > roofLength) {
                minimumRoofLength = roofLength;
            }

        }

        return minimumRoofLength;

    }


}

class Main {
    public static void main(String[] args) {

        System.out.println("Hello Parking Dilemma!");

        List<Long> carPark = new ArrayList<Long>();

        carPark.add(2L);
        carPark.add(10L);
        carPark.add(8L);
        carPark.add(17L);

        long result = ParkingDilemma.carParkingRoof(carPark, 3);

        System.out.println("Result: " + result);

    }



}