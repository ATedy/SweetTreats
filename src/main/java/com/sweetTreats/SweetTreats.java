package com.sweetTreats;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SweetTreats {
    List<Courier> couriers =  Arrays.asList(
            new Courier("Bobby", 5, true, 1.75),
            new Courier("Martin", 3, false, 1.5),
            new Courier("Bobby", 5, true, 2.00)
    );

    List<Courier> cheapest = couriers.stream()
            .filter(courier -> courier.getName().equals("Bobby"))
            .collect(Collectors.toList());


}
