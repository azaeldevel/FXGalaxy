
package com.galaxies.fx.window;

/**
 *
 * @author Azael Reyes
 */
public class Message extends Window
{
    public enum Type
    {
        CONSOLE
    }
    
    public Message(Type type, String message)
    {
        System.out.println(message);
    }
}
