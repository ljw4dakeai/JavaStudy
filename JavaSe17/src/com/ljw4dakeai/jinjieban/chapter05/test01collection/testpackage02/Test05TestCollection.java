package com.ljw4dakeai.jinjieban.chapter05.test01collection.testpackage02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 * @author ZJH
 */
public class Test05TestCollection {
    public static void main(String[] args) throws ParseException {
        ArrayList<Movie> movies = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Movie movieOne = new Movie("《肖申克的救赎》", simpleDateFormat.parse("1994-05-01"), "犯罪", new String[]{"蒂姆", "罗宾斯"});
        Movie movieTwo = new Movie("《霸王别姬》", simpleDateFormat.parse("2000-11-18"), "爱情", new String[]{"张国荣"});
        Movie movieThree = new Movie("《阿甘正传》", simpleDateFormat.parse("1998-08-20"), "剧情", new String[]{"汤姆汉克斯"});
        movies.add(movieOne);
        movies.add(movieTwo);
        movies.add(movieThree);

        for (Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println("---------------------------------------------------");

        movies.forEach(System.out :: println);

    }
}
class Movie{
    private String movieName;
    private Date startTime;
    private String movieType;
    private String[] actors;
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy年MM月dd日");

    public Movie() {
    }

    public Movie(String movieName, Date startTime, String movieType, String[] actors) {
        this.movieName = movieName;
        this.startTime = startTime;
        this.movieType = movieType;
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", startTime=" + SIMPLE_DATE_FORMAT.format(startTime) +
                ", movieType='" + movieType + '\'' +
                ", actors=" + Arrays.toString(actors) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Movie movie)) {
            return false;
        }
        return Objects.equals(getMovieName(), movie.getMovieName()) && Objects.equals(getStartTime(), movie.getStartTime()) && Objects.equals(getMovieType(), movie.getMovieType()) && Arrays.equals(getActors(), movie.getActors());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getMovieName(), getStartTime(), getMovieType());
        result = 31 * result + Arrays.hashCode(getActors());
        return result;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }
}
