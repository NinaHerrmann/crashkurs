/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class Book {

    int pages;
  //  private String[][] telefonbuchInhalt = new String[10][10];
    private String[][] telefonbuchInhalt;

    /*Konstruktor*/
    public Book(int pages) {
        this.pages = pages;
        telefonbuchInhalt = new String[pages][pages];
        telefonbuchInhalt[0][0] = "Nina" + "0";
        telefonbuchInhalt[1][1] = "Dopatka" + "1";
        telefonbuchInhalt[2][2] = "Kirchkesner" + "2";
        telefonbuchInhalt[3][3] = "Meier" + "3";  
        }
    public Book(){
    }

    public void setPages(int page) {
        pages = page;
    }

    public String getTelefonbuchInhalt(int array1, int array2){
        return telefonbuchInhalt[array1][array2];
    }

    public void setEntry(int i, int j, String array1){
        telefonbuchInhalt[i][j] = array1;
    }


    public void fillArray (){
        for (int k=0; k<telefonbuchInhalt.length; k++){
            for (int t=0; t<telefonbuchInhalt.length; t++) {
                telefonbuchInhalt[k][t] = String.valueOf((char)(k+65)) + " " + String.valueOf((char)(t+97));
            }
        }
    }

    public int getPages(){
        return pages;
    }

    public int getLength(){
        return telefonbuchInhalt.length;
    }

    public boolean hasPage(int pagenumber){
        if (pagenumber < 0 || pagenumber > pages) {
            return false;
        } else {
            return true;
        }
    }
}
