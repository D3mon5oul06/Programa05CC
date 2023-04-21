/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programa05cc;

import org.hibernate.Session;

/**
 *
 * @author oziel
 */
public class Programa05CC {

   public static void main(String[] args){
       Session sesion=HibernateUtil.getSession();
       
       System.out.println("Hello world");
   }
           
}
