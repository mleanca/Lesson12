package LessonEx12;

import javax.annotation.processing.Processor;

public class Main {

    public static void main(String[] args) {

        CPU cpu = new CPU(); //creat cate un obiect de tip CPU, Processor si RAM
        CPU.InnerProcessor innerProcessor = cpu.new InnerProcessor();
        CPU.RAM ram = cpu.new RAM();

        innerProcessor.method();
        ram.method();

        MotherBoard.USB usb1 = new MotherBoard.USB(); //instanta de static nested class USB intr-o clasa Motherboard
        usb1.methodStaticClass(); //metoda poate fi apelat cu clasa USB.

        MotherBoard.USB.methodStaticClass(); //sugerat de editor, aceeasi ca line 17

    }
}
