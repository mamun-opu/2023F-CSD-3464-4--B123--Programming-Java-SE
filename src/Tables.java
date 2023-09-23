public class Tables {
    public static void main(String[] args){
        System.out.println("Tables of multiplication \n");
        for(int i = 2; i <= 10; i++){
            System.out.println("Table of " + i + ": ");
            for(int j = 0; j <= 10; j++){
                System.out.printf("%d X %d: %d \n", i, j, i*j);
            }
            System.out.println(" ");
        }
    }
}
