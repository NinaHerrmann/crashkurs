/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {

        Book telephonebook = new Book(24,250);
        String a = "ist";
        String b = "ist nicht";
        String c;



        if (telephonebook.getPages() < telephonebook.getAllpages()) {c=a;} else {c=b;};

        System.out.println("Die gewählte Seite " + telephonebook.getPages() + " " + c + " im Buch enthalten");
    

        /*System.out.println("Das Buch hat: " + telephonebook.getPages() + " Seiten");*/
    }
}

