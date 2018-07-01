package org.example.demo.ticket.webapp.rest.resource.abstracte;

import org.example.demo.ticket.business.contract.IManagerFactory;



public abstract class AbstractResource {

    private static IManagerFactory managerFactory;

    protected static IManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(IManagerFactory pManagerFactory) {
        managerFactory = pManagerFactory;
    }

}