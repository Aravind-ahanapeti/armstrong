public class ArmstrongNumbers {
    public static int countDigits(int number) {
        int digitCount = 0;
        while (number > 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }
}
    

