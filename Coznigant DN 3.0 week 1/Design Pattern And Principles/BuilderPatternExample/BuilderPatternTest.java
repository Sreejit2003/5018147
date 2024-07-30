public class BuilderPatternTest {
    public static void main(String[] args) {
        
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        System.out.println("Basic Computer: " + basicComputer);

        
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA GTX 3080")
                .setOperatingSystem("Windows 10")
                .build();

        System.out.println("Gaming Computer: " + gamingComputer);

        
        Computer workstationComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM("32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA Quadro RTX 5000")
                .setOperatingSystem("Linux")
                .build();

        System.out.println("Workstation Computer: " + workstationComputer);
    }
}
