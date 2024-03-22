public class DateExeption extends Exception{
    public DateExeption(){}

    public void dateExeption(String i){
        System.out.println("Exeption: Date Not Correct Format");
        System.out.printf("It's not correct format: %s", i);
        System.out.println();
    }
}
