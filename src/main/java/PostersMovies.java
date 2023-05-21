public class PostersMovies {
    private int idFilm;
    private String FilmTitle;
    private String FilmGenre;

    public PostersMovies(int idFilm, String FilmTitle, String FilmGenre) {
        this.setIdFilm(idFilm);
        this.setFilmTitle(FilmTitle);
        this.setFilmGenre(FilmGenre);
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getFilmTitle() {
        return FilmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        FilmTitle = filmTitle;
    }

    public String getFilmGenre() {
        return FilmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        FilmGenre = filmGenre;
    }
}
