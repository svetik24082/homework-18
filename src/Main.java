public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate(" mom", "mom","mom1" );
        if (success) {
            System.out.println(" Данные валидны ");
        }else {
            System.out.println( " Данные не валидны ");
        }
    }
}