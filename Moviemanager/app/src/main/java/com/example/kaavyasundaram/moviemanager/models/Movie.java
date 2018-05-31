package com.example.kaavyasundaram.moviemanager.models;

public class Movie {

    String id;
    String title;
    String overview;
    float voteAverage;
    float voteCount;
    String posterPath;
    String backdroPpath;

    public Movie(String id,String title,String overview,float voteAverage,float voteCount, String posterPath,String backdroPpath){
        this.id=id;
        this.title=title;
        this.overview=overview;
        this.voteAverage=voteAverage;
        this.voteCount=voteCount;
        this.posterPath=posterPath;
        this.backdroPpath=backdroPpath;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(float voteAverage) {
        this.voteAverage = voteAverage;
    }

    public float getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(float voteCount) {
        this.voteCount = voteCount;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getBackdroPpath() {
        return backdroPpath;
    }

    public void setBackdroPpath(String backdroPpath) {
        this.backdroPpath = backdroPpath;
    }
}
