package org.eclipse.che.examples;

public class book {
    int pages;

    public void setpages(int pages){
        this.pages = 24;
    }
    
    public boolean hasPages(int x){
        if (x <= pages) {
                return true;}
            else {
                return false;}
            }
    public int getPages(){
        return pages;
    }
public book (int pages){
    this.pages = pages;
}
    }