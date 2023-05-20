public class ControlStatement {
    public static void main(String[] args) {
        if (4 > 2){
            System.out.println("4 is bigger");
        }else {
            System.out.println("Go, ask a kid");
        }

        int a = 0;
        while (a < 2){
            System.out.println("a = " + a);
            a++;
        }

        do {
            System.out.println("Do");
        }while (false);

        for (int i = 1; i <= 1; i++){
            System.out.println("I am Sachin x " + i);
        }

        int[] x = {1, 2, 3, 4, 5};
        for (int i:x) {
            System.out.println(i);
        }

        int b = 1;
        switch (b){
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("default");
        }
    }
}
