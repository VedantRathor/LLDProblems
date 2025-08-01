package com.cloudvendor.cloudvendor.LLDProblems.BookMyShow.Theatre;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Screen {
     private List<Seat> seatList;
     private Integer screenId;
     public Screen(List<Seat> seatList, Integer screenId) {
         this.seatList = seatList;
         this.screenId = screenId;
     }

     public void addSeat(Seat seat) {
         seatList.add(seat);
     }

     public void removeSeat(Integer seatId) {
         this.seatList = seatList.stream().filter((seat) -> !Objects.equals(seat.getSeatId(), seatId)).collect(Collectors.toList());
     }

    public List<Seat> getAllSeats() {
        return seatList;
    }

    public List<Seat> getAvailableSeats() {
         return seatList.stream().filter((seat) -> !seat.isBooked()).collect(Collectors.toList());
    }

    public boolean bookMySeat(Integer seatId) {
         for (Seat seat: seatList) {
             if (seat.getSeatId() == seatId) {
                 if (seat.isBooked()) return false;
                 seat.setBooked(true);
                 return true;
             }
         }
         return false;
    }

    public Integer getScreenId() {
        return screenId;
    }
}
