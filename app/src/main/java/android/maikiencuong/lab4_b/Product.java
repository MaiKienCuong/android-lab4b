package android.maikiencuong.lab4_b;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Objects;

public class Product {
    private String id;
    private String productName;
    private String shopName;
    private int image;

    public Product(String id, String productName, String shopName, int image) {
        this.id = id;
        this.productName = productName;
        this.shopName = shopName;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId().equals(product.getId());
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
