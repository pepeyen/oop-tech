package Classes_do_Sistema;

public class Products {
    private int productId;
    private double productProductionPrice;
    private double productSellingPrice;
    private String productName;
    private String productDescription;
    
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getProductProductionPrice() {
        return productProductionPrice;
    }

    public void setProductProductionPrice(double productProductionPrice) {
        this.productProductionPrice = productProductionPrice;
    }
    
    public double getProductSellingPrice() {
        return productSellingPrice;
    }

    public void setProductSellingPrice(double productSellingPrice) {
        this.productSellingPrice = productSellingPrice;
    }    

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
