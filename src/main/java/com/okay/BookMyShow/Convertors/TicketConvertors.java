package com.okay.BookMyShow.Convertors;


import com.okay.BookMyShow.Entities.TicketEntity;
import com.okay.BookMyShow.EntryDtos.TicketEntryDto;

public class TicketConvertors {


    public static TicketEntity convertEntryToEntity(TicketEntryDto ticketEntryDto){

        TicketEntity ticketEntity = new TicketEntity();
        return ticketEntity;

    }
}
