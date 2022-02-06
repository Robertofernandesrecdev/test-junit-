package purchase;

import java.math.BigDecimal;
import java.util.List;

import purchase.purchase.Item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;



public class Purchase {


    @Setter
    @Builder(toBuilder = true)
    @AllArgsConstructor
    public class purchase{
        private List<Item> items;


        public BigDecimal getTotal() {
            return items.stream()
                    .map(Item::getValue)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
        }
    }
}
