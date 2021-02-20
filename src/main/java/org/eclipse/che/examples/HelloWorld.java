/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        Book telephonebook = new Book (24);
        int x = 20;
        System.out.println("My book has: " + telephonebook.getPages() + "pages!");
        System.out.println("Book A has less pages: " + telephonebook.hasPage(x) + "!");
    }
}
