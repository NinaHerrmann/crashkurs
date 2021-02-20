/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String[] args) {
        Book telefonbuch = new Book(42);
        int pageExist = 43;
        System.out.println("My book has " + telefonbuch.getPages() + " pages !"); 
        System.out.println("pageExist: " + pageExist);
        System.out.println(telefonbuch.checkPageExist(pageExist));
    }
}
