package it.sevenbits.courses.practicefifth;

public class ThreadExecutor {

    private class AccountThread extends Thread {
        private Account account;
        private int value;

        public AccountThread(Account account, int value) {
            this.account = account;
            this.value = value;
        }

        @Override
        public void run() {
            System.out.println(this.getName() + " start");
            while(!isInterrupted()) {
                try {
                    account.addToBalance(value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.getName() + " end");
        }
    }

    public void showAccountFilling(long millis) throws InterruptedException {
        Account account = new Account(0);

        Thread thread1 = new AccountThread(account, 1);
        Thread thread2 = new AccountThread(account, 10);
        Thread thread3 = new AccountThread(account, -2);

        thread1.start();
        thread2.start();
        thread3.start();


        Thread.sleep(millis);


        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();

        System.out.println(account.toString());
    }

}
