package org.example.demo.ticket.business.contract;

import org.example.demo.ticket.business.contract.manager.IProjetManager;
import org.example.demo.ticket.business.contract.manager.ITicketManager;

public interface IManagerFactory {
    
    IProjetManager getProjetManager();
    ITicketManager getTicketManager(); 

}