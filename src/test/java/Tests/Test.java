package Tests;
/**
 * Created by slobse01 on 07.02.2018.
 */

import io.qameta.allure.Step;

import static Main.Figure_Triangle.*;
import static org.testng.Assert.assertEquals;

public class Test {
    @org.testng.annotations.Test
    @Step
    public void TriangleHaveNotNegativeSides() {
        assertEquals(error, IdentifyTriangle(-15, 10, 13));
        assertEquals(error, IdentifyTriangle(20, -15, 22));
        assertEquals(error, IdentifyTriangle(20, 32, -15));
        assertEquals(error, IdentifyTriangle(25, -12, -3));
        assertEquals(error, IdentifyTriangle(-25, -12, -3));
    }
    @org.testng.annotations.Test
    @Step
    public void TriangleIsEquilateral() {
        assertEquals(Equilateral, IdentifyTriangle(15, 15, 15));
        assertEquals(Equilateral, IdentifyTriangle(6, 6, 6));
        assertEquals(Equilateral, IdentifyTriangle(1, 1, 1));
    }
    @org.testng.annotations.Test
    @Step
    public void TriangleIsIsosceles() {
        assertEquals(Isosceles, IdentifyTriangle(20, 20, 5));
        assertEquals(Isosceles, IdentifyTriangle(5, 9, 5));
        assertEquals(Isosceles, IdentifyTriangle(3, 10, 10));
    }
    @org.testng.annotations.Test
    @Step
    public void TriangleIsScalene() {
        assertEquals(Scalene, IdentifyTriangle(15, 20, 10));
        assertEquals(Scalene, IdentifyTriangle(13, 14, 16));
        assertEquals(Scalene, IdentifyTriangle(20, 30, 15));
        assertEquals(Scalene, IdentifyTriangle(5, 4, 3));
        assertEquals(error, IdentifyTriangle(5, 3, 8));
    }

}
