package com.sweetTreats;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SweetTreats {

    static List<Courier> couriers =  Arrays.asList(
            new Courier("Bobby", 5, true, 1.75, 9 , 13 ),
            new Courier("Martin", 3, false, 1.5, 9 , 17),
            new Courier("Geoff", 5, true, 2.00,10 , 16 ),
            new Courier("Aman", 4, false, 1.05,11 , 16 )
    );

   public static Courier courierSelector(Order order){
       List<Courier> availableCourier = couriers.stream()
               .filter(courier -> order.getOrderHour().isAfter(courier.getStartHour()) &&
                       order.getOrderHour().isBefore(courier.getEndHour()))
               .filter(c -> c.getMaxDeliveryMilesMiles() >= order.getCustomerDistance())
               .filter(c1 -> c1.hasRefrigeratedBox() == order.isRefrigerated())
               .collect(Collectors.toList());

      if(!availableCourier.isEmpty()){

          Comparator<Courier> comparator = Comparator.comparing( courier -> courier.getChargePerMile() );
          Courier cheapestCourier = availableCourier.stream().min(comparator).get();

          System.out.println(availableCourier);
          System.out.println("--------------");
          System.out.println(cheapestCourier);
          return  cheapestCourier;

      }else{
          System.out.println("Sorry, no courier Found at the Moment");
          return null;
      }






//       System.out.println(start.isBefore(stop));
   }
}



//    LocalTime start = LocalTime.of( 8, 0);
//    LocalTime stop = LocalTime.of( 15, 0 );
//
//    LocalTime sT = LocalTime.of(7,0);
//    LocalTime eT = LocalTime.of(7,00);
//
//// print result
//       System.out.println("LocalTime : " + sT + "::" + eT) ;