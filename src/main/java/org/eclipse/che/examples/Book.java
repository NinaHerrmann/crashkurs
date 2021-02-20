/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class Book {

    int pages;
    int allpages;

    public Book(int pages, int allpages) {
        this.pages = pages;
        this.allpages = allpages;
    }

    public int getPages() {
        return pages;
    }

    public int getAllpages() {
        return allpages;
    }

    /*int pages;
    int minpage;
    int maxpage;

    public Book(int pages, int minpage, maxpage) {
        this.pages = pages;
        this.minpage = minpage;
        this.maxpage = maxpage;
    }

    public int getPages() {
        return pages;
    }

    public int getMinpages() {
        return minpages;
    }

    public int getMaxpages() {
        return maxpages;
    }*/



}