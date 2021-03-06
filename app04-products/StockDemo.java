/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Vincent Assolutissimamente.
 * @version 30.10.2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     * I have hard coded them in to save myslef time while testing
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(new Product(132, "Clock Radio",0));
        manager.addProduct(new Product(37,  "Mobile Phone",0));
        manager.addProduct(new Product(23,  "Microwave Oven",0));
        manager.addProduct(new Product(1, "Hat",0));
        manager.addProduct(new Product(55, "Sock",0));
        manager.addProduct(new Product(111, "Electric ruler",0));
        manager.addProduct(new Product(97, "Pet Rock",0));
        manager.addProduct(new Product(48, "Meat Lamp",0));
        manager.addProduct(new Product(12, "Swivle Chair",0));
        manager.addProduct(new Product(133, "Radio that tells time",0));

        manager.printAllProductDetails();
    }

    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void deliveryDemo()
    {
        System.out.println("New deliveries:");
        System.out.println("=================");
        manager.delivery(132, 5);
        manager.delivery(37, 10);
        manager.delivery(23, 7);
        manager.delivery(1, 3);
        manager.delivery(55, 15);
        manager.delivery(111, 1);
        manager.delivery(97, 6);
        manager.delivery(48, 7);
        manager.delivery(12, 4);
        manager.delivery(133, 3);
        System.out.println("=================");
    }

    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = manager.getProduct(id);
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}