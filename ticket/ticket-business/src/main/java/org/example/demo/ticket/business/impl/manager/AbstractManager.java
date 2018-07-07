package org.example.demo.ticket.business.impl.manager;

import javax.inject.Inject;
import javax.inject.Named;

import org.example.demo.ticket.consumer.contract.IDaoFactory;
import org.springframework.transaction.PlatformTransactionManager;

public abstract class AbstractManager{

    @Inject
    @Named("txManagerTicket")
    private PlatformTransactionManager platformTransactionManager;
    public PlatformTransactionManager getPlatformTransactionManager(){
        return platformTransactionManager;
    }
    
    @Inject
    private IDaoFactory daoFactory;
    protected IDaoFactory getDaoFactory(){
        return daoFactory;        
    }    
}