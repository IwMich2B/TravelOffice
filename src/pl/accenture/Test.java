package pl.accenture;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("Poniatowskiego", "95-387", "Lódź");

        Customer customer = new Customer("Iza");
        customer.setAddress(address);

        Trip tripabord = new Trip(new Date(2015, 5, 13), new Date(2015, 8, 10), "London", 4050.34);
        Trip lokaltrip = new Trip(new Date(2015, 5, 13), new Date(2015, 8, 10), "Kraków", 600.50);
        DomesticTrip domesticTrip = new DomesticTrip(tripabord.getStart(), tripabord.getEnd(), tripabord.getDestynation(), tripabord.getPrice(), 0.10);
        AbroadTrip abroadTrip = new AbroadTrip(tripabord.getStart(), tripabord.getEnd(), tripabord.getDestynation(), tripabord.getPrice(), 400.00);
        System.out.println("Klijent wycieczek lokalnych przed rabatem ");
        customer.setTrip(lokaltrip);
        System.out.println(customer.toString());
        System.out.println("Klijent wycieczek lokalnych po rabacie ");
        customer.setTrip(domesticTrip);
        System.out.println(customer.toString());
        System.out.println("Klijent wycieczek zagranicznych przed dodatkowym ubezpieczeniem ");
        Customer customer2 = new Customer("Piotr");
        Address address1 = new Address("Wulczanska", "95-345", "Lódź");
        customer2.setAddress(address1);
        customer2.setTrip(tripabord);
        System.out.println(customer2.toString());
        System.out.println("Klijent wycieczek zagranicznych plus ubezpieczenie ");
        customer2.setTrip(abroadTrip);
        System.out.println(customer2.toString());

        System.out.println("Klijent wycieczek zagranicznych przed dodatkowym ubezpieczeniem ");
        Customer customer3 = new Customer("Katarzyna");
        Address address3 = new Address("Zamknieta", "95-888", "Lodz");
        customer3.setAddress(address);
        customer3.setTrip(tripabord);
        System.out.println(customer3.toString());
        System.out.println("Klijent wycieczek zagranicznych plus ubezpieczenie ");
        customer3.setTrip(abroadTrip);
        System.out.println(customer3.toString());

        TravelOffice travelOffice = new TravelOffice();
        travelOffice.addCustomer(customer);
        int ilosc = travelOffice.getCustomerCount();
        System.out.println("Rejest klientow w burze : " + ilosc);
        travelOffice.addCustomer(customer2);
        ilosc = travelOffice.getCustomerCount();
        System.out.println("Rejest klientow w burze : " + ilosc);
        travelOffice.addCustomer(customer3);
        ilosc = travelOffice.getCustomerCount();
        System.out.println("Rejest klientow w burze : " + ilosc);
    }
}
