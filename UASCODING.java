package Model;
import java.util.ArrayList;
import java.util.Scanner;

public class UASCODING {
    private String IDMovie ;
    private int JumTicket;
    private String MovieName;
    private int MoviePrice;
    private String UserName;
    public UASCODING(){

    }


    public String getIDMovie() {
        return IDMovie;
    }

    public void setIDMovie(String IDMovie) {
        this.IDMovie = IDMovie;
    }

    public int getJumTicket() {
        return JumTicket;
    }

    public void setJumTicket(int jumTicket) {
        JumTicket = jumTicket;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public int getMoviePrice() {
        return MoviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        MoviePrice = moviePrice;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }


    public static void main(String[] args) {

        UASCODING Avatar= new UASCODING();
        int jumUser = 20;
        Scanner sc = new Scanner(System.in);
        ArrayList<UASCODING> nontonApa = new ArrayList<>();
        System.out.println("FILM YANG AKAN DI TONTON : ");
        String movieSelect = sc.nextLine();
        ArrayList<String> myUser1 = new ArrayList<>();
        UASCODING    pesanan = new UASCODING();
        for(int index=0; index<jumUser;index++){
            System.out.println("NAMA USER : ");
            String myUser = sc.nextLine();
            myUser1.add(myUser);
            pesanan.setIDMovie("1");
            pesanan.setJumTicket(jumUser);
            pesanan.setMovieName(movieSelect);
            pesanan.setMoviePrice(55000);
            pesanan.setUserName(String.valueOf(myUser1));
            nontonApa.add(pesanan);
            System.out.println("NAMA PENONTON " + myUser);
            jumUser--;
            System.out.println("SISA TIKET " +jumUser);
            System.out.println("ROOM CINEMA "+"1");
            System.out.println("FILM YANG DITONTON "+movieSelect);
            System.out.println("HARGA TIKET : " +45000);
        }
        for (int index = 0;index<jumUser;index++){
            System.out.println( "DATA PENONTON" +myUser1);
        }

    }

}

