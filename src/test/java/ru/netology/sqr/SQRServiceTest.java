package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'test range 200 - 300',200,300,3",
            "'test range 10 - 100',10,100,1",
            "'test range 400 - 400',400,400,1",
            "'test range 9000 - 10000',9000,10000,5",
            "'test range 10 - 90',10,90,0",
            "'test range 10000 - 11000',10000,11000,0",
            "'test range 9800 - 10000',9800,10000,1"})
    void souldNumberSQR(String testname, int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.numberSQR(min, max);
        assertEquals(expected, actual);
    }
}