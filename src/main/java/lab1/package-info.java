/**
 *
 * Задание_1
 * Создать три периодические нити t1, t2, t3 , которые, работая 20 циклов,
 * выполняют вывод текстовой строки с периодами p1=500 ms, p2=1000 ms, p3=1500 ms соответственно.
 * Используя функции join() и join(long millis) , обеспечить следующую последовательность работы ниток:
 * 1. Запускается нитка t3
 * 2. По истечение 6 секуд запускается нитка T1
 * 3. По завершении работы нитки T1 запускается нитка Т2
 * 4. По завершению работы всех ниток на экран выводится сообщение об окончании работы приложения.
 *
 * @since 17.02.18
 * @author Mikhail Kubar
 * @version 1.0
 */
package lab1;