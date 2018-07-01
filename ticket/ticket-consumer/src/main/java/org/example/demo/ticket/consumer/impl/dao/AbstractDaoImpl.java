package org.example.demo.ticket.consumer.impl.dao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

public abstract class AbstractDaoImpl{
    
    @Inject
    @Named("dataSourceTicket")
    private DataSource dataSource;
    
    public DataSource getDataSource(){
        return dataSource;
    }
    
}