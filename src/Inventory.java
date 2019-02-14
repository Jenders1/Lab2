import java.util.List;

public class Inventory {
    private static List<Product> stuff;
    private Inventory(){
        stuff.add(new Product("thing1",1,"thing2",2,"thing3",3));
    }
    public static List<Product> getProducts(){
        return stuff;
    }
}
