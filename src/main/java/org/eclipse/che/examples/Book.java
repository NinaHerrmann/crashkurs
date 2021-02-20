package org.eclipse.che.examples;

public class Book{
    int pages;

    public void setpages(int pages){
        this.pages = pages;
    }

    public boolean checkpages(int input){
        if(input <= pages){
            return true;
        }else{
            return false;
        }
    }

    public int getpages(){
        return pages;
    }
public Book(int pages){
    this.pages = pages;
}
}
