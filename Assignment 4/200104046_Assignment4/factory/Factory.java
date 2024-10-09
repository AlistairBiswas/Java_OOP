package factory;

public class Factory {

    public static void main(String[] args) {

        Product product = new Product();
        
        product.setProductID(10);
        product.setProductWeight(46.2);
        
        System.out.println("Product ID : " + product.getProductID() + "\nProduct Weight : " + product.getProductWeight());
    
        Product product1 = new Product();
        product1 = product.checkAndgenerate(20, 100.5);
        
        System.out.println("\nFirst method...");
        System.out.println("Product ID : " + product1.getProductID() + "\nProduct Weight : " + product1.getProductWeight());    
        
        Product product2 = new Product();
        product2 = product1.checkAndgenerate(40);
 
        System.out.println("\nSecond method...");
        System.out.println("Product ID : " + product2.getProductID() + "\nProduct Weight : " + product2.getProductWeight()); 
        
        Product product3 = new Product();
        product3 = product2.checkAndgenerate(105.5);
        
        System.out.println("\nThird method...");
        System.out.println("Product ID : " + product3.getProductID() + "\nProduct Weight : " + product3.getProductWeight());     
        
        Product product4 = new Product();
        product4 = product3.checkAndgenerate(product3);
        
        System.out.println("\nFourth method...");
        System.out.println("Product ID : " + product4.getProductID() + "\nProduct Weight : " + product4.getProductWeight());
           
        Product product5 = new Product();
        product5 = product4.checkAndgenerate(30, 200);
        
        System.out.println("\nFifth method...");
        System.out.println("Product ID : " + product5.getProductID() + "\nProduct Weight : " + product5.getProductWeight());
    
        Product product6 = new Product();
        product6 = product5.checkAndgenerate(100.5, 150.0);
        
        System.out.println("\nSixth method...");
        System.out.println("Product ID : " + product6.getProductID() + "\nProduct Weight : " + product6.getProductWeight());
    
    }
}