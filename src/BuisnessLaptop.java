public class BuisnessLaptop implements Laptop {
    @Override
    public void assemble() {
        System.out.println("Assembling reliable Business Laptop...");
    }

    @Override
    public String getSpecifications() {
        return "Specs: Intel i7, 16GB RAM, Integrated GPU, 1TB SSD";
    }
}
