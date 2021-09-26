package org.bukkit.support;

import org.bukkit.TestServer;

/**
 *  If you are getting: java.lang.ExceptionInInitializerError
 *
 *  extend this class to solve it.
 */
public abstract class AbstractTestingBase {

    static {
        TestServer.setup();
    }
}
