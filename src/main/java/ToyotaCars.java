public class ToyotaCars {

    NonStaticInner nonStaticInner =new NonStaticInner();

    public static class Brand{
        public static String brandName = "Toyota";
        public static void tagLine () {
            System.out.println("Jenis Mobil");

        }
    }

    public class NonStaticInner {
        public static void model (String model) {
            System.out.println("Membuat mobil anda " + model);
            System.out.println("Brand mobil anda " + Brand.brandName);
        }
    }

    public NonStaticInner getNonStaticInner() {
        return nonStaticInner;
    }

    public void setNonStaticInner(NonStaticInner nonStaticInner) {
        this.nonStaticInner = nonStaticInner;
    }
}
