/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class Book {

    int pages;
    private String[][] telefonbuchInhalt;

    //Konstruktor
    public Book(int pages) {
        this.pages = pages;
        telefonbuchInhalt = new String[pages][pages];
    }

    public void setPages(int page) {
        pages = page;
    }

    public void setEntry(int i, int j, String array1){
        telefonbuchInhalt[i][j] = array1;
    }

    public int getLength(){
        return telefonbuchInhalt.length;
    }

    public void fillArray(){
        for (int k=0; k<telefonbuchInhalt.length; k++){
            for (int l=0; l<telefonbuchInhalt.length; l++) {
                telefonbuchInhalt[k][l] = String.valueOf((char)(k+65)) + " " + String.valueOf((char)(l+97));
            }
        }  
    }

    public String getTelefonbuchInhalt(int array1, int array2){
        return telefonbuchInhalt[array1][array2];
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
