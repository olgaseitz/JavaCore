package lesson1;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Игрок 1", "Игрок 2", "Игрок 3", "Игрок 4"};
        Team team = new Team("Zenit", names);

        Course course = new Course(4);

        team.info();
        course.listObstacles();
        course.doIt(team);
        team.result();
      //  Team[] teams = new Team[]{
     //           new Player("Игрок А", 5),
    //            new Player("Игрок В", 8),
     //           new Player("Игрок С", 9),
     //           new Player("Игрок D", 4)
      //  };





    }
}
