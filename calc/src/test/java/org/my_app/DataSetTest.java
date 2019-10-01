package org.my_app;

import org.junit.Test;
import static org.junit.Assert.*;


public class DataSetTest {
    private DataSet data;
    private final double delta = 0.0000000001; //точность для сравнения double значений
    
    @Test
    public void testInput(){   //проверка инициализации DataSet значениями
        data = new DataSet(12, 4, '+');
        assertEquals(data.getNum1(), 12, delta);
        assertEquals(data.getNum2(), 4, delta);
        assertEquals(data.getOperation(), '+');
    }

    @Test
    public void testUnknownOperation(){   //проверка на корректность выбранной операции
        data = new DataSet(12, 4, '$');
        assertEquals(data.isOperationWrong(), true);
    }
}


