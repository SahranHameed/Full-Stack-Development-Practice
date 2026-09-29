public class Mobile {

    void Samsung()
    {    
        System.out.println("Samsung is a popular smartphone brand known for its innovative features and high-quality devices.");
    }

    void Apple()
    {    
        System.out.println("Apple is a leading technology company that designs and manufactures iPhones, known for their sleek design and user-friendly interface.");
    }

    void OnePlus()
    {    
        System.out.println("OnePlus is a smartphone manufacturer that focuses on providing high-performance devices with competitive pricing.");
    }

    void Xiaomi()
    {    
        System.out.println("Xiaomi is a Chinese electronics company that produces smartphones, smart home devices, and other consumer electronics.");
    }


    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        // Call the methods to display information about different mobile brands
        mobile.Samsung();
        System.out.println("--------------------------------------------------------------");
        mobile.Apple();
        System.out.println("--------------------------------------------------------------");
        mobile.OnePlus();
        System.out.println("--------------------------------------------------------------");
        mobile.Xiaomi();

    }

}