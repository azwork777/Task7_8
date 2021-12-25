package test.ru.vsu.cs.zhikhorev_a_a;

import org.junit.*;
import ru.vsu.cs.zhikhorev_a_a.Main;
import ru.vsu.cs.zhikhorev_a_a.Solution;
import ru.vsu.cs.zhikhorev_a_a.TestTemplates;


public class SolutionTest {

    TestTemplates testTemplates = new TestTemplates();
    Solution solution = new Solution();

    @Before
    public void reportOfTestOperation() {
        System.out.println("Test is running...");

    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest1() {

        Main.printArray(testTemplates.arr1);
        Assert.assertEquals(6, solution.findMaxSumOfConsecutiveElements(testTemplates.arr1));
    }


    @Test
    public void findMaxSumOfConsecutiveElementsTest2() {

        Main.printArray(testTemplates.arr2);
        Assert.assertEquals(6, solution.findMaxSumOfConsecutiveElements(testTemplates.arr2));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest3() {

        Main.printArray(testTemplates.arr3);
        Assert.assertEquals(300, solution.findMaxSumOfConsecutiveElements(testTemplates.arr3));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest4() {

        Main.printArray(testTemplates.arr4);
        Assert.assertEquals(300, solution.findMaxSumOfConsecutiveElements(testTemplates.arr4));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest5() {

        Main.printArray(testTemplates.arr5);
        Assert.assertEquals(7, solution.findMaxSumOfConsecutiveElements(testTemplates.arr5));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest6() {

        Main.printArray(testTemplates.arr6);
        Assert.assertEquals(6, solution.findMaxSumOfConsecutiveElements(testTemplates.arr6));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest7() {

        Main.printArray(testTemplates.arr7);
        Assert.assertEquals(14, solution.findMaxSumOfConsecutiveElements(testTemplates.arr7));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest8() {

        Main.printArray(testTemplates.arr8);
        Assert.assertEquals(15, solution.findMaxSumOfConsecutiveElements(testTemplates.arr8));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest9() {

        Main.printArray(testTemplates.arr9);
        Assert.assertEquals(15, solution.findMaxSumOfConsecutiveElements(testTemplates.arr9));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest10() {

        Main.printArray(testTemplates.arr10);
        Assert.assertEquals(20, solution.findMaxSumOfConsecutiveElements(testTemplates.arr10));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest11() {

        Main.printArray(testTemplates.arr11);
        Assert.assertEquals(0, solution.findMaxSumOfConsecutiveElements(testTemplates.arr11));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest12() {

        Main.printArray(testTemplates.arr12);
        Assert.assertEquals(0, solution.findMaxSumOfConsecutiveElements(testTemplates.arr12));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest13() {

        Main.printArray(testTemplates.arr13);
        Assert.assertEquals(-1, solution.findMaxSumOfConsecutiveElements(testTemplates.arr13));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest14() {

        Main.printArray(testTemplates.arr14);
        Assert.assertEquals(5, solution.findMaxSumOfConsecutiveElements(testTemplates.arr14));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest15() {

        Main.printArray(testTemplates.arr15);
        Assert.assertEquals(12, solution.findMaxSumOfConsecutiveElements(testTemplates.arr15));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest16() {

        Main.printArray(testTemplates.arr16);
        Assert.assertEquals(18, solution.findMaxSumOfConsecutiveElements(testTemplates.arr16));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest17() {

        Main.printArray(testTemplates.arr17);
        Assert.assertEquals(26, solution.findMaxSumOfConsecutiveElements(testTemplates.arr17));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest18() {

        Main.printArray(testTemplates.arr18);
        Assert.assertEquals(54, solution.findMaxSumOfConsecutiveElements(testTemplates.arr18));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest19() {

        Main.printArray(testTemplates.arr19);
        Assert.assertEquals(1, solution.findMaxSumOfConsecutiveElements(testTemplates.arr19));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest20() {

        Main.printArray(testTemplates.arr20);
        Assert.assertEquals(-5, solution.findMaxSumOfConsecutiveElements(testTemplates.arr20));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest21() {

        Main.printArray(testTemplates.arr21);
        Assert.assertEquals(13, solution.findMaxSumOfConsecutiveElements(testTemplates.arr21));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest22() {

        Main.printArray(testTemplates.arr22);
        Assert.assertEquals(1, solution.findMaxSumOfConsecutiveElements(testTemplates.arr22));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest23() {

        Main.printArray(testTemplates.arr23);
        Assert.assertEquals(2, solution.findMaxSumOfConsecutiveElements(testTemplates.arr23));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest24() {

        Main.printArray(testTemplates.arr24);
        Assert.assertEquals(1, solution.findMaxSumOfConsecutiveElements(testTemplates.arr24));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest25() {

        Main.printArray(testTemplates.arr25);
        Assert.assertEquals(1, solution.findMaxSumOfConsecutiveElements(testTemplates.arr25));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest26() {

        Main.printArray(testTemplates.arr26);
        Assert.assertEquals(5, solution.findMaxSumOfConsecutiveElements(testTemplates.arr26));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest27() {

        Main.printArray(testTemplates.arr27);
        Assert.assertEquals(0, solution.findMaxSumOfConsecutiveElements(testTemplates.arr27));
    }

    @Test
    public void findMaxSumOfConsecutiveElementsTest28() {

        Main.printArray(testTemplates.arr28);
        Assert.assertEquals(-5, solution.findMaxSumOfConsecutiveElements(testTemplates.arr28));
    }
}



