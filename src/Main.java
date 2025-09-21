//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("        Factory Pattern:       ");
        Laptop gamingLaptop = LaptopFactory.createLaptop("gaming");
        gamingLaptop.assemble();
        System.out.println(gamingLaptop.getSpecifications());

        Laptop businessLaptop = LaptopFactory.createLaptop("business");
        businessLaptop.assemble();
        System.out.println(businessLaptop.getSpecifications());

        System.out.println("        Abstract Factory Pattern:       ");
        LaptopFactoryAbstract dellFactory = new DellLaptopFactory();
        Laptop dellUltrabook = dellFactory.createUltrabook();
        dellUltrabook.assemble();
        System.out.println(dellUltrabook.getSpecifications());

        LaptopFactoryAbstract hpFactory = new HPLaptopFactory();
        Laptop hpBusinessLaptop = hpFactory.createBusinessLaptop();
        System.out.println(hpBusinessLaptop.getSpecifications());
    }
}
