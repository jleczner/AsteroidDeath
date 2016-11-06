package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jonathanleczner on 11/5/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Page {
    private int size, total_elements, total_pages, number;

    public Page() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal_elements() {
        return total_elements;
    }

    public void setTotal_elements(int total_elements) {
        this.total_elements = total_elements;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
