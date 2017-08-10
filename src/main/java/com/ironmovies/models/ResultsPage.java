package com.ironmovies.models;

import com.ironmovies.models.Movie;

import java.io.Serializable;
import java.util.List;

public class ResultsPage implements Serializable {
    static final long serialVersionUID = 42L;
    public List<Movie> results;

    public ResultsPage() {
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }
}
