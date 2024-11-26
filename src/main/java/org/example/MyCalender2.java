package org.example;

import java.util.ArrayList;
import java.util.List;

/*
* Step 1: create two epmty array singleBooking and DOuble booking
* step2 : check if new event causeing triple booking
*       Itreate through double booking and for each element cjeck Overlapping
*       Formula max(givenStartTime,existingBookingSartTime)<max(givenEndTime,existingBokkingEndTime)
*       yes than return false
*
* step 3 : add Overlapps between new and existing event in single bookings to doubleBooking
*           Itrate trough single booking
*           findOverlapStart=max(startTime,existingBookingSartTime)
*           findOverlapEnd=max(endTime,existingBookingEndTime)
*           if(findOverlapStart<findOverlapEnd)
*           DOubleBooking.add(new int[]{overlapStart, overlapEnd});
* step 4 :singleBooking.add(new int[]{startTime, endTime});
* step 5 return true;
*
* */
public class MyCalender2 {

    List<Integer[]> singleBooking;
    List<Integer[]> doubleBooking;

    public MyCalender2() {

        singleBooking=new ArrayList<>();
        doubleBooking=new ArrayList<>();
    }

    public  boolean book(Integer startTime , Integer endTime){

        //check if new event causing triple event

        for (Integer[] event : doubleBooking) {
            if(isOverlapping(event[0],event[1],startTime,endTime)){
                return false;
            }
        }


        for (Integer[] event : singleBooking) {
            int overLappingStartTime=Math.max(event[0],startTime);
            int overLappingEndTime=Math.min(event[1],endTime);
            if(overLappingStartTime<overLappingEndTime){
                doubleBooking.add(new Integer[]{overLappingStartTime,overLappingEndTime} );
                }

        }
        singleBooking.add(new Integer[]{startTime,endTime} );

        return true;

    }

    private boolean isOverlapping(Integer existingStartTime, Integer integer1existingEndTime, int startTime, int endTime) {
        int overLappingStartTime=Math.max(existingStartTime,startTime);
        int overLappingEndTime=Math.min(integer1existingEndTime,endTime);
        if(overLappingStartTime<overLappingEndTime)
            return true;
        else
            return false;
    }
}
