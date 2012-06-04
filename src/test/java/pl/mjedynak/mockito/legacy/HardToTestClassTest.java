package pl.mjedynak.mockito.legacy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class HardToTestClassTest {

    private static final double ZERO_DISCOUNT = 0.0;

    @Spy
    private HardToTestClass hardToTestClass;

    private String customerName = "Neal Stephenson";
    private Integer lowAmount = 1;

    @Test
    public void shouldReturnZeroDiscountIfAmountIsLowAndCustomerIsNotImportantOne() {
        // given
        given(hardToTestClass.isImportantCustomer(customerName)).willReturn(false);

        // when
        Double result = hardToTestClass.calculateDiscount(customerName, lowAmount);

        // then
        assertThat(result, is(ZERO_DISCOUNT));
    }

}
