package Object;

import java.util.Scanner;

public class AirportCoffee {
    static double totalLength;
    static double slowSpeed, fastSpeed;
    static double waitTime, drinkTime;
    static double oneCoffee;
    static int numberOfStops;
    static double[] carts;
    static double[] minimumTime;
    static int[] nextCart;

    static double calcTime(int curPosition, int nextPosition) {
        double distance = carts[nextPosition] - carts[curPosition];
        double time = minimumTime[nextPosition];
        if (waitTime * slowSpeed >= distance) {
            time += distance / slowSpeed;
        } else {
            time += waitTime;
            distance -= waitTime * slowSpeed;
            if (drinkTime * fastSpeed >= distance) {
                time += distance / fastSpeed;
            } else {
                time += drinkTime;
                distance -= drinkTime * fastSpeed;
                time += distance / slowSpeed;
            }
        }
        return time;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        totalLength = input.nextLong();
        slowSpeed = input.nextInt();
        fastSpeed = input.nextInt();
        waitTime = input.nextInt();
        drinkTime = input.nextInt();
        oneCoffee = waitTime * slowSpeed + drinkTime * fastSpeed;
        numberOfStops = input.nextInt();
        carts = new double[numberOfStops + 1];
        for (int i = 0; i < numberOfStops; i++) {
            carts[i] = input.nextLong();
            carts[numberOfStops] = totalLength;
            minimumTime = new double[numberOfStops + 1];
            nextCart = new int[numberOfStops + 1];
        }
        for (int i = numberOfStops - 1; i >= 0; i--) {
            minimumTime[i] = (totalLength - carts[i]) / slowSpeed;
            nextCart[i] = numberOfStops;
            int k = i + 1;
            for (int b = numberOfStops; b >= 1; b /= 2) {
                while (k + b <= numberOfStops && carts[k + b] - carts[i] <= oneCoffee) k += b;
            }
            for (int j = k; j <= numberOfStops && j <= k + 1; j++) {
                double time = calcTime(i, j);
                if (time < minimumTime[i]) {
                    minimumTime[i] = time;
                    nextCart[i] = j;
                }
            }
        }
        int count = 0;
        int position = 0;
        while (position < numberOfStops) {
            count++;
            position = nextCart[position];
        }
        System.out.println(count);
        position = 0;
        while (position < numberOfStops) {
            System.out.print(position + " ");
            position = nextCart[position];
        }
    }
}
