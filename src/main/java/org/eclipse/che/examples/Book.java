/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class Book {

    int pages;
    int entries = 10;

    String[][] names;


    public Book(int pages) {
        this.pages = pages;
        names = new String[pages][entries];
    }

    public void setPages() {
        //pages = page;
        for (int i = 0; i<pages; i++){
            for(int ii = 0; ii<entries; ii++){
                names[i][ii] = String.valueOf((char)(i+65)) + "-" + String.valueOf((char)(ii+97));
            }
        }

    }

    public int getPages(){
        return pages;
    }

    public boolean hasPage(int pagenumber){
        if (pagenumber < 0 || pagenumber > pages) {
            return false;
        } else {
            return true;
        }
    }
}
