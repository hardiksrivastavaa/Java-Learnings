// WAP to create a program to understand the concept of Single Inheritance

class Rundog {
    public void bark() {
        System.out.println("Sheru.............");
        System.out.println("Bhau....Bhau......");
    }
}

class Bulldog extends Rundog {
    public void growl() {
        System.out.println("Tuffy.............");
        System.out.println("gruu....gurr......");
    }
}

class P29 {
    public static void main(String[] args) {

        Bulldog d1 = new Bulldog();
        d1.growl();
        d1.bark();

        Rundog d2 = new Rundog();
        d2.bark();
    }
}