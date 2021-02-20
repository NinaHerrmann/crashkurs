/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String[] argvs) {
        //int a = 14;
        Book mybook = new Book(Integer.valueOf(argvs[0]));
        Book emptybook = new Book();
        Car newcar = new Car();

        System.out.println(newcar.weight);

       mybook.fillArray();

        for (int k=0; k<mybook.getLength(); k++){
            for (int t=0; t<mybook.getLength(); t++) {
                System.out.println(mybook.getTelefonbuchInhalt(k,t));
            }
       }
        /*if (mybook.hasPage(a)){
            System.out.println("Book with "+ mybook.getPages() + " page has page " + a + "!");
        } else {
            System.out.println("Book does not have page " + a + "!");
        }*/
    }
}
