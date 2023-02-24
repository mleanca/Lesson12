package LessonEx12;

public class MotherBoard { //creat clasa Motherboard..

    static class USB { //..care va contine in ea o clasa static USB
        static void methodStaticClass() {
            System.out.println("USB connected..");
        }
    }
    public static void methodOuterClass() {
        USB usb = new USB(); //creat un obiect de tip USB prin intermediul metodei statica a clasei externe
        usb.methodStaticClass(); //pentru a accesa metoda statica in static nested class
    }

}
