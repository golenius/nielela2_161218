public class Sample {

    public  static final double PI = 3.14;

    public static void main(String[] args) {

        A a = new A();
        a.setCounter(5);

       // System.out.println(a.counter);
        System.out.println("----------------------------------------------------------");

        WashingMachine wm = new WashingMachine();
        wm.modeForSensitiveClothes();
        wm.showSettings();
        wm.modeForTowelsAndBedLinen();
        wm.showSettings();

        B b = new B();
        b.setCounter(12);
        System.out.println("counter" + b.getCounter());

       // Rectangle rectangle = new Rectangle();



    }

    //static synchronized protected final void specialMethod(){}



}

class A {
    protected int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        System.out.println("Ustawiamy licznik");
        this.counter = counter;
    }
}

class B extends A{
    void show(){
        System.out.println("liczniki: " + counter);
    }

    public int getCounter(){
        System.out.println("Teraz uruchamiamy z klasy B");
        return counter;
    }

}