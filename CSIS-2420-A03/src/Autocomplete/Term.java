package Autocomplete;

import java.util.Comparator;

public class Term implements Comparable<Term>{
	
	private String query;
	private double weight;
	
	 // Initialize a term with the given query string and weight.
    public Term(String query, double weight) {
    	
    	this.query = query;
		this.weight = weight;
    }

	// Compare the terms in descending order by weight.
    public static Comparator<Term> byReverseWeightOrder(){
		return null;
    	
    }

    // Compare the terms in lexicographic order but using only the first r characters of each query.
    public static Comparator<Term> byPrefixOrder(int r){
		return null;
    	
    }

    // Compare the terms in lexicographic order by query.
    public int compareTo(Term that) {
		return 0;
    	
    }

    @Override
	public String toString() {
		return "Term [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
