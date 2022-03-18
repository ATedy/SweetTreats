package com.sweetTreats;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class SweetTreats {
    private static final Logger LOGGER = Logger.getLogger(SweetTreats.class.getName());

    static List<Courier> couriers =  Arrays.asList(
            new Courier("Bobby", 5, true, 1.75, "09:00" , "13:00" ),
            new Courier("Martin", 3, false, 1.5, "09:00" , "17:00"),
            new Courier("Geoff", 5, true, 2.00,"10:00" , "16:00" )
    );

   public static Courier courierSelector(Order order){
       List<Courier> availableCourier = couriers.stream()
               .filter(courier -> order.getOrderHour().isAfter(courier.getStartHour()) &&
                       order.getOrderHour().isBefore(courier.getEndHour()))
               .filter(c -> c.getMaxDeliveryMilesMiles() >= order.getCustomerDistance())
               .filter(c1 -> c1.hasRefrigeratedBox() == order.isRefrigerated())
               .collect(Collectors.toList());

//       result.sort(Comparator.comparingDouble(Courier::getChargePerMile));

      if(!availableCourier.isEmpty()){
          Comparator<Courier> comparator = Comparator.comparing( courier -> courier.getChargePerMile() );
          Courier cheapestCourier = availableCourier.stream().min(comparator).get();

          LOGGER.info("Cheapest available courier details" + "\n" + "Courier-Name: " + cheapestCourier.getName() + "\n" + "Max-Miles:" + cheapestCourier.getMaxDeliveryMilesMiles() +
                  "\n" + "Charge Per Mile: " + cheapestCourier.getChargePerMile());
          return  cheapestCourier;

      }else{
          LOGGER.info("Sorry, it seems there's no available courier at the Moment");
          return null;
      }

   }
}


