package com.example.demo;
import org.junit.Test;
import java.util.IllegalFormatConversionException;
import static org.junit.Assert.assertEquals;

public class RoundedSizeRectangleTest  {

    @Test
    public void RRoundedSizeRectangleTest() {
        RoundedSizeRectangle restangle = new RoundedSizeRectangle(4.4f, 8.9f);
        int area = restangle.getArea(5,7);
        assertEquals (35,area);

    }
}
