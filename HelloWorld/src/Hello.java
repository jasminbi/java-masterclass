public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int myFirstNumber = (10+5) + (2*10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber*2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int tousandMinusMyTotal = 1000 - myTotal;

        System.out.println(myFirstNumber);
        System.out.println("The total is: " + myTotal);
        System.out.println("1000 minus myTotal is: " + tousandMinusMyTotal);

    }
}
