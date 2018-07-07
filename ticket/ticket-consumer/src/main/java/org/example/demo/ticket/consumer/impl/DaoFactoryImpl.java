package org.example.demo.ticket.consumer.impl;

import org.example.demo.ticket.consumer.contract.IDaoFactory;
import org.example.demo.ticket.consumer.contract.dao.ITicketDao;

public class DaoFactoryImpl implements IDaoFactory{
    
    private ITicketDao ticketDao;
    
    @Override
    public ITicketDao getTicketDao(){
        return ticketDao;
    }
}