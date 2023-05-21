public class PostersMoviesManager {
    private int limitPosters = 5;

    public PostersMoviesManager() {
    }

    public PostersMoviesManager(int limitPosters) {
        this.limitPosters = limitPosters;
    }

    public int getLimitPosters() {
        return limitPosters;
    }

    public PostersMovies[] movies = new PostersMovies[0];

    public void addNewFilm(PostersMovies movie) {
        PostersMovies[] tmp = new PostersMovies[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }
    public PostersMovies[] findAll() {
        return movies;
    }
    public PostersMovies[] findLast() {
        int resultLenght;
        if (limitPosters == movies.length) {
            resultLenght = movies.length;
        } else {
            resultLenght = limitPosters;
        }
        PostersMovies[] result = new PostersMovies[resultLenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
