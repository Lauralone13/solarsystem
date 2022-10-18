package com.lauralone.solarsystem.exercise2;

import java.util.Objects;

public class WordToKnow {
	
	private final String word;
	private final String description;
	
	public WordToKnow(String word, String description) {
		this.word = word;
		this.description = description;
	}
	
	public String getWord() {
		return word;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		WordToKnow that = (WordToKnow) o;
		return Objects.equals(word, that.word) && Objects.equals(description, that.description);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(word, description);
	}
	
	@Override
	public String toString() {
		return "WordToKnow{" + "word='" + word + '\'' + ", description='" + description + '\'' + '}';
	}
}
