/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21library;

import Entity.Author;
import Entity.Book;
import java.util.Arrays;
import java.util.Scanner;
import managers.BookManager;

/**
 *
 * @author pupil
 */
public class App {
    
    private Book[] books ;
    
    public App(){
        this.books = new Book[0];
        
    }
   
    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("spisok zada4");
            System.out.println("0. zakritj ");
            System.out.println("1. dobavitj knigu");
            System.out.println("2. dobavitj 4itatelja");
            System.out.println("3. vidatj knigu");
            System.out.println("4. vernutj knigu");
            System.out.println("5. spisok knig");
            System.out.println("viberi nomer");

            int task = scanner.nextInt();
            scanner.nextLine();
            switch(task){
                case 0: 
                    repeat = false;
                    break;
                default:
                case 1:
                    System.out.println("1.dobavitj knigu");
                    BookManager bookManager = new BookManager();
                    
                    this.books = Arrays.copyOf(this.books, this.books.length +1);
                    this.books[this.books.length -1] = bookManager.createBook();
                    break;
                case 2:
                    System.out.println("2.obavitj 4itatelja");
                    break;
                case 3:
                    System.out.println("3.vidatj knigu");
                    break;
                case 4: 
                    System.out.println("4.vernutj knigu");
                    break;
                case 5:  
                    System.out.println("5.spisok knig");
                    for (int i = 0; i < books.length; i++){
                        Book book = books[i]; 
                        System.out.printf("book title = %s%n", book.getTitle());
                        for (int j = 0; j < book.getAuthors().length; j++) {
                            Author author = book.getAuthors()[j];
                            System.out.printf("\t Authors = [%n%s %s"
                                    ,author.getFirstName(),author.getLastName());
    
                        }
                    break;
                    }
  
            }

        }while(repeat);
        
        
        
        
        
        
        
    }
}
