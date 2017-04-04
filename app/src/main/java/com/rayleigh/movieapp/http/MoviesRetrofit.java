package com.rayleigh.movieapp.http;

import com.rayleigh.movieapp.model.MovieSearchResult;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface MoviesRetrofit {
    @GET("./")
    Observable<MovieSearchResult> search(@Query("s") String q, @Query("r") String format);
}
