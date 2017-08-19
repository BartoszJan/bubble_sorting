/**
 * Created by Bartek on 2017-08-15.
 */
public class Main {
    public static void main(String[] args) {

        int [] numbers = new int[]{2, 4, 6, 1, 5, 3};
        System.out.println("Elementy tablicy przed sortowaniem: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        boolean didChange = true;
        int thirdNumber;

        while (didChange == true){
            didChange = false;
            for (int i = 0; i < (numbers.length-1); i++) {
                if (numbers[i] > numbers[i+1]) {
                    thirdNumber = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = thirdNumber;
                    didChange = true;
                }
            }
        }
        System.out.println("Elementy tablicy po sortowaniu: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
