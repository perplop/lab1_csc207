public class Reduce {
    public static void main(String[] args) {
        int num = 5;
        int steps = 0;
        while(num > 0){
            if(num % 2 == 0){
                num /= 2;
                steps++;
            } else if (num == 1) {
                num -= 1;
                steps++;
            }
            else{
                num -= 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
