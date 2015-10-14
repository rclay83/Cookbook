/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singletonpractice;

/**
 *
 * @author Richard
 */
public class Singleton
{
    private static Singleton instance;
    private String name;
    private int num;
    
    private Singleton()
    {
    }
    
    public static Singleton getInstance()
    {
        if(instance != null)
            return instance;
        
        instance = new Singleton();
        return instance;
    }

    public String getName()
    {
        return name;
    }

    public int getNum()
    {
        return num;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setNum(int num)
    {
        this.num = num;
    }
    
    
    
    
}
