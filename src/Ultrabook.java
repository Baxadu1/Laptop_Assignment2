public class Ultrabook implements Laptop {
    @Override
    public void assemble() {
        System.out.println("Assembling lightweight Ultrabook...");
    }

    @Override
    public String getSpecifications() {
        return "Specs: Intel i5, 8GB RAM, Integrated GPU, 512GB SSD";
    }
}
