package org.example.demo.ticket.consumer.contract;

import org.example.demo.ticket.consumer.contract.dao.ITicketDao;

public interface IDaoFactory {

    ITicketDao getTicketDao();
}