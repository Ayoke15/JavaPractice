package ex.ex1;

public class programm {
    public static void main(String[] args) {
        Test circle = new Test("Circle");
        circle.work();

    }
}

    class Shape {
        String name;
        public Shape(String name){

            this.name=name;
        }
        public String getName(){ return this.name; }
    }
    class Test extends Shape {
        public  Test(String name){
            super(name);

        }
        void work(){
            System.out.println(getName());
        }

    }




