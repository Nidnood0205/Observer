/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author DELL
 */
public class Registrant1 implements MyObserver {
    @Override
    public void update(Source s) {
        System.out.println("Live Result : " +((HeadQuarter)s).getData());
    }
}