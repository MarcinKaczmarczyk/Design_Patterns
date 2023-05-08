package adapter.zadanie.api;

import adapter.zadanie.User;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI{
    LibraryAPIv2 libraryAPI;
    User user;

    public APIAdapter(LibraryAPIv2 libraryAPI, User user) {
        this.libraryAPI = libraryAPI;
        this.user = user;
    }

    @Override
    public boolean isAviable(String bookTitle) {
        return libraryAPI.numberOfAviableCopies(bookTitle)>0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryAPI.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryAPI.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }
}
