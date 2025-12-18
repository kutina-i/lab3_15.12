import org.junit.Test;


public class TestsTasks {

    @Test
    public void testTask1(){
        Tasks task1 = new Tasks();
        task1.Task1(5);
    }

    @Test
    public void testTask2(){
        Tasks task2 = new Tasks();
        task2.Task2(7);
    }

    @Test
    public void testTask3(){
        Tasks task3 = new Tasks();
        task3.Task3(1, 1000);
    }

    @Test
    public void testTask4(){
        Tasks task4 = new Tasks();
        task4.Task4(1, 3000);
    }

    @Test
    public void testTask5(){
        Tasks task5 = new Tasks();
        task5.Task5(2.5, 5);
    }

    @Test
    public void testTask6(){
        Tasks task6 = new Tasks();
        task6.Task6();
    }

    @Test
    public void testTask7(){
        Tasks task7 = new Tasks();
        task7.Task7(25);
    }

    @Test
    public void testTask8(){
        Tasks task8 = new Tasks();
        task8.Task8(3);
    }

}
