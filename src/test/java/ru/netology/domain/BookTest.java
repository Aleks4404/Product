package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    public void shouldNotCastToDifferentClass1() {
        Product product = new Book();
    }

    @Test
    public void shouldHaveAllFieldsAndMethodFromSuperClass() {
        Book book1 = new Book(
                1,
                "Идиот",
                99,
                "Author",
                99,
                1000);
        Book book2 = new Book(1,
                "Идиот",
                99,
                "Author",
                99,
                1000);
        assertEquals(book1, book2);
//    book.
    }

    @Test
    public void shouldCastFromBaseClass() {
        Product product = new Book(
                1,
                "Идиот",
                99,
                "Author",
                99,
                1000);
        if (product instanceof Book) {
            Book book = (Book) product;
//      book.
        }
    }

    @Test
    public void shouldNotCastToDifferentClass() {
        Product product = new Book();
        TShirt shirt = (TShirt) product;
    }

    @Test
    public void shouldUseOverridedMethod() {
        Product product = new Book();
        // Вопрос к аудитории: чей метод вызовется?
        product.toString();
    }
}