package org.eclipse.che.examples;

public class Book {
    int pages;

    public Book(int pages) {
        this.pages = pages;
    }

    public int getPages(){
        return pages;
    }

    public boolean checkPageExist(int pe) {
        if (pe <= pages) {
            return true;
        }
        else {
            return false;
        }

    }

    public void setPages (int np){
        pages = np;
    }
}