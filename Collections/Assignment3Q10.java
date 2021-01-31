
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Assignment3Q10 {
    
    public static ArrayList<MovieDetails> al= new ArrayList<> ();
    
    static Scanner ss= new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("enter the nmber of movie details : ");
        int ne=ss.nextInt();

        for (int j=0;j<ne;j++){

            System.out.print("enter the movieName : ");
            String m=ss.next();
            
            System.out.print("enter the actor     : ");
            String a=ss.next();

            System.out.print("enter the actress   : ");
            String n=ss.next();

            System.out.print("enter the genre     : ");
            String i=ss.next();

            al.add(new MovieDetails(m,a,n,i));
        }
        
        printSortedMovieList(al);
        
        
        
        System.out.print("if you want to add a movie then type 'yes' : ");
        String m=ss.next();
        
        if (m=="yes") {
             System.out.print("enter the movieName : ");
             String ma=ss.next();
             
             System.out.print("enter the actor     : ");
             String a=ss.next();

             System.out.print("enter the actress   : ");
             String n=ss.next();

             System.out.print("enter the genre     : ");
             String i=ss.next();
            new Assignment3Q10().addMovie(new MovieDetails(ma,a,n,i));
            }
        
        
        
        System.out.print("if you want to remove a movie then type 'yes' : ");
        String i=ss.next();
        
        if (i=="yes") {
            System.out.print("enter the movieName : ");
            String man=ss.next();
            new Assignment3Q10().removeMovies(man);
            }
        
        
        
        System.out.print("if you want to find a movie then type 'yes' : ");
        String ia=ss.next();
        
        if (ia=="yes") {
            System.out.print("enter the movieName : ");
            String man=ss.next();
            new Assignment3Q10().find_movie_By_mov_Name(man);
            }
        
        
        
        
        
        
        
        
    }

    public static void sort(ArrayList<MovieDetails> movieDetails,Comparator<MovieDetails> movieDetailsComparator){
        movieDetails.stream().sorted(movieDetailsComparator).forEach(e -> System.out.println(e));
        
    }

    public static void printSortedMovieList(ArrayList<MovieDetails> movieDetails){

        Comparator<MovieDetails> com = new Comparator<>() {
            public int compare(MovieDetails a, MovieDetails b) { return a.getMovieName().compareTo(b.getMovieName());}
        };
        
        sort(movieDetails,com);
    }
    
    
    
    public void addMovie(MovieDetails movie) {al.add(movie);}
    
    
    public void removeMovies(String movieName) {
        al.removeIf(t -> t.getMovieName().equals(movieName));
    }

    public void removeAllMovies(List<MovieDetails> movies) {
        //for(MovieDetails s :movies) {al.removeIf(t -> t.getMovieName().equals(s.getMovieName()));}
        for(MovieDetails s :movies) {removeMovies(s.getMovieName());}
    }

    public MovieDetails find_movie_By_mov_Name(String movieName) {
        
        MovieDetails s= al.stream().filter(c -> c.getMovieName().equals(movieName)).findAny().get();
        return s;
    }

    public List<MovieDetails> find_movie_By_Genre(String genre) {
        List<MovieDetails> l = new ArrayList<>(); 
        al.stream().filter(c -> c.getGenre().equals(genre)).forEach(e -> l.add(e));
        return l;
    }

    public static Comparator<MovieDetails> sortAccordingly(String sortBy) {
         Comparator<MovieDetails> com = new Comparator<MovieDetails>() {
            public int compare(MovieDetails a, MovieDetails b) { return a.getMovieName().compareTo(sortBy);}
         };
            
            return com;
         
    }
}


class MovieDetails {
    private String movieName;
    private String actor;
    private String actress;
    private String genre;
    
    
    public MovieDetails(String movieName, String actor, String actress, String genre) {
        super();
        this.movieName = movieName;
        this.actor = actor;
        this.actress = actress;
        this.genre = genre;
    }
    
    
    public String getMovieName() {return movieName;}
    public String getActor() {return actor;}
    public String getActress() {return actress;}
    public String getGenre() {return genre;}
    
    
    public void setMovieName(String movieName) {this.movieName = movieName;}
    public void setActor(String actor) {this.actor = actor;}
    public void setActress(String actress) {this.actress = actress;}
    public void setGenre(String genre) {this.genre = genre;}
    
    public String toString(){ return "MovieName: "+this.movieName+"  Actor: "+this.actor+"  actress: "+this.actress+"  genre: "+this.genre+"  ";}

}

