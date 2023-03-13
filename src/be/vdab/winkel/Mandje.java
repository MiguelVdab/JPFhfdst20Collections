package be.vdab.winkel;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mandje {
   private final Map<Product, Integer> mandje = new LinkedHashMap<>();

   public Map<Product, Integer> getMandje() {
      return mandje;
   }

   public void add(Product product, int aantal) {
      controleerProduct(product);
      controleerAantal(aantal);
      if (! controleerProductZitInMandje(product)) {
         mandje.put(product, aantal);
      } else {
         var oudeAantal = mandje.get(product);
         mandje.put(product, oudeAantal + aantal);
      }
   }
   private void controleerProduct(Product product) {
      if (product == null) {
         throw new NullPointerException("Product moet ingevuld worden");
      }
   }
   private void controleerAantal(int aantal) {
      if (aantal <= 0) {
         throw new IllegalArgumentException("Aantal moet positief zijn");
      }
   }
   private boolean controleerProductZitInMandje(Product product) {
      return mandje.containsKey(product);
   }
   public void remove(Product product) {
      controleerProduct(product);
      mandje.remove(product);
   }
   public void clear() {
      mandje.clear();
   }
   public BigDecimal getTotalePrijs() {
      var totalePrijs = BigDecimal.ZERO;
      for (var entry : mandje.entrySet()) {
         totalePrijs = totalePrijs.add(entry.getKey().getPrijs().multiply(BigDecimal.valueOf(entry.getValue())));
      }
      return totalePrijs;
   }
   @Override
   public String toString() {
      return mandje.toString();
   }
}
