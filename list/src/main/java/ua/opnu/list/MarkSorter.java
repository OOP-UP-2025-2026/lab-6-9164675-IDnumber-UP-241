package ua.opnu.list;

import java.util.Comparator;

public class MarkSorter implements Comparator {

    private boolean order;

    public MarkSorter(boolean order) {
        this.order = order;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;

            double mark1 = s1.getAvgMark();
            double mark2 = s2.getAvgMark();

            int result;

            if (mark1 < mark2) {
                result = -1;
            } else if (mark1 > mark2) {
                result = 1;
            } else {
                result = 0;
            }

            // Застосування логіки order
            if (order) {
                return result; // Прямий порядок (зростання балів)
            } else {
                return -result; // Зворотний порядок (спадання балів)
            }
        }
        return 0;
    }
}