package firstlesson.exercise4;

public class exercise4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i =0;i<10;i++){
            array[i] =(int)(Math.random()*20);
        }
        System.out.println("Array: ");
        for (int i =0;i<10;i++){
            System.out.print(array[i]+" ");
        }
        boolean ind = true;
        while(ind) {
            ind = false;
            for (int i = 1; i < 10; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    ind = true;
                }
            }
        }
        System.out.println("\n"+"Sort array: ");
        for (int i =0;i<10;i++){
             System.out.print(array[i]+" ");
        }
    }
    private static void swap(int[] array, int i1, int i2) {
        int tmp = array[i1];
        array[i1] = array[i2];
        array[i2] = tmp;
    }
}

