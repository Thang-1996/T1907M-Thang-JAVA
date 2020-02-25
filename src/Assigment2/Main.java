package Assigment2;

public class Main {
    public static void main(String[] args) {
        News news = new News();
        news.setID(1);
        news.setAuthor("thang");
        news.setTitle("NEW1");
        news.setContent("Content1");
        news.setPublishDate("24/2/2020");
        news.Caculate();
        news.getAverageRate();
        news.Display();
    }
}
