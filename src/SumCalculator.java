public class SumCalculator {

    public  int calculateSum(int number) {


        int sum = 0;


        for (int i = 1; i <= number; i++) {
            sum += i;
        }


        if (sum > 10000) {
            throw new MyUncheckedException();
        }
        return sum;


    }
}
