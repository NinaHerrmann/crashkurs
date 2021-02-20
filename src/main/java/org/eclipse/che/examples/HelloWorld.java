/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String[] argvs) {
        //int a = 14;
        Book mybook = new Book(Integer.valueOf(argvs[0]));

        //System.out.println(mybook.getTelefonbuchInhalt(Integer.valueOf(argvs[1]),Integer.valueOf(argvs[2])));

       mybook.fillArray();

       for (int k=0; k<mybook.getLength(); k++){
            for (int l=0; l<mybook.getLength(); l++) {
                System.out.print(mybook.getTelefonbuchInhalt(k, l) + " | ");
            }
            System.out.println();
        }

        /*if (mybook.getPages(a)){
            System.out.println("Book has page " + a + "!");
        } else {
            System.out.println("Book does not have page " + a + "!");
        }*/
    }
}
