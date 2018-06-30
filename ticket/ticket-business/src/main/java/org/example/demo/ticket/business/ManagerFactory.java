package org.example.demo.ticket.business;

import javax.inject.Named;
import javax.inject.Inject;

import org.example.demo.ticket.business.contract_impl.*;
import org.example.demo.ticket.business.impl.manager.*;

// La classe ManagerFactory devient ManagerFactoryImpl
// et implémente l'interface ManagerFactory
@Named
public class ManagerFactory implements  IManagerFactory{

    @Inject
    private IProjetManager projetManager;
    
    //@Override
    public IProjetManager getProjetManager() {
        return this.projetManager;
    }
    
    public void setProjetManager(IProjetManager vProjetManager){
        projetManager = vProjetManager;
    }

    @Inject
    private ITicketManager ticketManager;
    
    //@Override
    public ITicketManager getTicketManager() {
        return this.ticketManager;
    }
    
    public void setTicketManager(ITicketManager vTicketManager){
        ticketManager = vTicketManager;
    }
}
