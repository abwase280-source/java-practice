
public class Practice {

    public static void main(String[] args) {
        int[] numbers ={10, 20, 30, 40, 50, 30, 31, 32, 33};
        int total = 0;
        for(int number : numbers){
            System.out.println(number);
            total = total + number;
        }
        System.out.println("Total = " + total);
    }
}

