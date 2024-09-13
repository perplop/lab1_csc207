public class Multiples {
    public static void main(String[] args) {
        int ceil = 1000;
        int i = 0;
        int numCount = 0;
        while(i < ceil){
            if(i % 3 == 0 || i % 5 == 0){
                numCount++;
            }
            i++;
        }
        System.out.println(numCount);
    }
}
