package org.example.demo.ticket.business.contract_impl;

import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.bean.ticket.Ticket;
// ProjetManager est désormais une interface

public interface ITicketManager {

    Ticket getTicket(Long pNumero) throws NotFoundException ;
    // ...

}