package s01_01.n3ejercicio1;
import java.util.ArrayList;

public class Redactor {
    protected final String DNI;
    private String name;
    private double salary = 1500;
    private ArrayList<News> writtenNews;

    public Redactor(String name, String dni) {
        this.name = name;
        DNI = dni;
        this.salary = salary;
        this.writtenNews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<News> getWrittenNews() {
        return writtenNews;
    }

    public String getDni() {
        return DNI;
    }

    public double getSalary() {
        return salary;
    }

    public void crearNews(News news) {
        writtenNews.add(news);
    }
    public void eliminarNews(News news) {
        writtenNews.remove(news);
    }

    public String toString() {
        return "Redactor" +
                "name='" + name + '\'' +
                ", dni='" + DNI + '\'' +
                ", salary=" + salary;
    }
}
