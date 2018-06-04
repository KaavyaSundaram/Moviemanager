package com.example.kaavyasundaram.moviemanager.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kaavyasundaram.moviemanager.R;
import com.example.kaavyasundaram.moviemanager.adapter.MovieRecyclerViewAdapter;
import com.example.kaavyasundaram.moviemanager.models.Movie;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpcomingFragment extends Fragment {

    @BindView(R.id.rvMovies)
    RecyclerView rvMovies;
    private List<Movie> movies;


    public UpcomingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_upcoming, container, false);

        ButterKnife.bind(this, view);

        initializeData();

        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());
        rvMovies.setHasFixedSize(true);
        rvMovies.setLayoutManager(llm);

        MovieRecyclerViewAdapter adapter = new MovieRecyclerViewAdapter(this.getContext(), movies);
        rvMovies.setAdapter(adapter);

        return view;
    }


    private void initializeData() {
        movies = new ArrayList<>();
        movies.add(new Movie("277834", "Rings", "Julia (Matilda Lutz) becomes worried about her boyfriend, Holt (Alex Roe) when he explores the dark urban legend of a mysterious videotape said to kill the watcher seven days after viewing. She sacrifices herself to save her boyfriend and in doing so makes a horrifying discovery: there is a \\\"movie within the movie\\\" that no one has ever seen before.", 0f, 0, "https://images-na.ssl-images-amazon.com/images/I/516dMSjnKaL.jpg", "/91WPDonXsxRzi7AcfedKM3p3NFU.jpg"));
        movies.add(new Movie("121856", "The Great Wall", "The story of an elite force making a last stand for humanity on the world’s most iconic structure.", 0f, 0, "https://images.mpic.ws/2017/05/12/the-great-wall-BD6b579.jpg", "/yESCAoZkaxZ2AMiHojl9jYYd9zD.jpg"));
        movies.add(new Movie("330459", "Patriots Day", "An account of Boston Police Commissioner Ed Davis's actions in the events leading up to the 2013 Boston Marathon bombing and the aftermath, which includes the city-wide manhunt to find the terrorists behind it.", 0f, 0, "https://www.new-mastermovie.com/wp-content/uploads/2017/01/Patriots-Day-2016.jpg", "/tiBL4PeaCPKGBz3qO4dJP2KzKop.jpg"));
        movies.add(new Movie("283366", "T2 Trainspotting", "First there was an opportunity......then there was a betrayal. Twenty years have gone by. Much has changed but just as much remains the same. ", 0f, 0, "http://img.moviepostershop.com/t2-trainspotting-movie-poster-2017-1020777326.jpg", "/dxJynNxoG6jRttYPoXOGx7OWJvq.jpg"));

    }

}