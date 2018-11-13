package oo.inheritance.case_02;

import lombok.Data;

@Data
public class Book extends Product {
    protected   String author;
    protected String isbn;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("author='").append(author).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
