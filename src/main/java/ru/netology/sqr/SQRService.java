package ru.netology.sqr;

public class SQRService {
    public int numberSQR(int min, int max) {
        int numberSqr = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= min && sqr <= max) {
                numberSqr = numberSqr + 1;
            }
            // проверка условия выхода из цикла, не доходя до конца,если квадрат числа выходит за максимум диапазона
            if (sqr > max) {
                return numberSqr;
            }

        }
        return numberSqr;
    }

}
