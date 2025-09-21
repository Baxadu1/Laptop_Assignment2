public class GamingLaptop implements Laptop {
    public void assemble() {
        System.out.println("Assembling high-performance Gaming Laptop...");
    }

    @Override
    public String getSpecifications() {
        return "Specs: Intel i9,32GB RAM,RTX 4080 GPU, 2TB SSD";
    }
}
