/**
 * Вывести все простые числа от 1 до 1000
*/


public class task_2 {
    public static void main(String[] args) {
        System.out.println("Простые числа: ");

        for(int i = 2; i <= 1000; i ++) {
            boolean num = true;
    
            for(int j = 2; j < i; j++) {
                if(i % j == 0){
                    num = false;
                    break;
                }
            }
            if(num){
                System.out.print(i + " ");
            }
        }

    } 
}
