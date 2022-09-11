package firstlesson.exercise1;

public class exercise1 {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9};
        int a=0;
        for(int i=0;i< 9;i++){
            a = a+ i;
        }
        System.out.println("Cycle for:");
        System.out.println(a);
        a=0;
        int i=0;
        while(i<9){
            a+=i;
            i+=1;
        };
        System.out.println("Cycle while:");
        System.out.println(a);
        a=0;
        i=0;
        do{
            a+=i;
            i+=1;
        }while(i<9);
        System.out.println("Cycle do while:");
        System.out.println(a);
    }
}
