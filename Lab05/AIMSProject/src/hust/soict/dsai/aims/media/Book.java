package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	
	private List<String> getAuthors() {
		return authors;
	}
	
	public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }

	public Book() {
		// TODO Auto-generated constructor stub
	}	
	public Book(String title) {
		setTitle(title);
	}
	public Book(String title, String category, List<String> authors, float cost) {
		setTitle(title);
		setCategory(category);
		this.authors = authors;
		setCost(cost);
	}
	public Book(int id, String title, String category, float cost) {
		setId(id);
		setTitle(title);
		setCategory(category);
		setCost(cost);
	}
	
	private String authorsToString() {
        StringBuilder sb = new StringBuilder();
        for (String author : authors) {
            sb.append(author).append(", ");
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book Title: ").append(getTitle()).append("\n");
        sb.append("Category: ").append(getCategory()).append("\n");
        sb.append("Authors: ").append(authorsToString()).append("\n");
        sb.append("Cost: ").append(getCost());
        return sb.toString();
    }
}
