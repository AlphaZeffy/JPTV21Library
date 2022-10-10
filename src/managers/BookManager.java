/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import Entity.Author;
import Entity.Book;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class BookManager {
    Scanner scanner = new Scanner(System.in);
    
    public Book createBook(){
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.print("vvedite nazvanie knnigi: ");
        book.setTitle(scanner.nextLine());
        System.out.println("vvedite 4islo avtorov knigi: ");
        int countAuthorsInBook= scanner.nextInt();
        scanner.nextLine();
        book.setAuthors(createAuthors(countAuthorsInBook)); 
        return book;
    }
    private Author[] createAuthors(int countAuthorsInBook){
        Author[] authors = new Author[countAuthorsInBook];
        for (int i = 0; i< countAuthorsInBook; i++ ){
            Author author = new Author();
            System.out.print("name" +(i+1)+": ");
            author.setFirstName(scanner.nextLine());
            System.out.print("sutname "+(i+1)+": ");
            author.setLastName(scanner.nextLine());
            authors[i] = author;
            
        }
        return authors;
    }
    
}