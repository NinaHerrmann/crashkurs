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
    }
}
