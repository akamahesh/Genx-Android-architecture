package com.genx.app.api;

import com.genx.app.Joke;

import retrofit2.http.GET;
import rx.Observable;

public interface JokeService {

    @GET("jokes/random")
    Observable<Joke> getRandomJoke();
}
