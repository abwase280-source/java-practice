
// public class Practice {

//     public static void main(String[] args) {
//         int[] numbers ={10, 20, 30, 40, 50, 30, 31, 32, 33};
//         int total = 0;
//         for(int number : numbers){
//             System.out.println(number);
//             total = total + number;
//         }
//         System.out.println("Total = " + total);
//     }
// }

// Coding task: Array Sum + Largest Element


public class Practice {
    public static void main(String[] args) {

        int[] numbers = {12, 5, 28, 9, 41, 16};

        int sum = 0;
        int max = numbers[0];

        for (int number : numbers) {
            System.out.println(number);
            sum = sum + number;
            if(number > max ){
                max = number;
            }
        }

        System.out.println("SUM of Total Given Arrat = " + sum);
        System.out.println("Largest = " + max);
    }
}
