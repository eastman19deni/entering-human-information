import java.util.Scanner;

public class InputData {
    public String[] enterData(){
        Scanner iScanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter line use with space NameSurnamePatronymic(ФИО),dd.mm.yyyy, phone number, and sex(gender): ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split("");
            if(arrayData.length == 6 ){
                return arrayData;
            }else if(arrayData.length < 6){
                System.out.println("You entered not all information, please try again");
            }else{
                System.out.println("your entered too much information,start from begin, please try again");
            }
        }
    }
}
