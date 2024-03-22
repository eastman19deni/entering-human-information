public class SexException extends Exception{
    public SexException(){}

    public void sexExeption(String i){
        System.out.println("Exception: Sex Not Correct Data");
        System.out.printf("It's not correct data: %s", i);
        System.out.println();
    }
}
