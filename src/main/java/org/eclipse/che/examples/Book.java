/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class Book {
    int pages;

    public Book (int pages){
        this.pages = 24;
    }
    
    public boolean hasPage(int x){
        if (x <= pages) {
            return true;} 
        else {
            return false;}
        
    }
    public int getPages(){
        return pages;

    }
}
