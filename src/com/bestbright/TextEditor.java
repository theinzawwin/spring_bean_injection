package com.bestbright;

public class TextEditor {

	private SpellChecker spellChecker;
	public TextEditor(){
		
	}
	public TextEditor( SpellChecker spellChecker, String name ) {
	      this.spellChecker = spellChecker;
	      this.name = name;
	   }
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}
