/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.core;

/**
 *
 * @author salaboy
 */
public class CommandExecutor {

    public <T> T execute( Command<T> cmd, Context ctx ) {
        return cmd.execute( ctx );
    }

}
