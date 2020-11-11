public class Main {


    public static void main(String[] args)throws MyOwnException {

        try{
            throw new MyOwnException();
        } catch (MyOwnException ausnamenname){
            ausnamenname.printStackTrace();
        }

        int[] testArray =  {1,2,3};
        System.out.println(testArray[3]);
    }
}
