public class LaptopFactory {
    public static Laptop createLaptop(String type) {
        switch (type.toLowerCase()){
            case "gaming":
                return new GamingLaptop();
            case "business":
                return new BuisnessLaptop();
            case "ultrabook":
                return new Ultrabook();
            default:
                throw new IllegalArgumentException("Invalid Laptop type" + type);
        }
    }
}
