public class compareNumbers {

    public int sum(int a, int b) {
        try {
            return numb(a, b);
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }
        return 0;

    }



    private int numb(int a, int b) throws MyCheckedException{
        if (a > b){
            throw new MyCheckedException();
        }
        return a;
    }


}
