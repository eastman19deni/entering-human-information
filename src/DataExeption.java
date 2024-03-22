public class DataExeption extends Exception{
    public DatatExeption(){}

    public void dataExeprion(String i){
        System.out.println("Exeption: Data not correct format");
        System.out.printf("It's not correct Format:%s", i);
        System.out.println();
    }
}
