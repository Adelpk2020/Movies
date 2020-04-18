package com.example.moviesmvp.UI;


import com.example.moviesmvp.Model.MovieModel;

public class MoviePresenter {
    MovieView movieView;

    public MoviePresenter(MovieView movieView) {
        this.movieView = movieView;
    }
    public MovieModel getMovieFromDB(){

        return new MovieModel("GodFatherII","1/1/2008",8.9);
    }
    public void getMovie(){
        movieView.onGetMovie(getMovieFromDB().getName()+"\n"+getMovieFromDB().getDate()+"\n"+getMovieFromDB().getRate()+" ⭐⭐⭐");
    }
}
