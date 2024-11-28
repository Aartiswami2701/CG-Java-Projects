package com.cg.sorting;

public class EmployeeNameMerge {
    protected int id;
    protected String name;
    int salary;

    public EmployeeNameMerge(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        EmployeeNameMerge[] es = new EmployeeNameMerge[5];
        System.out.println("Employee Details before sorting: ");
        es[0] = new EmployeeNameMerge(1, "Aarti", 200000);
        es[1] = new EmployeeNameMerge(2, "Aditi", 100000);
        es[2] = new EmployeeNameMerge(3, "Shubham", 900000);
        es[3] = new EmployeeNameMerge(4, "Manshree", 600000);
        es[4] = new EmployeeNameMerge(5, "Adi", 400000);
        print(es);
        
        mergeSort(es);
        
        System.out.println("Employee Details after sorting: ");
        print(es);
    }

    private static void mergeSort(EmployeeNameMerge[] es) {
        if (es.length < 2) {
            return;
        }
        int mid = es.length / 2;
        EmployeeNameMerge[] left = new EmployeeNameMerge[mid];
        EmployeeNameMerge[] right = new EmployeeNameMerge[es.length - mid];

        System.arraycopy(es, 0, left, 0, mid);
        System.arraycopy(es, mid, right, 0, es.length - mid);

        mergeSort(left);
        mergeSort(right);
        merge(es, left, right);
    }

    private static void merge(EmployeeNameMerge[] es, EmployeeNameMerge[] left, EmployeeNameMerge[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int arrayIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].name.compareTo(right[rightIndex].name) <= 0) {
                es[arrayIndex++] = left[leftIndex++];
            } else {
                es[arrayIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            es[arrayIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            es[arrayIndex++] = right[rightIndex++];
        }
    }

    private static void print(EmployeeNameMerge[] es) {
        int n = es.length;
        for (int i = 0; i < n; ++i) 
            System.out.print(es[i] + " "); 
        System.out.println();
    }
}
