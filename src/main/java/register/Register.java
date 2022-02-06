package register;

import bda.dataBase;
import client.Client;
import lombok.Builder;
import purchase.Purchase;
import sale.Sale;
import seller.Seller;

import java.math.BigDecimal;

@Builder(toBuilder = true)
public class Register {
    private final Purchase purchase;
    private final BigDecimal receivedValue;
    private final Seller seller;
    private final Client client;

    public void effectSale(){
        var totalPurchase = purchase.getTotal();

        var troco = receivedValue.subtract(totalPurchase);

        var sale = Sale.builder()
                .totalPurchase(totalPurchase)
                .troco(troco)
                .seller(seller)
                .client(client)
                .build();

        dataBase.addSale(sale);
    }
}
