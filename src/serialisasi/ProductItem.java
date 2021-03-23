package serialisasi;
import java.io.Serializable;

/**
 *
 * @author kmalif
 */
public class ProductItem implements Serializable{
    String nama;
    String harga;

    public ProductItem(String nama, String harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "ProductItem{" + "nama=" + nama + ", harga=" + harga + '}';
    }
    
}
