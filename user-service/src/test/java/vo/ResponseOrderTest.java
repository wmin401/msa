package vo;

import com.example.userservice.vo.ResponseOrder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResponseOrderTest {

    @Test
    void setTotalPrice(){
        ResponseOrder order = new ResponseOrder();

        order.setUnitPrice(50);
        order.setQty(10);
        Integer totalPrice = order.getUnitPrice() * order.getQty();
        order.setTotalPrice(totalPrice);


        assertEquals( 500, order.getTotalPrice());

    }

}
