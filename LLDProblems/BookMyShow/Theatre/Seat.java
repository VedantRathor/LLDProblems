package com.cloudvendor.cloudvendor.LLDProblems.BookMyShow.Theatre;

public class Seat {
    private Integer seatId;
    private Integer rowNumber;
    private boolean isBooked;

    public Seat(Integer seatId, Integer rowNumber, boolean isBooked) {
        this.seatId = seatId;
        this.rowNumber = rowNumber;
        this.isBooked = isBooked;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public Integer getRowNumber() {
        return rowNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }
}
