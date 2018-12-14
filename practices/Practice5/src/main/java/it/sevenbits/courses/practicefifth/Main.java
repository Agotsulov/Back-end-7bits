package it.sevenbits.courses.practicefifth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(final String[] args) {
        Random random = new Random();
        ListOperator listOperator = new ListOperator();


        List<Integer> ints = new ArrayList<>();
        List<Account> accounts = new LinkedList<>();


        for (int i = 0; i < 10;i++) {
            ints.add(random.nextInt(100));
            accounts.add(new Account(random.nextInt(100)));
        }

        System.out.println("Before");
        System.out.println(ints);
        System.out.println(accounts);

        System.out.println("max start=3 end=8");
        System.out.println(listOperator.max(ints, 3, 8));
        System.out.println(listOperator.max(accounts, 3, 8));

        System.out.println("After changeElementsPosition 1 and 8");
        listOperator.changeElementsPosition(ints, 1, 9);
        listOperator.changeElementsPosition(accounts, 1, 9);
        System.out.println(ints);
        System.out.println(accounts);


        ThreadExecutor threadExecutor = new ThreadExecutor();
        try {
            threadExecutor.showAccountFilling(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}


