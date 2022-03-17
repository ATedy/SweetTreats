package com.sweetTreats;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SweetTreats {
    Order newOrder = new Order(14, 3.5, true);

    List<Courier> couriers =  Arrays.asList(
            new Courier("Bobby", 5, true, 1.75, 9 , 13 ),
            new Courier("Martin", 3, false, 1.5, 9 , 17),
            new Courier("Geoff", 5, true, 2.00,10 , 16 )
    );

   public void courierSelector(){
       List<Courier> bestCourier = couriers.stream()
               .filter(courier -> newOrder.getOrderHour().isAfter(courier.getStartHour()) &&
                       newOrder.getOrderHour().isBefore(courier.getEndHour()))
               .collect(Collectors.toList());

      if(!bestCourier.isEmpty()){
          System.out.println(bestCourier);
      }else{
          System.out.println("No courier Found at the Moment");
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