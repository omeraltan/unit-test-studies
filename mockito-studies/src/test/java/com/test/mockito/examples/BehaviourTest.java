package com.test.mockito.examples;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class BehaviourTest {

    @Test
    public void testBehaviour() throws Exception {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
        customerService.addCustomer("istanbul");
        customerService.addCustomer("ankara");

        verify(customerService).addCustomer("istanbul");
        verify(customerService).addCustomer("ankara");
    }

    @Test
    public void testKacKereCagirildi() throws Exception {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
        customerService.addCustomer("istanbul");
        customerService.addCustomer("istanbul");
        customerService.addCustomer("ankara");
        customerService.addCustomer("istanbul");

        verify(customerService, times(3)).addCustomer("istanbul");
        verify(customerService, times(1)).addCustomer("ankara");
        verify(customerService, never()).removeCustomer(anyString());
        verify(customerService, never()).addCustomer("izmir");
        verify(customerService, atLeast(1)).addCustomer("ankara");
    }

    @Test
    public void testSirasiniKontrolEt() throws Exception {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
        customerService.addCustomer("istanbul");
        customerService.addCustomer("ankara");
        customerService.addCustomer("izmir");

        InOrder inOrder = Mockito.inOrder(customerService);
        inOrder.verify(customerService).addCustomer("istanbul");
        inOrder.verify(customerService).addCustomer("ankara");
        inOrder.verify(customerService).addCustomer("izmir");
    }

}
