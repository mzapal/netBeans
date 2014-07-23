/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author M
 */
public enum CompanyType {
    ENERGETIC, INFORMATIC, ENTERTAINMENT;
    
   @Override public String toString() {
        //only capitalize the first letter
        String s = super.toString();
   return s.substring(0, 1) + s.substring(1).toLowerCase();
 }
}
