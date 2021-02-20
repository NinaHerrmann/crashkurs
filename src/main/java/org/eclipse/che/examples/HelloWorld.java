/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        /*String a = "Che";

        System.out.println("Hello World " + a + "!"); */

        Book telephonebook = new Book(24);
        //telephonebook.setpages(24);

        System.out.println("Das Buch hat: " + telephonebook.getpages() + " Seiten! \n");

        System.out.println(telephonebook.checkpages(10));
    }
}
