/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String[] argvs) {
        int a = 14;
        Book mybook = new Book(Integer.valueOf(argvs[0]));
        if (mybook.hasPage(a)){
            System.out.println("Book has page " + a + "!");
        } else {
            System.out.println("Book does not have page " + a + "!");
        }

        mybook.setPages();

        for(int i = 0; i<mybook.pages; i++){
            //System.out.println(mybook.names[i]);
            for(int ii = 0; ii<mybook.entries; ii++){
                System.out.println(mybook.names[i][ii]);
            }
        }
        
        //Eintrag auf der ersten Seite des Telefonbuchs
        /*mybook.newEntry(0, "Niklas F.");
        mybook.newEntry(1, "Niklas G.");
        mybook.newEntry(2, "Markus L."); 

        for(int i = 0; i < mybook.pages; i++){
            System.out.println(mybook.names[i] + "\n");
        } */


    }
}
