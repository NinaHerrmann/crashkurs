/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package com.codenvy.example.java;

import static org.junit.Assert.assertTrue;

import org.eclipse.che.examples.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit test for simple App.
 */
@RunWith(JUnit4.class)
public class AppTest {

    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testBook() {
        Book mybook = new Book(24);
        assertTrue(24 == mybook.getPages());
    }
}
