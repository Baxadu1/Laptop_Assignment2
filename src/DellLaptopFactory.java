public class DellLaptopFactory implements LaptopFactoryAbstract {
    public Laptop createGamingLaptop() {
        return new GamingLaptop();
    }
    public Laptop createBusinessLaptop() {
        return new BuisnessLaptop();
    }
    public Laptop createUltrabook() {
        return new Ultrabook();
    }
}
