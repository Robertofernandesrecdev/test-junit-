import bda.dataBase;
import lombok.Builder;
import org.junit.jupiter.api.Assertions;
import purchase.purchase.Item;
import models.ModelRegister;
import org.junit.jupiter.api.Test;
import purchase.Purchase;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TestRegister {

    @Test
    public void registerDatabase(){
        //Arrange -Entrada
        var singleMaltBeer = Item.builder().name("Single malt beer").value(new BigDecimal("6.00")).build();
        var doubleMaltBeer = Item.builder().name("Double malt beer").value(new BigDecimal("7.50")).build();


        List<Item> listItems = Arrays.asList(singleMaltBeer, doubleMaltBeer);

        var purchase = Purchase.builder().items(listItems).build();

        var register = ModelRegister.buildScenery()
                .purchase(purchase)
                .receiveValue(new BigDecimal("13.50"))
                .build();
        //Act - ação

        register.effectSale();

        //Assert - Resultado

        Assertions.assertEquals(1, dataBase.sales.size());
    }

}
