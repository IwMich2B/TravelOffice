package pl.accenture;


import java.util.Arrays;

public class TravelOffice {
    Customer[] customers = new Customer[2];
    int liczbCusomer = 0;




    public int getCustomerCount() {
        return liczbCusomer;
    }

    public void addCustomer(Customer customer) {

        boolean czyTrzebaZwiekszyc = liczbCusomer == customers.length;
        if (czyTrzebaZwiekszyc) {
            customers = Arrays.copyOf(customers, customers.length+2);
        }
        customers[liczbCusomer++] = customer;

    }

}
