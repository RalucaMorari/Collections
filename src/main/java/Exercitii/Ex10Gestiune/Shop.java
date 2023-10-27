package Exercitii.Ex10Gestiune;

import java.util.*;

public class Shop {

    private Map<Category, List<Product>> productsByCategory;

    public Shop() {
        this.productsByCategory = new HashMap<>();
    }

    public Map<Category, List<Product>> getProducts() {
        return productsByCategory;
    }

    public void setProductsByCategory(Map<Category, List<Product>> productsByCategory) {
        this.productsByCategory = productsByCategory;
    }

    public void addProduct(Product product) {

        if (productsByCategory.containsKey(product.getCategory())) {
            productsByCategory.get(product.getCategory()).add(product);

        } else {
            List<Product> valueProductsList = new ArrayList<>();
            valueProductsList.add(product);
            productsByCategory.put(product.getCategory(), valueProductsList);
        }
    }

    public List<Product> getProductsByCategory(Category category) {
        return productsByCategory.get(category);
    }

   public Set<Category> getAllCategories() {
       return productsByCategory.keySet();
   }
   public void deleteProduct(Product product){
        productsByCategory.get(product.getCategory()).remove(product);
   }
}