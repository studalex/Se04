import java.util.GregorianCalendar;

public class Main {
    /*
      Дана коллекция фильмов, содержащая информацию об актерах,
      снимавшихся в главных ролях (один актер мог сниматься и в нескольких фильмах).
      Необходимо написать приложение, позволяющее при запуске восстанавливать коллекцию фильмов,
      позволять ее модифицировать, а по завершении работы приложения – сохранять (в файл).
      Для восстановления/сохранения коллекции использовать  сериализацию/десериализацию.
      */

    public static void main(String[] args) {

        //Создаем колелкцию фильмов
        FilmCollection myFavoriteMove = new FilmCollection();

        //Добавляем в коллекцию фильмы
        myFavoriteMove.addFilm("Kill Bill", new GregorianCalendar(2010, 10, 1), "Film about...", "Uma Turman", "Bruce Lee");
        myFavoriteMove.addFilm("Dragon", new GregorianCalendar(2015,10,10), "Bruce Lee forever", "Bruce Lee");
        myFavoriteMove.addFilm("The Avengers", new GregorianCalendar(2000, 10, 1), "Some descriptions", "Uma Turman");

        //Просмотриваем коллекцию фильмов
        System.out.println(myFavoriteMove);

        //Изменяем информацию о фильме
        myFavoriteMove.changeFilmActers("The Avengers", "Bruce Lee");

        //Просмотриваем коллекцию фильмов
        System.out.println(myFavoriteMove);

        //Сохраняем коллекцию
        FilmCollectionsIO.save(myFavoriteMove);

        //Удаляем коллекцию
        myFavoriteMove = null;

        //Загружаем и просматриваем
        myFavoriteMove = FilmCollectionsIO.load();
        System.out.println(myFavoriteMove);

    }
}
