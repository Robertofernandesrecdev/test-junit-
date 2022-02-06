package sale;

import client.Client;
import lombok.Builder;
import seller.Seller;

import java.math.BigDecimal;
import java.time.LocalDate;


@Builder(toBuilder = true)
public class Sale {
    private final BigDecimal totalPurchase;
    private final BigDecimal troco;
    private final Seller seller;
    private final Client client;



    @Builder.Default
    private final LocalDate dateSale = LocalDate.now();

}
