import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.example.SimpleTask;
import org.example.Epic;
import org.example.Meeting;
import org.example.Todos;
import org.example.Task;

//SimpleTaskSearchWorksRelevantValue
//MeetingSearchWorksRelevantValueTopic
//EpicSearchWorksRelevantValue3


public class TasksTest {

    @Test
    public void SimpleTaskSearchWorksRelevantValue() { //проверка SimpleTask с релевантным значением
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить родителям");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SimpleTaskSearchWorksNotRelevantValue() {  //проверка SimpleTask с нерелевантным значением
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("Неверное значение");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingSearchWorksRelevantValueProject() {  // проверка Meeting с корректным вводом Project
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingSearchWorksRelevantValueTopic() {   // проверка Meeting с корректным вводом Topic
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingSearchWorksNotRelevantValue() {   // проверка Meeting с некорректным вводом
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("Неверное значение");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EpicSearchWorksRelevantValue1() {  // проверка Epic с корректным вводом значения 1

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Молоко");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EpicSearchWorksRelevantValue2() {  // роверка Epic с корректным вводом значения 2

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Яйца");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EpicSearchWorksRelevantValue3() { // роверка Epic с корректным вводом значения 3

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Хлеб");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EpicSearchWorksNotRelevantValue() { // роверка Epic с некорректным вводом значения

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Неверное значение");
        Assertions.assertEquals(expected, actual);
    }






}
