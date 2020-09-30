package com.example.spring5WebApp.Bootstrap;

import com.example.spring5WebApp.Models.Author;
import com.example.spring5WebApp.Models.Book;
import com.example.spring5WebApp.Models.Publisher;
import com.example.spring5WebApp.Repositories.AuthorRepository;
import com.example.spring5WebApp.Repositories.BookRepository;
import com.example.spring5WebApp.Repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Is this working?");

        Publisher publisher = new Publisher("Random House", "100 Book Drive", "Springfied", "IL", "12309");
        publisherRepository.save(publisher);
        System.out.println("Publisher Count: " + publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "246813579");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getCatalog().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development Without EJB", "459823715");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getCatalog().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);


        System.out.println("There are " + bookRepository.count() + " books.");
        System.out.println("Publisher number of books " + publisher.getCatalog().size());

    }
}